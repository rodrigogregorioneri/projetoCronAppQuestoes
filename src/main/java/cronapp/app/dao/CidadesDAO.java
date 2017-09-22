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
@Repository("CidadesDAO")
@Transactional(transactionManager="cronapp.app-TransactionManager")
public interface CidadesDAO extends JpaRepository<Cidades, java.lang.String> {

  /**
   * Obtém a instância de Cidades utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Cidades entity WHERE entity.id = :id")
  public Cidades findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Cidades utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Cidades entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Cidades c")
  public Page<Cidades> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Estados entity WHERE entity.cidades.id = :id")
  public Page<Estados> findEstados(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key empresa
   * @generated
   */
  @Query("SELECT entity FROM Cidades entity WHERE entity.empresa.id = :id")
  public Page<Cidades> findCidadessByEmpresa(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key profissionais
   * @generated
   */
  @Query("SELECT entity FROM Cidades entity WHERE entity.profissionais.id = :id")
  public Page<Cidades> findCidadessByProfissionais(@Param(value="id") java.lang.String id, Pageable pageable);

}
