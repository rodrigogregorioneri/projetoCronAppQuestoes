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
  @Qualifier("OpcaoPerguntasBusiness")
  private OpcaoPerguntasBusiness opcaoPerguntasBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("PerguntaBusiness")
  private PerguntaBusiness perguntaBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("RespostasOpcaoPerguntasBusiness")
  private RespostasOpcaoPerguntasBusiness respostasOpcaoPerguntasBusiness;

  /**
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
  @RequestMapping(method = RequestMethod.GET, value="/{respostasId}/RespostasOpcaoPerguntas")    
  public HttpEntity<PagedResources<RespostasOpcaoPerguntas>> findRespostasOpcaoPerguntas(@PathVariable("respostasId") java.lang.String respostasId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(respostasBusiness.findRespostasOpcaoPerguntas(respostasId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{respostasId}/RespostasOpcaoPerguntas/{respostasOpcaoPerguntasId}")    
  public void deleteRespostasOpcaoPerguntas(@PathVariable("respostasOpcaoPerguntasId") java.lang.String respostasOpcaoPerguntasId) throws Exception {
    this.respostasOpcaoPerguntasBusiness.delete(respostasOpcaoPerguntasId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{respostasId}/RespostasOpcaoPerguntas")
  public RespostasOpcaoPerguntas putRespostasOpcaoPerguntas(@Validated @RequestBody final RespostasOpcaoPerguntas entity, @PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    return this.respostasOpcaoPerguntasBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{respostasId}/RespostasOpcaoPerguntas")
  public RespostasOpcaoPerguntas postRespostasOpcaoPerguntas(@Validated @RequestBody final RespostasOpcaoPerguntas entity, @PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    Respostas respostas = this.respostasBusiness.get(respostasId);
    entity.setRespostas(respostas);
    return this.respostasOpcaoPerguntasBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{respostasId}/PerguntaRespostas")    
  public HttpEntity<PagedResources<PerguntaRespostas>> findPerguntaRespostas(@PathVariable("respostasId") java.lang.String respostasId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(respostasBusiness.findPerguntaRespostas(respostasId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{respostasId}/PerguntaRespostas/{perguntaRespostasId}")    
  public void deletePerguntaRespostas(@PathVariable("perguntaRespostasId") java.lang.String perguntaRespostasId) throws Exception {
    this.perguntaRespostasBusiness.delete(perguntaRespostasId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{respostasId}/PerguntaRespostas")
  public PerguntaRespostas putPerguntaRespostas(@Validated @RequestBody final PerguntaRespostas entity, @PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    return this.perguntaRespostasBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{respostasId}/PerguntaRespostas")
  public PerguntaRespostas postPerguntaRespostas(@Validated @RequestBody final PerguntaRespostas entity, @PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    Respostas respostas = this.respostasBusiness.get(respostasId);
    entity.setRespostas(respostas);
    return this.perguntaRespostasBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{respostasId}/OpcaoPerguntas")
  public HttpEntity<PagedResources<OpcaoPerguntas>> listOpcaoPerguntas(@PathVariable("respostasId") java.lang.String respostasId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(respostasBusiness.listOpcaoPerguntas(respostasId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{respostasId}/OpcaoPerguntas")
  public Respostas postOpcaoPerguntas(@Validated @RequestBody final OpcaoPerguntas entity, @PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    RespostasOpcaoPerguntas newRespostasOpcaoPerguntas = new RespostasOpcaoPerguntas();

    Respostas respostas = this.respostasBusiness.get(respostasId);

    newRespostasOpcaoPerguntas.setOpcaoPerguntas(entity);
    newRespostasOpcaoPerguntas.setRespostas(respostas);
    
    this.respostasOpcaoPerguntasBusiness.post(newRespostasOpcaoPerguntas);

    return newRespostasOpcaoPerguntas.getRespostas();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{respostasId}/OpcaoPerguntas/{OpcaoPerguntasId}")
  public void deleteOpcaoPerguntas(@PathVariable("respostasId") java.lang.String respostasId, @PathVariable("OpcaoPerguntasId") java.lang.String OpcaoPerguntasId) {
    this.respostasBusiness.deleteOpcaoPerguntas(respostasId, OpcaoPerguntasId);
  }  

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{respostasId}/Pergunta")
  public HttpEntity<PagedResources<Pergunta>> listPergunta(@PathVariable("respostasId") java.lang.String respostasId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(respostasBusiness.listPergunta(respostasId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{respostasId}/Pergunta")
  public Respostas postPergunta(@Validated @RequestBody final Pergunta entity, @PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    PerguntaRespostas newPerguntaRespostas = new PerguntaRespostas();

    Respostas respostas = this.respostasBusiness.get(respostasId);

    newPerguntaRespostas.setPergunta(entity);
    newPerguntaRespostas.setRespostas(respostas);
    
    this.perguntaRespostasBusiness.post(newPerguntaRespostas);

    return newPerguntaRespostas.getRespostas();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{respostasId}/Pergunta/{PerguntaId}")
  public void deletePergunta(@PathVariable("respostasId") java.lang.String respostasId, @PathVariable("PerguntaId") java.lang.String PerguntaId) {
    this.respostasBusiness.deletePergunta(respostasId, PerguntaId);
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
   * Foreign Key profissionais
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Profissionais/{profissionaisId}")    
  public HttpEntity<PagedResources<Respostas>> findRespostassByProfissionais(@PathVariable("profissionaisId") java.lang.String profissionaisId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(respostasBusiness.findRespostassByProfissionais(profissionaisId, pageable)), HttpStatus.OK);
  }
}
