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
@Repository("PerguntaDAO")
@Transactional(transactionManager="cronapp.app-TransactionManager")
public interface PerguntaDAO extends JpaRepository<Pergunta, java.lang.String> {

  /**
   * Obtém a instância de Pergunta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Pergunta entity WHERE entity.id = :id")
  public Pergunta findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Pergunta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Pergunta entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Pergunta c")
  public Page<Pergunta> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM OpcaoPerguntas entity WHERE entity.pergunta.id = :id")
  public Page<OpcaoPerguntas> findOpcaoPerguntas(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM PerguntaRespostas entity WHERE entity.pergunta.id = :id")
  public Page<PerguntaRespostas> findPerguntaRespostas(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.respostas FROM PerguntaRespostas entity WHERE entity.pergunta.id = :id")
  public Page<Respostas> listRespostas(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM PerguntaRespostas entity WHERE entity.pergunta.id = :instanceId AND entity.respostas.id = :relationId")
  public int deleteRespostas(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key pesquisa
   * @generated
   */
  @Query("SELECT entity FROM Pergunta entity WHERE entity.pesquisa.id = :id")
  public Page<Pergunta> findPerguntasByPesquisa(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key componente
   * @generated
   */
  @Query("SELECT entity FROM Pergunta entity WHERE entity.componente.id = :id")
  public Page<Pergunta> findPerguntasByComponente(@Param(value="id") java.lang.String id, Pageable pageable);

}
