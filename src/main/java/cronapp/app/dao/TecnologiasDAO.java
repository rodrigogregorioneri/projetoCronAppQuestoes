package cronapp.app.dao;

import cronapp.app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("TecnologiasDAO")
@Transactional(transactionManager="cronapp.app-TransactionManager")
public interface TecnologiasDAO extends JpaRepository<Tecnologias, java.lang.String> {

  /**
   * Obtém a instância de Tecnologias utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Tecnologias entity WHERE entity.id = :id")
  public Tecnologias findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Tecnologias utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Tecnologias entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Tecnologias c")
  public Page<Tecnologias> list(Pageable pageable);
  


  /**
   * Foreign Key funcionarios
   * @generated
   */
  @Query("SELECT entity FROM Tecnologias entity WHERE entity.funcionarios.id = :id")
  public Page<Tecnologias> findTecnologiassByFuncionarios(@Param(value="id") java.lang.String id, Pageable pageable);

}
