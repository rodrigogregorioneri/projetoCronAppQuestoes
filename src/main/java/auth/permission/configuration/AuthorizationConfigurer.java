package auth.permission.configuration;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import app.dao.UserDAO;
import app.entity.User;
import auth.permission.SecurityPermission;

/**
 * Classe que configura o WebSecurity, possibilitando requerer que o
 * usuário esteja logado para acessar qualquer usuário
 * 
 * @author Techne
 *
 */
@Configuration
@EnableWebSecurity
public class AuthorizationConfigurer extends WebSecurityConfigurerAdapter {

	/**
	 * Instância do authenticationProvider
	 * 
	 * @see auth.permission.AuthenticationConfigurer
	 */
	@Autowired
	private AuthenticationConfigurer authenticationProvider;

	@Autowired
	private SecurityPermission securityPermission;

	@Autowired
	private UserDAO userRepository;

	/**
	 * Método que configura o SpringSecurite com o authenticationProvider,
	 * responsável também pela criação da base inicial, caso não exista nenhuma
	 * permissão cadastrada
	 * 
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider);
	}

	/**
	 * Configurações default para WebSecurity
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// post sem csrf
		http.csrf().disable();

		// session manager
		http.sessionManagement().maximumSessions(1).maxSessionsPreventsLogin(false).expiredUrl("/index.html").and()
				.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED).invalidSessionUrl("/index.html");

		// load Security Permission
		securityPermission.loadSecurityPermission(http);

		// login/logout
		http.formLogin().loginProcessingUrl("/auth").loginPage("/index.html").successHandler(successHandler())
				.failureHandler(failureHandler()).and().logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).invalidateHttpSession(true);

		// x-frame-options disable        
		http.headers().frameOptions().disable().httpStrictTransportSecurity().disable();

	}

	/**
	 * Handler para sucesso de autorização
	 */
	private AuthenticationSuccessHandler successHandler() {
		return new AuthenticationSuccessHandler() {
			@Override
			public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse resp,
					Authentication authentication) throws IOException, ServletException {

				HttpSession session = req.getSession();
				org.springframework.security.core.userdetails.User authUser = (org.springframework.security.core.userdetails.User) SecurityContextHolder
						.getContext().getAuthentication().getPrincipal();
				session.setAttribute("username", authUser.getUsername());
				session.setAttribute("authorities", authentication.getAuthorities());

				resp.setStatus(HttpServletResponse.SC_OK);

				String roles = authUser.getAuthorities().toString().replaceFirst("\\[", "").replaceFirst("\\]", "");

				List<User> users = userRepository.findByLogin(authUser.getUsername(), new PageRequest(0, 100))
						.getContent();

				if (users.isEmpty()) {
					throw new UsernameNotFoundException("User not Found!");
				}

				Gson gson = new Gson();
				User user = users.get(0);
				user.setPassword(null);

				JsonObject json = new JsonObject();
				json.add("user", gson.toJsonTree(users.get(0)));
				json.addProperty("roles", roles);
				json.addProperty("root", roles.contains(SecurityPermission.ROLE_ADMIN_NAME));

				System.out.println(json.toString());
				resp.getOutputStream().print(json.toString());
				resp.setHeader("Content-Type", "application/json");

			}

		};
	}

	/**
	 * Handler para falha de autorização
	 */
	private AuthenticationFailureHandler failureHandler() {
		return new AuthenticationFailureHandler() {
			@Override
			public void onAuthenticationFailure(HttpServletRequest hsr, HttpServletResponse hsr1,
					AuthenticationException ae) throws IOException, ServletException {
				hsr1.setStatus(HttpStatus.UNAUTHORIZED.value());
			}
		};
	}

}
