package app.dao;

import app.entity.*;
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
@Repository("ComponenteDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ComponenteDAO extends JpaRepository<Componente, java.lang.String> {

  /**
   * Obtém a instância de Componente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Componente entity WHERE entity.id = :id")
  public Componente findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Componente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Componente entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Componente c")
  public Page<Componente> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Pergunta entity WHERE entity.componente.id = :id")
  public Page<Pergunta> findPergunta(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.pesquisa FROM Pergunta entity WHERE entity.componente.id = :id")
  public Page<Pesquisa> listPesquisa(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Pergunta entity WHERE entity.componente.id = :instanceId AND entity.pesquisa.id = :relationId")
  public int deletePesquisa(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
