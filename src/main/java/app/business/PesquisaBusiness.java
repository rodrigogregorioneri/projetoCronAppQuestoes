package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;

/**
 * Classe que representa a camada de negócios de PesquisaBusiness
 * 
 * @generated
 **/
@Service("PesquisaBusiness")
public class PesquisaBusiness {



  /**
   * Instância da classe PesquisaDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("PesquisaDAO")
  protected PesquisaDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Pesquisa post(final Pesquisa entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Pesquisa result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Pesquisa put(final Pesquisa entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Pesquisa result = repository.saveAndFlush(entity);
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
    Pesquisa entity = this.get(id);
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
  public Pesquisa get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Pesquisa result = repository.findOne(id);
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
  public Page<Pesquisa> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Pesquisa> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Empresa> findEmpresa(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Empresa> result = repository.findEmpresa(id, pageable);
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
  public Page<Componente> listComponente(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Componente> result = repository.listComponente(id, pageable);
    // begin-user-code
    // end-user-code
    return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteComponente(java.lang.String instanceId, java.lang.String relationId) {
    // begin-user-code
    // end-user-code  
    int result = repository.deleteComponente(instanceId, relationId);
    // begin-user-code
    // end-user-code  
    return result;  
  }
}
