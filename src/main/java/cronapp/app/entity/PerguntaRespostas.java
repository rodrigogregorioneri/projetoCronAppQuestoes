package cronapp.app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela PERGUNTARESPOSTAS
 * @generated
 */
@Entity
@Table(name = "\"PERGUNTARESPOSTAS\"")
@XmlRootElement
public class PerguntaRespostas implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_pergunta", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Pergunta pergunta;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_respostas", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Respostas respostas;
  
  /**
   * Construtor
   * @generated
   */
  public PerguntaRespostas(){
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
  public PerguntaRespostas setId(java.lang.String id){
    this.id = id;
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
  public PerguntaRespostas setPergunta(Pergunta pergunta){
    this.pergunta = pergunta;
    return this;
  }
  
  /**
   * Obtém respostas
   * return respostas
   * @generated
   */
  public Respostas getRespostas(){
    return this.respostas;
  }
  
  /**
   * Define respostas
   * @param respostas respostas
   * @generated
   */
  public PerguntaRespostas setRespostas(Respostas respostas){
    this.respostas = respostas;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PerguntaRespostas object = (PerguntaRespostas)obj;
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