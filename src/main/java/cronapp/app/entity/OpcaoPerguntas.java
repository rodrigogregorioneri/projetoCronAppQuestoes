package cronapp.app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela OPCAOPERGUNTAS
 * @generated
 */
@Entity
@Table(name = "\"OPCAOPERGUNTAS\"")
@XmlRootElement
public class OpcaoPerguntas implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "opcao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String opcao;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_pergunta", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Pergunta pergunta;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_pesquisa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Pesquisa pesquisa;
  
  /**
   * Construtor
   * @generated
   */
  public OpcaoPerguntas(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public OpcaoPerguntas setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém opcao
   * return opcao
   * @generated
   */
  public java.lang.String getOpcao(){
    return this.opcao;
  }
  
  /**
   * Define opcao
   * @param opcao opcao
   * @generated
   */
  public OpcaoPerguntas setOpcao(java.lang.String opcao){
    this.opcao = opcao;
    return this;
  }
  
  /**
   * Obtém pergunta
   * return pergunta
   * @generated
   */
  public Pergunta getPergunta(){
    return this.pergunta;
  }
  
  /**
   * Define pergunta
   * @param pergunta pergunta
   * @generated
   */
  public OpcaoPerguntas setPergunta(Pergunta pergunta){
    this.pergunta = pergunta;
    return this;
  }
  
  /**
   * Obtém pesquisa
   * return pesquisa
   * @generated
   */
  public Pesquisa getPesquisa(){
    return this.pesquisa;
  }
  
  /**
   * Define pesquisa
   * @param pesquisa pesquisa
   * @generated
   */
  public OpcaoPerguntas setPesquisa(Pesquisa pesquisa){
    this.pesquisa = pesquisa;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    OpcaoPerguntas object = (OpcaoPerguntas)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}