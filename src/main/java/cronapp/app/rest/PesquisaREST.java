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
  @Qualifier("ComponenteBusiness")
  private ComponenteBusiness componenteBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("EmpresaBusiness")
  private EmpresaBusiness empresaBusiness;

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
  @RequestMapping(method = RequestMethod.GET, value="/{pesquisaId}/Empresa")    
  public HttpEntity<PagedResources<Empresa>> findEmpresa(@PathVariable("pesquisaId") java.lang.String pesquisaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(pesquisaBusiness.findEmpresa(pesquisaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{pesquisaId}/Empresa/{empresaId}")    
  public void deleteEmpresa(@PathVariable("empresaId") java.lang.String empresaId) throws Exception {
    this.empresaBusiness.delete(empresaId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{pesquisaId}/Empresa")
  public Empresa putEmpresa(@Validated @RequestBody final Empresa entity, @PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    return this.empresaBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{pesquisaId}/Empresa")
  public Empresa postEmpresa(@Validated @RequestBody final Empresa entity, @PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    Pesquisa pesquisa = this.pesquisaBusiness.get(pesquisaId);
    entity.setPesquisa(pesquisa);
    return this.empresaBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{pesquisaId}/Pergunta")    
  public HttpEntity<PagedResources<Pergunta>> findPergunta(@PathVariable("pesquisaId") java.lang.String pesquisaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(pesquisaBusiness.findPergunta(pesquisaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{pesquisaId}/Pergunta/{perguntaId}")    
  public void deletePergunta(@PathVariable("perguntaId") java.lang.String perguntaId) throws Exception {
    this.perguntaBusiness.delete(perguntaId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{pesquisaId}/Pergunta")
  public Pergunta putPergunta(@Validated @RequestBody final Pergunta entity, @PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    return this.perguntaBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{pesquisaId}/Pergunta")
  public Pergunta postPergunta(@Validated @RequestBody final Pergunta entity, @PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    Pesquisa pesquisa = this.pesquisaBusiness.get(pesquisaId);
    entity.setPesquisa(pesquisa);
    return this.perguntaBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{pesquisaId}/Componente")
  public HttpEntity<PagedResources<Componente>> listComponente(@PathVariable("pesquisaId") java.lang.String pesquisaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(pesquisaBusiness.listComponente(pesquisaId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{pesquisaId}/Componente")
  public Pesquisa postComponente(@Validated @RequestBody final Componente entity, @PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    Pergunta newPergunta = new Pergunta();

    Pesquisa pesquisa = this.pesquisaBusiness.get(pesquisaId);

    newPergunta.setComponente(entity);
    newPergunta.setPesquisa(pesquisa);
    
    this.perguntaBusiness.post(newPergunta);

    return newPergunta.getPesquisa();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{pesquisaId}/Componente/{ComponenteId}")
  public void deleteComponente(@PathVariable("pesquisaId") java.lang.String pesquisaId, @PathVariable("ComponenteId") java.lang.String ComponenteId) {
    this.pesquisaBusiness.deleteComponente(pesquisaId, ComponenteId);
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
