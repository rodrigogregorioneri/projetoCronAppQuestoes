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
 * Classe que representa a camada de negócios de EstadosBusiness
 * 
 * @generated
 **/
@Service("EstadosBusiness")
public class EstadosBusiness {



  /**
   * Instância da classe EstadosDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("EstadosDAO")
  protected EstadosDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Estados post(final Estados entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Estados result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Estados put(final Estados entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Estados result = repository.saveAndFlush(entity);
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
    Estados entity = this.get(id);
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
  public Estados get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Estados result = repository.findOne(id);
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
  public Page<Estados> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Estados> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Territorio> findTerritorio(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Territorio> result = repository.findTerritorio(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * Foreign Key cidades
   * @generated
   */
  public Page<Estados> findEstadossByCidades(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Estados> result = repository.findEstadossByCidades(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
