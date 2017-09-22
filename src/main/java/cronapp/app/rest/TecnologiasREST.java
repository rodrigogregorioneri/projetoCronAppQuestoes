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
 * Controller para expor serviços REST de Tecnologias
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/Tecnologias")
public class TecnologiasREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TecnologiasBusiness")
  private TecnologiasBusiness tecnologiasBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Tecnologias post(@Validated @RequestBody final Tecnologias entity) throws Exception {
    return tecnologiasBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Tecnologias put(@Validated @RequestBody final Tecnologias entity) throws Exception {
    return tecnologiasBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{tecnologiasId}")
  public Tecnologias put(@Validated @RequestBody final Tecnologias entity, @PathVariable("tecnologiasId") java.lang.String tecnologiasId) throws Exception {
    return tecnologiasBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{tecnologiasId}")
  public void delete(@PathVariable("tecnologiasId") java.lang.String tecnologiasId) throws Exception {
    tecnologiasBusiness.delete(tecnologiasId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Tecnologias>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(tecnologiasBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{tecnologiasId}")
  public Tecnologias get(@PathVariable("tecnologiasId") java.lang.String tecnologiasId) throws Exception {
    return tecnologiasBusiness.get(tecnologiasId);
  }

  /**
   * Foreign Key funcionarios
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Funcionarios/{profissionaisId}")    
  public HttpEntity<PagedResources<Tecnologias>> findTecnologiassByFuncionarios(@PathVariable("profissionaisId") java.lang.String profissionaisId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(tecnologiasBusiness.findTecnologiassByFuncionarios(profissionaisId, pageable)), HttpStatus.OK);
  }
}
