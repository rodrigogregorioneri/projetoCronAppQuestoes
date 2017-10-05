package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de RespostasOpcaoPerguntas
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/app/RespostasOpcaoPerguntas")
public class RespostasOpcaoPerguntasREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("RespostasOpcaoPerguntasBusiness")
  private RespostasOpcaoPerguntasBusiness respostasOpcaoPerguntasBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public RespostasOpcaoPerguntas post(@Validated @RequestBody final RespostasOpcaoPerguntas entity) throws Exception {
    return respostasOpcaoPerguntasBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public RespostasOpcaoPerguntas put(@Validated @RequestBody final RespostasOpcaoPerguntas entity) throws Exception {
    return respostasOpcaoPerguntasBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{respostasOpcaoPerguntasId}")
  public RespostasOpcaoPerguntas put(@Validated @RequestBody final RespostasOpcaoPerguntas entity, @PathVariable("respostasOpcaoPerguntasId") java.lang.String respostasOpcaoPerguntasId) throws Exception {
    return respostasOpcaoPerguntasBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{respostasOpcaoPerguntasId}")
  public void delete(@PathVariable("respostasOpcaoPerguntasId") java.lang.String respostasOpcaoPerguntasId) throws Exception {
    respostasOpcaoPerguntasBusiness.delete(respostasOpcaoPerguntasId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<RespostasOpcaoPerguntas>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(respostasOpcaoPerguntasBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{respostasOpcaoPerguntasId}")
  public RespostasOpcaoPerguntas get(@PathVariable("respostasOpcaoPerguntasId") java.lang.String respostasOpcaoPerguntasId) throws Exception {
    return respostasOpcaoPerguntasBusiness.get(respostasOpcaoPerguntasId);
  }

  /**
   * Foreign Key respostas
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Respostas/{respostasId}")    
  public HttpEntity<PagedResources<RespostasOpcaoPerguntas>> findRespostasOpcaoPerguntassByRespostas(@PathVariable("respostasId") java.lang.String respostasId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(respostasOpcaoPerguntasBusiness.findRespostasOpcaoPerguntassByRespostas(respostasId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key opcaoPerguntas
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/OpcaoPerguntas/{opcaoPerguntasId}")    
  public HttpEntity<PagedResources<RespostasOpcaoPerguntas>> findRespostasOpcaoPerguntassByOpcaoPerguntas(@PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(respostasOpcaoPerguntasBusiness.findRespostasOpcaoPerguntassByOpcaoPerguntas(opcaoPerguntasId, pageable)), HttpStatus.OK);
  }
}
