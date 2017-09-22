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
 * Classe que representa a camada de negócios de PerguntaBusiness
 * 
 * @generated
 **/
@Service("PerguntaBusiness")
public class PerguntaBusiness {



  /**
   * Instância da classe PerguntaDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("PerguntaDAO")
  protected PerguntaDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Pergunta post(final Pergunta entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Pergunta result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Pergunta put(final Pergunta entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Pergunta result = repository.saveAndFlush(entity);
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
    Pergunta entity = this.get(id);
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
  public Pergunta get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Pergunta result = repository.findOne(id);
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
  public Page<Pergunta> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Pergunta> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<OpcaoPerguntas> findOpcaoPerguntas(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<OpcaoPerguntas> result = repository.findOpcaoPerguntas(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Respostas> findRespostas(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Respostas> result = repository.findRespostas(id, pageable);
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
  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<OpcaoPerguntas> listOpcaoPerguntas_2(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<OpcaoPerguntas> result = repository.listOpcaoPerguntas_2(id, pageable);
    // begin-user-code
    // end-user-code
    return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteOpcaoPerguntas_2(java.lang.String instanceId, java.lang.String relationId) {
    // begin-user-code
    // end-user-code  
    int result = repository.deleteOpcaoPerguntas_2(instanceId, relationId);
    // begin-user-code
    // end-user-code  
    return result;  
  }
}
