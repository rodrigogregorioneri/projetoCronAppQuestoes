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
 * Classe que representa a camada de negócios de ProfissionaisBusiness
 * 
 * @generated
 **/
@Service("ProfissionaisBusiness")
public class ProfissionaisBusiness {



  /**
   * Instância da classe ProfissionaisDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ProfissionaisDAO")
  protected ProfissionaisDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Profissionais post(final Profissionais entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Profissionais result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Profissionais put(final Profissionais entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Profissionais result = repository.saveAndFlush(entity);
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
    Profissionais entity = this.get(id);
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
  public Profissionais get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Profissionais result = repository.findOne(id);
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
  public Page<Profissionais> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Profissionais> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Tecnologias> findTecnologias(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Tecnologias> result = repository.findTecnologias(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Cidades> findCidades(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Cidades> result = repository.findCidades(id, pageable);
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
  /**
   * Foreign Key cargo
   * @generated
   */
  public Page<Profissionais> findProfissionaissByCargo(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Profissionais> result = repository.findProfissionaissByCargo(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key empresa
   * @generated
   */
  public Page<Profissionais> findProfissionaissByEmpresa(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Profissionais> result = repository.findProfissionaissByEmpresa(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key respostas
   * @generated
   */
  public Page<Profissionais> findProfissionaissByRespostas(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Profissionais> result = repository.findProfissionaissByRespostas(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
