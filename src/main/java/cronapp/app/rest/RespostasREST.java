package cronapp.app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import cronapp.app.entity.*;
import cronapp.app.business.*;

/**
 * Controller para expor serviços REST de Respostas
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/Respostas")
public class RespostasREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("RespostasBusiness")
  private RespostasBusiness respostasBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("ProfissionaisBusiness")
  private ProfissionaisBusiness profissionaisBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Respostas post(@Validated @RequestBody final Respostas entity) throws Exception {
    return respostasBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Respostas put(@Validated @RequestBody final Respostas entity) throws Exception {
    return respostasBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{respostasId}")
  public Respostas put(@Validated @RequestBody final Respostas entity, @PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    return respostasBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{respostasId}")
  public void delete(@PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    respostasBusiness.delete(respostasId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Respostas>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(respostasBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{respostasId}/Profissionais")    
  public HttpEntity<PagedResources<Profissionais>> findProfissionais(@PathVariable("respostasId") java.lang.String respostasId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(respostasBusiness.findProfissionais(respostasId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{respostasId}/Profissionais/{profissionaisId}")    
  public void deleteProfissionais(@PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    this.profissionaisBusiness.delete(profissionaisId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{respostasId}/Profissionais")
  public Profissionais putProfissionais(@Validated @RequestBody final Profissionais entity, @PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    return this.profissionaisBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{respostasId}/Profissionais")
  public Profissionais postProfissionais(@Validated @RequestBody final Profissionais entity, @PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    Respostas respostas = this.respostasBusiness.get(respostasId);
    entity.setRespostas(respostas);
    return this.profissionaisBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{respostasId}")
  public Respostas get(@PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    return respostasBusiness.get(respostasId);
  }

  /**
   * Foreign Key pergunta
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Pergunta/{perguntaId}")    
  public HttpEntity<PagedResources<Respostas>> findRespostassByPergunta(@PathVariable("perguntaId") java.lang.String perguntaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(respostasBusiness.findRespostassByPergunta(perguntaId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key opcaoPerguntas
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/OpcaoPerguntas/{opcaoPerguntasId}")    
  public HttpEntity<PagedResources<Respostas>> findRespostassByOpcaoPerguntas(@PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(respostasBusiness.findRespostassByOpcaoPerguntas(opcaoPerguntasId, pageable)), HttpStatus.OK);
  }
}
