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
@Repository("PerguntaRespostasDAO")
@Transactional(transactionManager="cronapp.app-TransactionManager")
public interface PerguntaRespostasDAO extends JpaRepository<PerguntaRespostas, java.lang.String> {

  /**
   * Obtém a instância de PerguntaRespostas utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM PerguntaRespostas entity WHERE entity.id = :id")
  public PerguntaRespostas findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de PerguntaRespostas utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM PerguntaRespostas entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select pr from PerguntaRespostas pr")
  public Page<PerguntaRespostas> list(Pageable pageable);
  


  /**
   * Foreign Key pergunta
   * @generated
   */
  @Query("SELECT entity FROM PerguntaRespostas entity WHERE entity.pergunta.id = :id")
  public Page<PerguntaRespostas> findPerguntaRespostassByPergunta(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key respostas
   * @generated
   */
  @Query("SELECT entity FROM PerguntaRespostas entity WHERE entity.respostas.id = :id")
  public Page<PerguntaRespostas> findPerguntaRespostassByRespostas(@Param(value="id") java.lang.String id, Pageable pageable);

}
