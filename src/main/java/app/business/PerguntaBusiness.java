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
  public Page<PerguntaRespostas> findPerguntaRespostas(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<PerguntaRespostas> result = repository.findPerguntaRespostas(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<Respostas> listRespostas(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Respostas> result = repository.listRespostas(id, pageable);
    // begin-user-code
    // end-user-code
    return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteRespostas(java.lang.String instanceId, java.lang.String relationId) {
    // begin-user-code
    // end-user-code  
    int result = repository.deleteRespostas(instanceId, relationId);
    // begin-user-code
    // end-user-code  
    return result;  
  }
  /**
   * Foreign Key pesquisa
   * @generated
   */
  public Page<Pergunta> findPerguntasByPesquisa(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Pergunta> result = repository.findPerguntasByPesquisa(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key componente
   * @generated
   */
  public Page<Pergunta> findPerguntasByComponente(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Pergunta> result = repository.findPerguntasByComponente(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
