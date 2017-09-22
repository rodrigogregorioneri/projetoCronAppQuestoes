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
 * Controller para expor serviços REST de OpcaoPerguntas
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/OpcaoPerguntas")
public class OpcaoPerguntasREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
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
  @Qualifier("RespostasBusiness")
  private RespostasBusiness respostasBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public OpcaoPerguntas post(@Validated @RequestBody final OpcaoPerguntas entity) throws Exception {
    return opcaoPerguntasBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public OpcaoPerguntas put(@Validated @RequestBody final OpcaoPerguntas entity) throws Exception {
    return opcaoPerguntasBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{opcaoPerguntasId}")
  public OpcaoPerguntas put(@Validated @RequestBody final OpcaoPerguntas entity, @PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId) throws Exception {
    return opcaoPerguntasBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{opcaoPerguntasId}")
  public void delete(@PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId) throws Exception {
    opcaoPerguntasBusiness.delete(opcaoPerguntasId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<OpcaoPerguntas>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(opcaoPerguntasBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{opcaoPerguntasId}/Respostas")    
  public HttpEntity<PagedResources<Respostas>> findRespostas(@PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(opcaoPerguntasBusiness.findRespostas(opcaoPerguntasId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{opcaoPerguntasId}/Respostas/{respostasId}")    
  public void deleteRespostas(@PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    this.respostasBusiness.delete(respostasId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{opcaoPerguntasId}/Respostas")
  public Respostas putRespostas(@Validated @RequestBody final Respostas entity, @PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId) throws Exception {
    return this.respostasBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{opcaoPerguntasId}/Respostas")
  public Respostas postRespostas(@Validated @RequestBody final Respostas entity, @PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId) throws Exception {
    OpcaoPerguntas opcaoPerguntas = this.opcaoPerguntasBusiness.get(opcaoPerguntasId);
    entity.setOpcaoPerguntas(opcaoPerguntas);
    return this.respostasBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{opcaoPerguntasId}/Pergunta")
  public HttpEntity<PagedResources<Pergunta>> listPergunta(@PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(opcaoPerguntasBusiness.listPergunta(opcaoPerguntasId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{opcaoPerguntasId}/Pergunta")
  public OpcaoPerguntas postPergunta(@Validated @RequestBody final Pergunta entity, @PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId) throws Exception {
    Respostas newRespostas = new Respostas();

    OpcaoPerguntas opcaoPerguntas = this.opcaoPerguntasBusiness.get(opcaoPerguntasId);

    newRespostas.setPergunta(entity);
    newRespostas.setOpcaoPerguntas(opcaoPerguntas);
    
    this.respostasBusiness.post(newRespostas);

    return newRespostas.getOpcaoPerguntas();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{opcaoPerguntasId}/Pergunta/{PerguntaId}")
  public void deletePergunta(@PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId, @PathVariable("PerguntaId") java.lang.String PerguntaId) {
    this.opcaoPerguntasBusiness.deletePergunta(opcaoPerguntasId, PerguntaId);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{opcaoPerguntasId}")
  public OpcaoPerguntas get(@PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId) throws Exception {
    return opcaoPerguntasBusiness.get(opcaoPerguntasId);
  }

  /**
   * Foreign Key pergunta
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Pergunta/{perguntaId}")    
  public HttpEntity<PagedResources<OpcaoPerguntas>> findOpcaoPerguntassByPergunta(@PathVariable("perguntaId") java.lang.String perguntaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(opcaoPerguntasBusiness.findOpcaoPerguntassByPergunta(perguntaId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key pesquisa
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Pesquisa/{pesquisaId}")    
  public HttpEntity<PagedResources<OpcaoPerguntas>> findOpcaoPerguntassByPesquisa(@PathVariable("pesquisaId") java.lang.String pesquisaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(opcaoPerguntasBusiness.findOpcaoPerguntassByPesquisa(pesquisaId, pageable)), HttpStatus.OK);
  }
}
