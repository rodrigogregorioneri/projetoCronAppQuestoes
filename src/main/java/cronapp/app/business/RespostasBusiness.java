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
 * Classe que representa a camada de negócios de RespostasBusiness
 * 
 * @generated
 **/
@Service("RespostasBusiness")
public class RespostasBusiness {



  /**
   * Instância da classe RespostasDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("RespostasDAO")
  protected RespostasDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Respostas post(final Respostas entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Respostas result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Respostas put(final Respostas entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Respostas result = repository.saveAndFlush(entity);
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
    Respostas entity = this.get(id);
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
  public Respostas get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Respostas result = repository.findOne(id);
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
  public Page<Respostas> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Respostas> result = repository.list(pageable);
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
   * Foreign Key pergunta
   * @generated
   */
  public Page<Respostas> findRespostassByPergunta(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Respostas> result = repository.findRespostassByPergunta(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key opcaoPerguntas
   * @generated
   */
  public Page<Respostas> findRespostassByOpcaoPerguntas(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Respostas> result = repository.findRespostassByOpcaoPerguntas(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
