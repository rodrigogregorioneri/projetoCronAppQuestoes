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
 * Classe que representa a camada de negócios de TecnologiasBusiness
 * 
 * @generated
 **/
@Service("TecnologiasBusiness")
public class TecnologiasBusiness {



  /**
   * Instância da classe TecnologiasDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TecnologiasDAO")
  protected TecnologiasDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Tecnologias post(final Tecnologias entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Tecnologias result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Tecnologias put(final Tecnologias entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Tecnologias result = repository.saveAndFlush(entity);
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
    Tecnologias entity = this.get(id);
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
  public Tecnologias get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Tecnologias result = repository.findOne(id);
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
  public Page<Tecnologias> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Tecnologias> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key funcionarios
   * @generated
   */
  public Page<Tecnologias> findTecnologiassByFuncionarios(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Tecnologias> result = repository.findTecnologiassByFuncionarios(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
