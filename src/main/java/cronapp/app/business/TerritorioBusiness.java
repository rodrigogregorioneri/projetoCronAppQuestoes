package cronapp.app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import cronapp.app.dao.*;
import cronapp.app.entity.*;

/**
 * Classe que representa a camada de negócios de TerritorioBusiness
 * 
 * @generated
 **/
@Service("TerritorioBusiness")
public class TerritorioBusiness {



  /**
   * Instância da classe TerritorioDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TerritorioDAO")
  protected TerritorioDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Territorio post(final Territorio entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Territorio result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Territorio put(final Territorio entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Territorio result = repository.saveAndFlush(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.String id) throws Exception {
    Territorio entity = this.get(id);
    // begin-user-code  
    // end-user-code
    this.repository.delete(entity);
    // begin-user-code  
    // end-user-code        
  }
  
  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public Territorio get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Territorio result = repository.findOne(id);
    // begin-user-code
    // end-user-code
    return result;
  }

  // CRUD
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Territorio> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Territorio> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key estados
   * @generated
   */
  public Page<Territorio> findTerritoriosByEstados(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Territorio> result = repository.findTerritoriosByEstados(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
