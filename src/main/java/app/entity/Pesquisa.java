package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela PESQUISA
 * @generated
 */
@Entity
@Table(name = "\"PESQUISA\"")
@XmlRootElement
public class Pesquisa implements Serializable {

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
  @Column(name = "nome_pesquisa", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome_pesquisa;
  
  /**
   * Construtor
   * @generated
   */
  public Pesquisa(){
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
  public Pesquisa setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém nome_pesquisa
   * return nome_pesquisa
   * @generated
   */
  public java.lang.String getNome_pesquisa(){
    return this.nome_pesquisa;
  }
  
  /**
   * Define nome_pesquisa
   * @param nome_pesquisa nome_pesquisa
   * @generated
   */
  public Pesquisa setNome_pesquisa(java.lang.String nome_pesquisa){
    this.nome_pesquisa = nome_pesquisa;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pesquisa object = (Pesquisa)obj;
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