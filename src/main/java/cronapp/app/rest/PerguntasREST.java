package cronapp.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cronapp.app.business.OpcaoPerguntasBusiness;
import cronapp.app.business.PerguntaBusiness;
import cronapp.app.entity.Pergunta;

/**
 * Classe que representa ...
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @since 2017-09-27
 *
 */
 

@RestController
@RequestMapping(value = "/api/rest/Perguntas") 
public class PerguntasREST {


  @Autowired
  @Qualifier("PerguntaBusiness")
  private PerguntaBusiness perguntaBusiness;
  
  
  @Autowired
  @Qualifier("OpcaoPerguntasBusiness")
  private OpcaoPerguntasBusiness opcoesPerguntasBusiness;


	@RequestMapping(method = RequestMethod.GET, value = "/perguntas/todasPerguntas")
	public HttpEntity<PagedResources<Pergunta>> listPerguntas(Pageable pageable, PagedResourcesAssembler assembler) {
		 return new ResponseEntity<>(assembler.toResource(perguntaBusiness.list( pageable)), HttpStatus.OK);
	}
	


}
