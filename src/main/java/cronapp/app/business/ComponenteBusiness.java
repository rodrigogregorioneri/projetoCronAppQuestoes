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
 * Classe que representa a camada de negócios de ComponenteBusiness
 * 
 * @generated
 **/
@Service("ComponenteBusiness")
public class ComponenteBusiness {



  /**
   * Instância da classe ComponenteDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ComponenteDAO")
  protected ComponenteDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Componente post(final Componente entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Componente result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Componente put(final Componente entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Componente result = repository.saveAndFlush(entity);
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
    Componente entity = this.get(id);
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
  public Componente get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Componente result = repository.findOne(id);
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
  public Page<Componente> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Componente> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Pergunta> findPergunta(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Pergunta> result = repository.findPergunta(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<Pesquisa> listPesquisa(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Pesquisa> result = repository.listPesquisa(id, pageable);
    // begin-user-code
    // end-user-code
    return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deletePesquisa(java.lang.String instanceId, java.lang.String relationId) {
    // begin-user-code
    // end-user-code  
    int result = repository.deletePesquisa(instanceId, relationId);
    // begin-user-code
    // end-user-code  
    return result;  
  }
}
