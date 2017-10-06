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
 * Controller para expor serviços REST de PerguntaRespostas
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/app/PerguntaRespostas")
public class PerguntaRespostasREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("PerguntaRespostasBusiness")
  private PerguntaRespostasBusiness perguntaRespostasBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public PerguntaRespostas post(@Validated @RequestBody final PerguntaRespostas entity) throws Exception {
    return perguntaRespostasBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public PerguntaRespostas put(@Validated @RequestBody final PerguntaRespostas entity) throws Exception {
    return perguntaRespostasBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{perguntaRespostasId}")
  public PerguntaRespostas put(@Validated @RequestBody final PerguntaRespostas entity, @PathVariable("perguntaRespostasId") java.lang.String perguntaRespostasId) throws Exception {
    return perguntaRespostasBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{perguntaRespostasId}")
  public void delete(@PathVariable("perguntaRespostasId") java.lang.String perguntaRespostasId) throws Exception {
    perguntaRespostasBusiness.delete(perguntaRespostasId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<PerguntaRespostas>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(perguntaRespostasBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{perguntaRespostasId}")
  public PerguntaRespostas get(@PathVariable("perguntaRespostasId") java.lang.String perguntaRespostasId) throws Exception {
    return perguntaRespostasBusiness.get(perguntaRespostasId);
  }

  /**
   * Foreign Key pergunta
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Pergunta/{perguntaId}")    
  public HttpEntity<PagedResources<PerguntaRespostas>> findPerguntaRespostassByPergunta(@PathVariable("perguntaId") java.lang.String perguntaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(perguntaRespostasBusiness.findPerguntaRespostassByPergunta(perguntaId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key respostas
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Respostas/{respostasId}")    
  public HttpEntity<PagedResources<PerguntaRespostas>> findPerguntaRespostassByRespostas(@PathVariable("respostasId") java.lang.String respostasId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(perguntaRespostasBusiness.findPerguntaRespostassByRespostas(respostasId, pageable)), HttpStatus.OK);
  }
}
