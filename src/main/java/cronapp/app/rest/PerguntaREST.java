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
 * Controller para expor serviços REST de Pergunta
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/Pergunta")
public class PerguntaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("PerguntaBusiness")
  private PerguntaBusiness perguntaBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("PesquisaBusiness")
  private PesquisaBusiness pesquisaBusiness;

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
  @Qualifier("RespostasBusiness")
  private RespostasBusiness respostasBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Pergunta post(@Validated @RequestBody final Pergunta entity) throws Exception {
    return perguntaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Pergunta put(@Validated @RequestBody final Pergunta entity) throws Exception {
    return perguntaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{perguntaId}")
  public Pergunta put(@Validated @RequestBody final Pergunta entity, @PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    return perguntaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{perguntaId}")
  public void delete(@PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    perguntaBusiness.delete(perguntaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Pergunta>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(perguntaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{perguntaId}/OpcaoPerguntas")    
  public HttpEntity<PagedResources<OpcaoPerguntas>> findOpcaoPerguntas(@PathVariable("perguntaId") java.lang.String perguntaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(perguntaBusiness.findOpcaoPerguntas(perguntaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{perguntaId}/OpcaoPerguntas/{opcaoPerguntasId}")    
  public void deleteOpcaoPerguntas(@PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId) throws Exception {
    this.opcaoPerguntasBusiness.delete(opcaoPerguntasId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{perguntaId}/OpcaoPerguntas")
  public OpcaoPerguntas putOpcaoPerguntas(@Validated @RequestBody final OpcaoPerguntas entity, @PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    return this.opcaoPerguntasBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{perguntaId}/OpcaoPerguntas")
  public OpcaoPerguntas postOpcaoPerguntas(@Validated @RequestBody final OpcaoPerguntas entity, @PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    Pergunta pergunta = this.perguntaBusiness.get(perguntaId);
    entity.setPergunta(pergunta);
    return this.opcaoPerguntasBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{perguntaId}/Respostas")    
  public HttpEntity<PagedResources<Respostas>> findRespostas(@PathVariable("perguntaId") java.lang.String perguntaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(perguntaBusiness.findRespostas(perguntaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{perguntaId}/Respostas/{respostasId}")    
  public void deleteRespostas(@PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    this.respostasBusiness.delete(respostasId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{perguntaId}/Respostas")
  public Respostas putRespostas(@Validated @RequestBody final Respostas entity, @PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    return this.respostasBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{perguntaId}/Respostas")
  public Respostas postRespostas(@Validated @RequestBody final Respostas entity, @PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    Pergunta pergunta = this.perguntaBusiness.get(perguntaId);
    entity.setPergunta(pergunta);
    return this.respostasBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{perguntaId}/Pesquisa")
  public HttpEntity<PagedResources<Pesquisa>> listPesquisa(@PathVariable("perguntaId") java.lang.String perguntaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(perguntaBusiness.listPesquisa(perguntaId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{perguntaId}/Pesquisa")
  public Pergunta postPesquisa(@Validated @RequestBody final Pesquisa entity, @PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    OpcaoPerguntas newOpcaoPerguntas = new OpcaoPerguntas();

    Pergunta pergunta = this.perguntaBusiness.get(perguntaId);

    newOpcaoPerguntas.setPesquisa(entity);
    newOpcaoPerguntas.setPergunta(pergunta);
    
    this.opcaoPerguntasBusiness.post(newOpcaoPerguntas);

    return newOpcaoPerguntas.getPergunta();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{perguntaId}/Pesquisa/{PesquisaId}")
  public void deletePesquisa(@PathVariable("perguntaId") java.lang.String perguntaId, @PathVariable("PesquisaId") java.lang.String PesquisaId) {
    this.perguntaBusiness.deletePesquisa(perguntaId, PesquisaId);
  }  

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{perguntaId}/OpcaoPerguntas_2")
  public HttpEntity<PagedResources<OpcaoPerguntas>> listOpcaoPerguntas_2(@PathVariable("perguntaId") java.lang.String perguntaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(perguntaBusiness.listOpcaoPerguntas_2(perguntaId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{perguntaId}/OpcaoPerguntas_2")
  public Pergunta postOpcaoPerguntas_2(@Validated @RequestBody final OpcaoPerguntas entity, @PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    Respostas newRespostas = new Respostas();

    Pergunta pergunta = this.perguntaBusiness.get(perguntaId);

    newRespostas.setOpcaoPerguntas(entity);
    newRespostas.setPergunta(pergunta);
    
    this.respostasBusiness.post(newRespostas);

    return newRespostas.getPergunta();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{perguntaId}/OpcaoPerguntas_2/{OpcaoPerguntas_2Id}")
  public void deleteOpcaoPerguntas_2(@PathVariable("perguntaId") java.lang.String perguntaId, @PathVariable("OpcaoPerguntas_2Id") java.lang.String OpcaoPerguntas_2Id) {
    this.perguntaBusiness.deleteOpcaoPerguntas_2(perguntaId, OpcaoPerguntas_2Id);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{perguntaId}")
  public Pergunta get(@PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    return perguntaBusiness.get(perguntaId);
  }
}
