package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela COMPONENTE
 * @generated
 */
@Entity
@Table(name = "\"COMPONENTE\"")
@XmlRootElement
public class Componente implements Serializable {

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
  @Column(name = "tipo_questao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipo_questao;
  
  /**
   * Construtor
   * @generated
   */
  public Componente(){
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
  public Componente setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém tipo_questao
   * return tipo_questao
   * @generated
   */
  public java.lang.String getTipo_questao(){
    return this.tipo_questao;
  }
  
  /**
   * Define tipo_questao
   * @param tipo_questao tipo_questao
   * @generated
   */
  public Componente setTipo_questao(java.lang.String tipo_questao){
    this.tipo_questao = tipo_questao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Componente object = (Componente)obj;
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