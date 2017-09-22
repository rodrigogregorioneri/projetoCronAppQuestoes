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
 * Controller para expor serviços REST de Pesquisa
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/Pesquisa")
public class PesquisaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("PesquisaBusiness")
  private PesquisaBusiness pesquisaBusiness;

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
  @Qualifier("OpcaoPerguntasBusiness")
  private OpcaoPerguntasBusiness opcaoPerguntasBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Pesquisa post(@Validated @RequestBody final Pesquisa entity) throws Exception {
    return pesquisaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Pesquisa put(@Validated @RequestBody final Pesquisa entity) throws Exception {
    return pesquisaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{pesquisaId}")
  public Pesquisa put(@Validated @RequestBody final Pesquisa entity, @PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    return pesquisaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{pesquisaId}")
  public void delete(@PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    pesquisaBusiness.delete(pesquisaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Pesquisa>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(pesquisaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{pesquisaId}/OpcaoPerguntas")    
  public HttpEntity<PagedResources<OpcaoPerguntas>> findOpcaoPerguntas(@PathVariable("pesquisaId") java.lang.String pesquisaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(pesquisaBusiness.findOpcaoPerguntas(pesquisaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{pesquisaId}/OpcaoPerguntas/{opcaoPerguntasId}")    
  public void deleteOpcaoPerguntas(@PathVariable("opcaoPerguntasId") java.lang.String opcaoPerguntasId) throws Exception {
    this.opcaoPerguntasBusiness.delete(opcaoPerguntasId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{pesquisaId}/OpcaoPerguntas")
  public OpcaoPerguntas putOpcaoPerguntas(@Validated @RequestBody final OpcaoPerguntas entity, @PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    return this.opcaoPerguntasBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{pesquisaId}/OpcaoPerguntas")
  public OpcaoPerguntas postOpcaoPerguntas(@Validated @RequestBody final OpcaoPerguntas entity, @PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    Pesquisa pesquisa = this.pesquisaBusiness.get(pesquisaId);
    entity.setPesquisa(pesquisa);
    return this.opcaoPerguntasBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{pesquisaId}/Pergunta")
  public HttpEntity<PagedResources<Pergunta>> listPergunta(@PathVariable("pesquisaId") java.lang.String pesquisaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(pesquisaBusiness.listPergunta(pesquisaId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{pesquisaId}/Pergunta")
  public Pesquisa postPergunta(@Validated @RequestBody final Pergunta entity, @PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    OpcaoPerguntas newOpcaoPerguntas = new OpcaoPerguntas();

    Pesquisa pesquisa = this.pesquisaBusiness.get(pesquisaId);

    newOpcaoPerguntas.setPergunta(entity);
    newOpcaoPerguntas.setPesquisa(pesquisa);
    
    this.opcaoPerguntasBusiness.post(newOpcaoPerguntas);

    return newOpcaoPerguntas.getPesquisa();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{pesquisaId}/Pergunta/{PerguntaId}")
  public void deletePergunta(@PathVariable("pesquisaId") java.lang.String pesquisaId, @PathVariable("PerguntaId") java.lang.String PerguntaId) {
    this.pesquisaBusiness.deletePergunta(pesquisaId, PerguntaId);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{pesquisaId}")
  public Pesquisa get(@PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    return pesquisaBusiness.get(pesquisaId);
  }
}
