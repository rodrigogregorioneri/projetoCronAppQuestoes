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
 * Controller para expor serviços REST de Cargo
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/Cargo")
public class CargoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("CargoBusiness")
  private CargoBusiness cargoBusiness;

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
  @Qualifier("ProfissionaisBusiness")
  private ProfissionaisBusiness profissionaisBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Cargo post(@Validated @RequestBody final Cargo entity) throws Exception {
    return cargoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Cargo put(@Validated @RequestBody final Cargo entity) throws Exception {
    return cargoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{cargoId}")
  public Cargo put(@Validated @RequestBody final Cargo entity, @PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    return cargoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{cargoId}")
  public void delete(@PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    cargoBusiness.delete(cargoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Cargo>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(cargoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{cargoId}/Profissionais")    
  public HttpEntity<PagedResources<Profissionais>> findProfissionais(@PathVariable("cargoId") java.lang.String cargoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(cargoBusiness.findProfissionais(cargoId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{cargoId}/Profissionais/{profissionaisId}")    
  public void deleteProfissionais(@PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    this.profissionaisBusiness.delete(profissionaisId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{cargoId}/Profissionais")
  public Profissionais putProfissionais(@Validated @RequestBody final Profissionais entity, @PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    return this.profissionaisBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{cargoId}/Profissionais")
  public Profissionais postProfissionais(@Validated @RequestBody final Profissionais entity, @PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    Cargo cargo = this.cargoBusiness.get(cargoId);
    entity.setCargo(cargo);
    return this.profissionaisBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{cargoId}/Empresa")
  public HttpEntity<PagedResources<Empresa>> listEmpresa(@PathVariable("cargoId") java.lang.String cargoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(cargoBusiness.listEmpresa(cargoId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{cargoId}/Empresa")
  public Cargo postEmpresa(@Validated @RequestBody final Empresa entity, @PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    Profissionais newProfissionais = new Profissionais();

    Cargo cargo = this.cargoBusiness.get(cargoId);

    newProfissionais.setEmpresa(entity);
    newProfissionais.setCargo(cargo);
    
    this.profissionaisBusiness.post(newProfissionais);

    return newProfissionais.getCargo();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{cargoId}/Empresa/{EmpresaId}")
  public void deleteEmpresa(@PathVariable("cargoId") java.lang.String cargoId, @PathVariable("EmpresaId") java.lang.String EmpresaId) {
    this.cargoBusiness.deleteEmpresa(cargoId, EmpresaId);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{cargoId}")
  public Cargo get(@PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    return cargoBusiness.get(cargoId);
  }
}
