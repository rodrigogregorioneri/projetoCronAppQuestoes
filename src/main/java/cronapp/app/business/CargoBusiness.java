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
 * Classe que representa a camada de negócios de CargoBusiness
 * 
 * @generated
 **/
@Service("CargoBusiness")
public class CargoBusiness {



  /**
   * Instância da classe CargoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("CargoDAO")
  protected CargoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Cargo post(final Cargo entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Cargo result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Cargo put(final Cargo entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Cargo result = repository.saveAndFlush(entity);
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
    Cargo entity = this.get(id);
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
  public Cargo get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Cargo result = repository.findOne(id);
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
  public Page<Cargo> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Cargo> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Profissionais> findProfissionais(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Profissionais> result = repository.findProfissionais(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<Empresa> listEmpresa(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Empresa> result = repository.listEmpresa(id, pageable);
    // begin-user-code
    // end-user-code
    return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteEmpresa(java.lang.String instanceId, java.lang.String relationId) {
    // begin-user-code
    // end-user-code  
    int result = repository.deleteEmpresa(instanceId, relationId);
    // begin-user-code
    // end-user-code  
    return result;  
  }
}
