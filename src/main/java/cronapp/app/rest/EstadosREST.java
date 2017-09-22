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
 * Controller para expor serviços REST de Estados
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/Estados")
public class EstadosREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("EstadosBusiness")
  private EstadosBusiness estadosBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("TerritorioBusiness")
  private TerritorioBusiness territorioBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Estados post(@Validated @RequestBody final Estados entity) throws Exception {
    return estadosBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Estados put(@Validated @RequestBody final Estados entity) throws Exception {
    return estadosBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{estadosId}")
  public Estados put(@Validated @RequestBody final Estados entity, @PathVariable("estadosId") java.lang.String estadosId) throws Exception {
    return estadosBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{estadosId}")
  public void delete(@PathVariable("estadosId") java.lang.String estadosId) throws Exception {
    estadosBusiness.delete(estadosId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Estados>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(estadosBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{estadosId}/Territorio")    
  public HttpEntity<PagedResources<Territorio>> findTerritorio(@PathVariable("estadosId") java.lang.String estadosId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(estadosBusiness.findTerritorio(estadosId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{estadosId}/Territorio/{territorioId}")    
  public void deleteTerritorio(@PathVariable("territorioId") java.lang.String territorioId) throws Exception {
    this.territorioBusiness.delete(territorioId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{estadosId}/Territorio")
  public Territorio putTerritorio(@Validated @RequestBody final Territorio entity, @PathVariable("estadosId") java.lang.String estadosId) throws Exception {
    return this.territorioBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{estadosId}/Territorio")
  public Territorio postTerritorio(@Validated @RequestBody final Territorio entity, @PathVariable("estadosId") java.lang.String estadosId) throws Exception {
    Estados estados = this.estadosBusiness.get(estadosId);
    entity.setEstados(estados);
    return this.territorioBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{estadosId}")
  public Estados get(@PathVariable("estadosId") java.lang.String estadosId) throws Exception {
    return estadosBusiness.get(estadosId);
  }

  /**
   * Foreign Key cidades
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Cidades/{cidadesId}")    
  public HttpEntity<PagedResources<Estados>> findEstadossByCidades(@PathVariable("cidadesId") java.lang.String cidadesId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(estadosBusiness.findEstadossByCidades(cidadesId, pageable)), HttpStatus.OK);
  }
}
