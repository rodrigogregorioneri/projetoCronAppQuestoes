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
@Repository("TerritorioDAO")
@Transactional(transactionManager="cronapp.app-TransactionManager")
public interface TerritorioDAO extends JpaRepository<Territorio, java.lang.String> {

  /**
   * Obtém a instância de Territorio utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Territorio entity WHERE entity.id = :id")
  public Territorio findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Territorio utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Territorio entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Territorio c")
  public Page<Territorio> list(Pageable pageable);
  


  /**
   * Foreign Key estados
   * @generated
   */
  @Query("SELECT entity FROM Territorio entity WHERE entity.estados.id = :id")
  public Page<Territorio> findTerritoriosByEstados(@Param(value="id") java.lang.String id, Pageable pageable);

}
