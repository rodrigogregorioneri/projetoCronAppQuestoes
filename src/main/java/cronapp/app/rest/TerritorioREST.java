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
 * Controller para expor serviços REST de Territorio
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/Territorio")
public class TerritorioREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
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
  public Territorio post(@Validated @RequestBody final Territorio entity) throws Exception {
    return territorioBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Territorio put(@Validated @RequestBody final Territorio entity) throws Exception {
    return territorioBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{territorioId}")
  public Territorio put(@Validated @RequestBody final Territorio entity, @PathVariable("territorioId") java.lang.String territorioId) throws Exception {
    return territorioBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{territorioId}")
  public void delete(@PathVariable("territorioId") java.lang.String territorioId) throws Exception {
    territorioBusiness.delete(territorioId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Territorio>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(territorioBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{territorioId}")
  public Territorio get(@PathVariable("territorioId") java.lang.String territorioId) throws Exception {
    return territorioBusiness.get(territorioId);
  }

  /**
   * Foreign Key estados
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Estados/{estadosId}")    
  public HttpEntity<PagedResources<Territorio>> findTerritoriosByEstados(@PathVariable("estadosId") java.lang.String estadosId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(territorioBusiness.findTerritoriosByEstados(estadosId, pageable)), HttpStatus.OK);
  }
}
