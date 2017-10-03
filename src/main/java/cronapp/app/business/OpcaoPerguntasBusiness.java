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
 * Classe que representa a camada de negócios de OpcaoPerguntasBusiness
 * 
 * @generated
 **/
@Service("OpcaoPerguntasBusiness")
public class OpcaoPerguntasBusiness {



  /**
   * Instância da classe OpcaoPerguntasDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("OpcaoPerguntasDAO")
  protected OpcaoPerguntasDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public OpcaoPerguntas post(final OpcaoPerguntas entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    OpcaoPerguntas result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public OpcaoPerguntas put(final OpcaoPerguntas entity) throws Exception {
    // begin-user-code  
    // end-user-code
    OpcaoPerguntas result = repository.saveAndFlush(entity);
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
    OpcaoPerguntas entity = this.get(id);
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
  public OpcaoPerguntas get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    OpcaoPerguntas result = repository.findOne(id);
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
  public Page<OpcaoPerguntas> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<OpcaoPerguntas> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<RespostasOpcaoPerguntas> findRespostasOpcaoPerguntas(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<RespostasOpcaoPerguntas> result = repository.findRespostasOpcaoPerguntas(id, pageable);
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
   * Foreign Key pergunta
   * @generated
   */
  public Page<OpcaoPerguntas> findOpcaoPerguntassByPergunta(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<OpcaoPerguntas> result = repository.findOpcaoPerguntassByPergunta(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
