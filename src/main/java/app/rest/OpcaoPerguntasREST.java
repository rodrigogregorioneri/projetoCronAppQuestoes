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
 * Controller para expor serviços REST de OpcaoPerguntas
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/app/OpcaoPerguntas")
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
  @Qualifier("RespostasBusiness")
  private RespostasBusiness respostasBusiness;

  /**
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
  @RequestMapping(method = RequestMethod.GET, value="/{opcaoPerguntasId}/RespostasOpcaoPerguntas")    
  public HttpEntity<PagedResources<RespostasOpcaoPerguntas>> findRespostasOpcaoPerguntas(@PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(opcaoPerguntasBusiness.findRespostasOpcaoPerguntas(opcaoPerguntasId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{opcaoPerguntasId}/RespostasOpcaoPerguntas/{respostasOpcaoPerguntasId}")    
  public void deleteRespostasOpcaoPerguntas(@PathVariable("respostasOpcaoPerguntasId") java.lang.String respostasOpcaoPerguntasId) throws Exception {
    this.respostasOpcaoPerguntasBusiness.delete(respostasOpcaoPerguntasId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{opcaoPerguntasId}/RespostasOpcaoPerguntas")
  public RespostasOpcaoPerguntas putRespostasOpcaoPerguntas(@Validated @RequestBody final RespostasOpcaoPerguntas entity, @PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId) throws Exception {
    return this.respostasOpcaoPerguntasBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{opcaoPerguntasId}/RespostasOpcaoPerguntas")
  public RespostasOpcaoPerguntas postRespostasOpcaoPerguntas(@Validated @RequestBody final RespostasOpcaoPerguntas entity, @PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId) throws Exception {
    OpcaoPerguntas opcaoPerguntas = this.opcaoPerguntasBusiness.get(opcaoPerguntasId);
    entity.setOpcaoPerguntas(opcaoPerguntas);
    return this.respostasOpcaoPerguntasBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{opcaoPerguntasId}/Respostas")
  public HttpEntity<PagedResources<Respostas>> listRespostas(@PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(opcaoPerguntasBusiness.listRespostas(opcaoPerguntasId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{opcaoPerguntasId}/Respostas")
  public OpcaoPerguntas postRespostas(@Validated @RequestBody final Respostas entity, @PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId) throws Exception {
    RespostasOpcaoPerguntas newRespostasOpcaoPerguntas = new RespostasOpcaoPerguntas();

    OpcaoPerguntas opcaoPerguntas = this.opcaoPerguntasBusiness.get(opcaoPerguntasId);

    newRespostasOpcaoPerguntas.setRespostas(entity);
    newRespostasOpcaoPerguntas.setOpcaoPerguntas(opcaoPerguntas);
    
    this.respostasOpcaoPerguntasBusiness.post(newRespostasOpcaoPerguntas);

    return newRespostasOpcaoPerguntas.getOpcaoPerguntas();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{opcaoPerguntasId}/Respostas/{RespostasId}")
  public void deleteRespostas(@PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId, @PathVariable("RespostasId") java.lang.String RespostasId) {
    this.opcaoPerguntasBusiness.deleteRespostas(opcaoPerguntasId, RespostasId);
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
}
