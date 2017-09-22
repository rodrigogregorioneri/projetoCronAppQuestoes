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
@Repository("OpcaoPerguntasDAO")
@Transactional(transactionManager="cronapp.app-TransactionManager")
public interface OpcaoPerguntasDAO extends JpaRepository<OpcaoPerguntas, java.lang.String> {

  /**
   * Obtém a instância de OpcaoPerguntas utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM OpcaoPerguntas entity WHERE entity.id = :id")
  public OpcaoPerguntas findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de OpcaoPerguntas utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM OpcaoPerguntas entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from OpcaoPerguntas c")
  public Page<OpcaoPerguntas> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Respostas entity WHERE entity.opcaoPerguntas.id = :id")
  public Page<Respostas> findRespostas(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.pergunta FROM Respostas entity WHERE entity.opcaoPerguntas.id = :id")
  public Page<Pergunta> listPergunta(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Respostas entity WHERE entity.opcaoPerguntas.id = :instanceId AND entity.pergunta.id = :relationId")
  public int deletePergunta(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key pergunta
   * @generated
   */
  @Query("SELECT entity FROM OpcaoPerguntas entity WHERE entity.pergunta.id = :id")
  public Page<OpcaoPerguntas> findOpcaoPerguntassByPergunta(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key pesquisa
   * @generated
   */
  @Query("SELECT entity FROM OpcaoPerguntas entity WHERE entity.pesquisa.id = :id")
  public Page<OpcaoPerguntas> findOpcaoPerguntassByPesquisa(@Param(value="id") java.lang.String id, Pageable pageable);

}
