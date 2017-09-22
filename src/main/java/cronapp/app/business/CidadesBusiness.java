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
 * Classe que representa a camada de negócios de CidadesBusiness
 * 
 * @generated
 **/
@Service("CidadesBusiness")
public class CidadesBusiness {



  /**
   * Instância da classe CidadesDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("CidadesDAO")
  protected CidadesDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Cidades post(final Cidades entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Cidades result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Cidades put(final Cidades entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Cidades result = repository.saveAndFlush(entity);
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
    Cidades entity = this.get(id);
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
  public Cidades get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Cidades result = repository.findOne(id);
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
  public Page<Cidades> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Cidades> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Estados> findEstados(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Estados> result = repository.findEstados(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * Foreign Key empresa
   * @generated
   */
  public Page<Cidades> findCidadessByEmpresa(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Cidades> result = repository.findCidadessByEmpresa(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key profissionais
   * @generated
   */
  public Page<Cidades> findCidadessByProfissionais(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Cidades> result = repository.findCidadessByProfissionais(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
