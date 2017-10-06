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
@Repository("RespostasOpcaoPerguntasDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface RespostasOpcaoPerguntasDAO extends JpaRepository<RespostasOpcaoPerguntas, java.lang.String> {

  /**
   * Obtém a instância de RespostasOpcaoPerguntas utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM RespostasOpcaoPerguntas entity WHERE entity.id = :id")
  public RespostasOpcaoPerguntas findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de RespostasOpcaoPerguntas utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM RespostasOpcaoPerguntas entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select ro from RespostasOpcaoPerguntas ro")
  public Page<RespostasOpcaoPerguntas> list(Pageable pageable);
  


  /**
   * Foreign Key respostas
   * @generated
   */
  @Query("SELECT entity FROM RespostasOpcaoPerguntas entity WHERE entity.respostas.id = :id")
  public Page<RespostasOpcaoPerguntas> findRespostasOpcaoPerguntassByRespostas(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key opcaoPerguntas
   * @generated
   */
  @Query("SELECT entity FROM RespostasOpcaoPerguntas entity WHERE entity.opcaoPerguntas.id = :id")
  public Page<RespostasOpcaoPerguntas> findRespostasOpcaoPerguntassByOpcaoPerguntas(@Param(value="id") java.lang.String id, Pageable pageable);

}
