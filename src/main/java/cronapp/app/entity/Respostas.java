package cronapp.app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela RESPOSTAS
 * @generated
 */
@Entity
@Table(name = "\"RESPOSTAS\"")
@XmlRootElement
public class Respostas implements Serializable {

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
  @JoinColumn(name="fk_opcaoPerguntas", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private OpcaoPerguntas opcaoPerguntas;
  
  /**
  * @generated
  */
  @Column(name = "respostaCorreta", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String respostaCorreta;
  
  /**
   * Construtor
   * @generated
   */
  public Respostas(){
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
  public Respostas setId(java.lang.String id){
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
  public Respostas setPergunta(Pergunta pergunta){
    this.pergunta = pergunta;
    return this;
  }
  
  /**
   * Obtém opcaoPerguntas
   * return opcaoPerguntas
   * @generated
   */
  public OpcaoPerguntas getOpcaoPerguntas(){
    return this.opcaoPerguntas;
  }
  
  /**
   * Define opcaoPerguntas
   * @param opcaoPerguntas opcaoPerguntas
   * @generated
   */
  public Respostas setOpcaoPerguntas(OpcaoPerguntas opcaoPerguntas){
    this.opcaoPerguntas = opcaoPerguntas;
    return this;
  }
  
  /**
   * Obtém respostaCorreta
   * return respostaCorreta
   * @generated
   */
  public java.lang.String getRespostaCorreta(){
    return this.respostaCorreta;
  }
  
  /**
   * Define respostaCorreta
   * @param respostaCorreta respostaCorreta
   * @generated
   */
  public Respostas setRespostaCorreta(java.lang.String respostaCorreta){
    this.respostaCorreta = respostaCorreta;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Respostas object = (Respostas)obj;
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