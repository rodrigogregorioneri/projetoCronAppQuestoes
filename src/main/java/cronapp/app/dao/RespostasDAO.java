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
@Repository("RespostasDAO")
@Transactional(transactionManager="cronapp.app-TransactionManager")
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
  @Query("SELECT entity FROM Profissionais entity WHERE entity.respostas.id = :id")
  public Page<Profissionais> findProfissionais(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key pergunta
   * @generated
   */
  @Query("SELECT entity FROM Respostas entity WHERE entity.pergunta.id = :id")
  public Page<Respostas> findRespostassByPergunta(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key opcaoPerguntas
   * @generated
   */
  @Query("SELECT entity FROM Respostas entity WHERE entity.opcaoPerguntas.id = :id")
  public Page<Respostas> findRespostassByOpcaoPerguntas(@Param(value="id") java.lang.String id, Pageable pageable);

}
