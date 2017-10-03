package cronapp.app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela PERGUNTA
 * @generated
 */
@Entity
@Table(name = "\"PERGUNTA\"")
@XmlRootElement
public class Pergunta implements Serializable {

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
  @Column(name = "perguntas", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String perguntas;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_pesquisa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Pesquisa pesquisa;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_componente", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Componente componente;
  
  /**
  * @generated
  */
  @Column(name = "resposta", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String resposta;
  
  /**
   * Construtor
   * @generated
   */
  public Pergunta(){
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
  public Pergunta setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém perguntas
   * return perguntas
   * @generated
   */
  public java.lang.String getPerguntas(){
    return this.perguntas;
  }
  
  /**
   * Define perguntas
   * @param perguntas perguntas
   * @generated
   */
  public Pergunta setPerguntas(java.lang.String perguntas){
    this.perguntas = perguntas;
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
  public Pergunta setPesquisa(Pesquisa pesquisa){
    this.pesquisa = pesquisa;
    return this;
  }
  
  /**
   * Obtém componente
   * return componente
   * @generated
   */
  public Componente getComponente(){
    return this.componente;
  }
  
  /**
   * Define componente
   * @param componente componente
   * @generated
   */
  public Pergunta setComponente(Componente componente){
    this.componente = componente;
    return this;
  }
  
  /**
   * Obtém resposta
   * return resposta
   * @generated
   */
  public java.lang.String getResposta(){
    return this.resposta;
  }
  
  /**
   * Define resposta
   * @param resposta resposta
   * @generated
   */
  public Pergunta setResposta(java.lang.String resposta){
    this.resposta = resposta;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pergunta object = (Pergunta)obj;
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