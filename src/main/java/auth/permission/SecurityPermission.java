package auth.permission;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Component;

/**
 * Classe que configura as permissões de acesso
 * @generated
 */
@Component
public class SecurityPermission {

  //static
		public static final String ROLE_ADMIN_NAME = "Administrators";
	public static final String ROLE_PUBLIC_NAME = "Public";
	
  public void loadSecurityPermission(HttpSecurity http) throws Exception {
    
	// public
    http.authorizeRequests().antMatchers("/auth/**").permitAll();
    http.authorizeRequests().antMatchers("/components/**").permitAll();
    http.authorizeRequests().antMatchers("/css/**").permitAll();
    http.authorizeRequests().antMatchers("/favicon.ico").permitAll();
    http.authorizeRequests().antMatchers("/i18n/**").permitAll();
    http.authorizeRequests().antMatchers("/img/**").permitAll();
    http.authorizeRequests().antMatchers("/index.html").permitAll();
    http.authorizeRequests().antMatchers("/js/**").permitAll();
    http.authorizeRequests().antMatchers("/lib/**").permitAll();
    http.authorizeRequests().antMatchers("/plugins/**").permitAll();
    http.authorizeRequests().antMatchers("/views/error/**").permitAll();
    http.authorizeRequests().antMatchers("/views/login.view.html").permitAll();
    http.authorizeRequests().antMatchers("/views/cadastrar.view.html").permitAll();
    
	// role hasAuthority permission
    http.authorizeRequests().antMatchers("/api/cronapi/**").hasAuthority(ROLE_ADMIN_NAME);
    http.authorizeRequests().antMatchers("/api/security/**").hasAuthority(ROLE_ADMIN_NAME);
    
    http.authorizeRequests().antMatchers("/public/**").hasAuthority(ROLE_PUBLIC_NAME);
    http.authorizeRequests().antMatchers("/views/admin/**").hasAuthority(ROLE_ADMIN_NAME);
    http.authorizeRequests().antMatchers("/views/logged/**").hasAuthority(ROLE_ADMIN_NAME);
    
    

    http.authorizeRequests().antMatchers("/views/public/**").hasAuthority(ROLE_PUBLIC_NAME);
    http.authorizeRequests().antMatchers("#/views/logged/home.view.html").authenticated();
    http.authorizeRequests().antMatchers("/views/public/formularioPesquisa.view.html").hasAuthority(ROLE_PUBLIC_NAME);
	
    // autenticated
    http.authorizeRequests().antMatchers("/api/rest/**").authenticated();
    http.authorizeRequests().antMatchers("POST", "/changePassword").authenticated();
    http.authorizeRequests().antMatchers("POST", "/changeTheme").authenticated();
    
	// deny all
    http.authorizeRequests().antMatchers("/**").denyAll();
    
  }
}