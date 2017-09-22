package cronapp.app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela ESTADOS
 * @generated
 */
@Entity
@Table(name = "\"ESTADOS\"")
@XmlRootElement
public class Estados implements Serializable {

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
  @JoinColumn(name="fk_cidades", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Cidades cidades;
  
  /**
  * @generated
  */
  @Column(name = "nomeEstado", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeEstado;
  
  /**
   * Construtor
   * @generated
   */
  public Estados(){
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
  public Estados setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém cidades
   * return cidades
   * @generated
   */
  public Cidades getCidades(){
    return this.cidades;
  }
  
  /**
   * Define cidades
   * @param cidades cidades
   * @generated
   */
  public Estados setCidades(Cidades cidades){
    this.cidades = cidades;
    return this;
  }
  
  /**
   * Obtém nomeEstado
   * return nomeEstado
   * @generated
   */
  public java.lang.String getNomeEstado(){
    return this.nomeEstado;
  }
  
  /**
   * Define nomeEstado
   * @param nomeEstado nomeEstado
   * @generated
   */
  public Estados setNomeEstado(java.lang.String nomeEstado){
    this.nomeEstado = nomeEstado;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Estados object = (Estados)obj;
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