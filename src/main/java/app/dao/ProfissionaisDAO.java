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
@Repository("ProfissionaisDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ProfissionaisDAO extends JpaRepository<Profissionais, java.lang.String> {

  /**
   * Obtém a instância de Profissionais utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Profissionais entity WHERE entity.id = :id")
  public Profissionais findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Profissionais utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Profissionais entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Profissionais c")
  public Page<Profissionais> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Tecnologias entity WHERE entity.funcionarios.id = :id")
  public Page<Tecnologias> findTecnologias(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Cidades entity WHERE entity.profissionais.id = :id")
  public Page<Cidades> findCidades(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Respostas entity WHERE entity.profissionais.id = :id")
  public Page<Respostas> findRespostas(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.empresa FROM Cidades entity WHERE entity.profissionais.id = :id")
  public Page<Empresa> listEmpresa(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Cidades entity WHERE entity.profissionais.id = :instanceId AND entity.empresa.id = :relationId")
  public int deleteEmpresa(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key cargo
   * @generated
   */
  @Query("SELECT entity FROM Profissionais entity WHERE entity.cargo.id = :id")
  public Page<Profissionais> findProfissionaissByCargo(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key empresa
   * @generated
   */
  @Query("SELECT entity FROM Profissionais entity WHERE entity.empresa.id = :id")
  public Page<Profissionais> findProfissionaissByEmpresa(@Param(value="id") java.lang.String id, Pageable pageable);

}
