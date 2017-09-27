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
 * Classe que representa a camada de negócios de PerguntaRespostasBusiness
 * 
 * @generated
 **/
@Service("PerguntaRespostasBusiness")
public class PerguntaRespostasBusiness {



  /**
   * Instância da classe PerguntaRespostasDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("PerguntaRespostasDAO")
  protected PerguntaRespostasDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public PerguntaRespostas post(final PerguntaRespostas entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    PerguntaRespostas result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public PerguntaRespostas put(final PerguntaRespostas entity) throws Exception {
    // begin-user-code  
    // end-user-code
    PerguntaRespostas result = repository.saveAndFlush(entity);
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
    PerguntaRespostas entity = this.get(id);
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
  public PerguntaRespostas get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    PerguntaRespostas result = repository.findOne(id);
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
  public Page<PerguntaRespostas> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<PerguntaRespostas> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key pergunta
   * @generated
   */
  public Page<PerguntaRespostas> findPerguntaRespostassByPergunta(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<PerguntaRespostas> result = repository.findPerguntaRespostassByPergunta(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key respostas
   * @generated
   */
  public Page<PerguntaRespostas> findPerguntaRespostassByRespostas(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<PerguntaRespostas> result = repository.findPerguntaRespostassByRespostas(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
