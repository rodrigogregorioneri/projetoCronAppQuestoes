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
 * Classe que representa a camada de negócios de RespostasOpcaoPerguntasBusiness
 * 
 * @generated
 **/
@Service("RespostasOpcaoPerguntasBusiness")
public class RespostasOpcaoPerguntasBusiness {



  /**
   * Instância da classe RespostasOpcaoPerguntasDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("RespostasOpcaoPerguntasDAO")
  protected RespostasOpcaoPerguntasDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public RespostasOpcaoPerguntas post(final RespostasOpcaoPerguntas entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    RespostasOpcaoPerguntas result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public RespostasOpcaoPerguntas put(final RespostasOpcaoPerguntas entity) throws Exception {
    // begin-user-code  
    // end-user-code
    RespostasOpcaoPerguntas result = repository.saveAndFlush(entity);
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
    RespostasOpcaoPerguntas entity = this.get(id);
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
  public RespostasOpcaoPerguntas get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    RespostasOpcaoPerguntas result = repository.findOne(id);
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
  public Page<RespostasOpcaoPerguntas> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<RespostasOpcaoPerguntas> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key respostas
   * @generated
   */
  public Page<RespostasOpcaoPerguntas> findRespostasOpcaoPerguntassByRespostas(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<RespostasOpcaoPerguntas> result = repository.findRespostasOpcaoPerguntassByRespostas(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key opcaoPerguntas
   * @generated
   */
  public Page<RespostasOpcaoPerguntas> findRespostasOpcaoPerguntassByOpcaoPerguntas(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<RespostasOpcaoPerguntas> result = repository.findRespostasOpcaoPerguntassByOpcaoPerguntas(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
