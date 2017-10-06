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
@Repository("RespostasDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface RespostasDAO extends JpaRepository<Respostas, java.lang.String> {

  /**
   * Obtém a instância de Respostas utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Respostas entity WHERE entity.id = :id")
  public Respostas findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Respostas utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Respostas entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Respostas c")
  public Page<Respostas> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM RespostasOpcaoPerguntas entity WHERE entity.respostas.id = :id")
  public Page<RespostasOpcaoPerguntas> findRespostasOpcaoPerguntas(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM PerguntaRespostas entity WHERE entity.respostas.id = :id")
  public Page<PerguntaRespostas> findPerguntaRespostas(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.opcaoPerguntas FROM RespostasOpcaoPerguntas entity WHERE entity.respostas.id = :id")
  public Page<OpcaoPerguntas> listOpcaoPerguntas(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM RespostasOpcaoPerguntas entity WHERE entity.respostas.id = :instanceId AND entity.opcaoPerguntas.id = :relationId")
  public int deleteOpcaoPerguntas(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.pergunta FROM PerguntaRespostas entity WHERE entity.respostas.id = :id")
  public Page<Pergunta> listPergunta(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM PerguntaRespostas entity WHERE entity.respostas.id = :instanceId AND entity.pergunta.id = :relationId")
  public int deletePergunta(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key profissionais
   * @generated
   */
  @Query("SELECT entity FROM Respostas entity WHERE entity.profissionais.id = :id")
  public Page<Respostas> findRespostassByProfissionais(@Param(value="id") java.lang.String id, Pageable pageable);

}
