package cronapp.app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela RAMO
 * @generated
 */
@Entity
@Table(name = "\"RAMO\"")
@XmlRootElement
public class Ramo implements Serializable {

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
  @Column(name = "tipo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipo;
  
  /**
   * Construtor
   * @generated
   */
  public Ramo(){
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
  public Ramo setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém tipo
   * return tipo
   * @generated
   */
  public java.lang.String getTipo(){
    return this.tipo;
  }
  
  /**
   * Define tipo
   * @param tipo tipo
   * @generated
   */
  public Ramo setTipo(java.lang.String tipo){
    this.tipo = tipo;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Ramo object = (Ramo)obj;
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
