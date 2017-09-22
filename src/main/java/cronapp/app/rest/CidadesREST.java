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
 * Controller para expor serviços REST de Cidades
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/Cidades")
public class CidadesREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("CidadesBusiness")
  private CidadesBusiness cidadesBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("EstadosBusiness")
  private EstadosBusiness estadosBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Cidades post(@Validated @RequestBody final Cidades entity) throws Exception {
    return cidadesBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Cidades put(@Validated @RequestBody final Cidades entity) throws Exception {
    return cidadesBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{cidadesId}")
  public Cidades put(@Validated @RequestBody final Cidades entity, @PathVariable("cidadesId") java.lang.String cidadesId) throws Exception {
    return cidadesBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{cidadesId}")
  public void delete(@PathVariable("cidadesId") java.lang.String cidadesId) throws Exception {
    cidadesBusiness.delete(cidadesId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Cidades>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(cidadesBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{cidadesId}/Estados")    
  public HttpEntity<PagedResources<Estados>> findEstados(@PathVariable("cidadesId") java.lang.String cidadesId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(cidadesBusiness.findEstados(cidadesId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{cidadesId}/Estados/{estadosId}")    
  public void deleteEstados(@PathVariable("estadosId") java.lang.String estadosId) throws Exception {
    this.estadosBusiness.delete(estadosId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{cidadesId}/Estados")
  public Estados putEstados(@Validated @RequestBody final Estados entity, @PathVariable("cidadesId") java.lang.String cidadesId) throws Exception {
    return this.estadosBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{cidadesId}/Estados")
  public Estados postEstados(@Validated @RequestBody final Estados entity, @PathVariable("cidadesId") java.lang.String cidadesId) throws Exception {
    Cidades cidades = this.cidadesBusiness.get(cidadesId);
    entity.setCidades(cidades);
    return this.estadosBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{cidadesId}")
  public Cidades get(@PathVariable("cidadesId") java.lang.String cidadesId) throws Exception {
    return cidadesBusiness.get(cidadesId);
  }

  /**
   * Foreign Key empresa
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Empresa/{empresaId}")    
  public HttpEntity<PagedResources<Cidades>> findCidadessByEmpresa(@PathVariable("empresaId") java.lang.String empresaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(cidadesBusiness.findCidadessByEmpresa(empresaId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key profissionais
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Profissionais/{profissionaisId}")    
  public HttpEntity<PagedResources<Cidades>> findCidadessByProfissionais(@PathVariable("profissionaisId") java.lang.String profissionaisId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(cidadesBusiness.findCidadessByProfissionais(profissionaisId, pageable)), HttpStatus.OK);
  }
}
