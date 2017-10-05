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
 * Controller para expor serviços REST de Componente
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/app/Componente")
public class ComponenteREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ComponenteBusiness")
  private ComponenteBusiness componenteBusiness;

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
  @Qualifier("PerguntaBusiness")
  private PerguntaBusiness perguntaBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Componente post(@Validated @RequestBody final Componente entity) throws Exception {
    return componenteBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Componente put(@Validated @RequestBody final Componente entity) throws Exception {
    return componenteBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{componenteId}")
  public Componente put(@Validated @RequestBody final Componente entity, @PathVariable("componenteId") java.lang.String componenteId) throws Exception {
    return componenteBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{componenteId}")
  public void delete(@PathVariable("componenteId") java.lang.String componenteId) throws Exception {
    componenteBusiness.delete(componenteId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Componente>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(componenteBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{componenteId}/Pergunta")    
  public HttpEntity<PagedResources<Pergunta>> findPergunta(@PathVariable("componenteId") java.lang.String componenteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(componenteBusiness.findPergunta(componenteId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{componenteId}/Pergunta/{perguntaId}")    
  public void deletePergunta(@PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    this.perguntaBusiness.delete(perguntaId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{componenteId}/Pergunta")
  public Pergunta putPergunta(@Validated @RequestBody final Pergunta entity, @PathVariable("componenteId") java.lang.String componenteId) throws Exception {
    return this.perguntaBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{componenteId}/Pergunta")
  public Pergunta postPergunta(@Validated @RequestBody final Pergunta entity, @PathVariable("componenteId") java.lang.String componenteId) throws Exception {
    Componente componente = this.componenteBusiness.get(componenteId);
    entity.setComponente(componente);
    return this.perguntaBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{componenteId}/Pesquisa")
  public HttpEntity<PagedResources<Pesquisa>> listPesquisa(@PathVariable("componenteId") java.lang.String componenteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(componenteBusiness.listPesquisa(componenteId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{componenteId}/Pesquisa")
  public Componente postPesquisa(@Validated @RequestBody final Pesquisa entity, @PathVariable("componenteId") java.lang.String componenteId) throws Exception {
    Pergunta newPergunta = new Pergunta();

    Componente componente = this.componenteBusiness.get(componenteId);

    newPergunta.setPesquisa(entity);
    newPergunta.setComponente(componente);
    
    this.perguntaBusiness.post(newPergunta);

    return newPergunta.getComponente();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{componenteId}/Pesquisa/{PesquisaId}")
  public void deletePesquisa(@PathVariable("componenteId") java.lang.String componenteId, @PathVariable("PesquisaId") java.lang.String PesquisaId) {
    this.componenteBusiness.deletePesquisa(componenteId, PesquisaId);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{componenteId}")
  public Componente get(@PathVariable("componenteId") java.lang.String componenteId) throws Exception {
    return componenteBusiness.get(componenteId);
  }
}
