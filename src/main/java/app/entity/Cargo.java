package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela CARGO
 * @generated
 */
@Entity
@Table(name = "\"CARGO\"")
@XmlRootElement
public class Cargo implements Serializable {

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
  @Column(name = "ocupacao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String ocupacao;
  
  /**
   * Construtor
   * @generated
   */
  public Cargo(){
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
  public Cargo setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém ocupacao
   * return ocupacao
   * @generated
   */
  public java.lang.String getOcupacao(){
    return this.ocupacao;
  }
  
  /**
   * Define ocupacao
   * @param ocupacao ocupacao
   * @generated
   */
  public Cargo setOcupacao(java.lang.String ocupacao){
    this.ocupacao = ocupacao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Cargo object = (Cargo)obj;
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