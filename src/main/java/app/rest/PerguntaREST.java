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
 * Controller para expor serviços REST de Pergunta
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/app/Pergunta")
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
  @Qualifier("PerguntaRespostasBusiness")
  private PerguntaRespostasBusiness perguntaRespostasBusiness;

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
  @RequestMapping(method = RequestMethod.GET, value="/{perguntaId}/PerguntaRespostas")    
  public HttpEntity<PagedResources<PerguntaRespostas>> findPerguntaRespostas(@PathVariable("perguntaId") java.lang.String perguntaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(perguntaBusiness.findPerguntaRespostas(perguntaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{perguntaId}/PerguntaRespostas/{perguntaRespostasId}")    
  public void deletePerguntaRespostas(@PathVariable("perguntaRespostasId") java.lang.String perguntaRespostasId) throws Exception {
    this.perguntaRespostasBusiness.delete(perguntaRespostasId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{perguntaId}/PerguntaRespostas")
  public PerguntaRespostas putPerguntaRespostas(@Validated @RequestBody final PerguntaRespostas entity, @PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    return this.perguntaRespostasBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{perguntaId}/PerguntaRespostas")
  public PerguntaRespostas postPerguntaRespostas(@Validated @RequestBody final PerguntaRespostas entity, @PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    Pergunta pergunta = this.perguntaBusiness.get(perguntaId);
    entity.setPergunta(pergunta);
    return this.perguntaRespostasBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{perguntaId}/Respostas")
  public HttpEntity<PagedResources<Respostas>> listRespostas(@PathVariable("perguntaId") java.lang.String perguntaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(perguntaBusiness.listRespostas(perguntaId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{perguntaId}/Respostas")
  public Pergunta postRespostas(@Validated @RequestBody final Respostas entity, @PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    PerguntaRespostas newPerguntaRespostas = new PerguntaRespostas();

    Pergunta pergunta = this.perguntaBusiness.get(perguntaId);

    newPerguntaRespostas.setRespostas(entity);
    newPerguntaRespostas.setPergunta(pergunta);
    
    this.perguntaRespostasBusiness.post(newPerguntaRespostas);

    return newPerguntaRespostas.getPergunta();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{perguntaId}/Respostas/{RespostasId}")
  public void deleteRespostas(@PathVariable("perguntaId") java.lang.String perguntaId, @PathVariable("RespostasId") java.lang.String RespostasId) {
    this.perguntaBusiness.deleteRespostas(perguntaId, RespostasId);
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

  /**
   * Foreign Key pesquisa
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Pesquisa/{pesquisaId}")    
  public HttpEntity<PagedResources<Pergunta>> findPerguntasByPesquisa(@PathVariable("pesquisaId") java.lang.String pesquisaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(perguntaBusiness.findPerguntasByPesquisa(pesquisaId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key componente
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Componente/{componenteId}")    
  public HttpEntity<PagedResources<Pergunta>> findPerguntasByComponente(@PathVariable("componenteId") java.lang.String componenteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(perguntaBusiness.findPerguntasByComponente(componenteId, pageable)), HttpStatus.OK);
  }
}
