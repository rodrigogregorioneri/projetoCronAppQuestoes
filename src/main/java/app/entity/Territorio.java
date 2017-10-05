package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela TERRITORIO
 * @generated
 */
@Entity
@Table(name = "\"TERRITORIO\"")
@XmlRootElement
public class Territorio implements Serializable {

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
  @Column(name = "regioes", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String regioes;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_estados", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Estados estados;
  
  /**
  * @generated
  */
  @Column(name = "nomeTerritorio", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeTerritorio;
  
  /**
   * Construtor
   * @generated
   */
  public Territorio(){
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
  public Territorio setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém regioes
   * return regioes
   * @generated
   */
  public java.lang.String getRegioes(){
    return this.regioes;
  }
  
  /**
   * Define regioes
   * @param regioes regioes
   * @generated
   */
  public Territorio setRegioes(java.lang.String regioes){
    this.regioes = regioes;
    return this;
  }
  
  /**
   * Obtém estados
   * return estados
   * @generated
   */
  public Estados getEstados(){
    return this.estados;
  }
  
  /**
   * Define estados
   * @param estados estados
   * @generated
   */
  public Territorio setEstados(Estados estados){
    this.estados = estados;
    return this;
  }
  
  /**
   * Obtém nomeTerritorio
   * return nomeTerritorio
   * @generated
   */
  public java.lang.String getNomeTerritorio(){
    return this.nomeTerritorio;
  }
  
  /**
   * Define nomeTerritorio
   * @param nomeTerritorio nomeTerritorio
   * @generated
   */
  public Territorio setNomeTerritorio(java.lang.String nomeTerritorio){
    this.nomeTerritorio = nomeTerritorio;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Territorio object = (Territorio)obj;
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