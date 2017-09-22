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
@Repository("EstadosDAO")
@Transactional(transactionManager="cronapp.app-TransactionManager")
public interface EstadosDAO extends JpaRepository<Estados, java.lang.String> {

  /**
   * Obtém a instância de Estados utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Estados entity WHERE entity.id = :id")
  public Estados findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Estados utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Estados entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Estados c")
  public Page<Estados> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Territorio entity WHERE entity.estados.id = :id")
  public Page<Territorio> findTerritorio(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key cidades
   * @generated
   */
  @Query("SELECT entity FROM Estados entity WHERE entity.cidades.id = :id")
  public Page<Estados> findEstadossByCidades(@Param(value="id") java.lang.String id, Pageable pageable);

}
