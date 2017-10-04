package cronapp.app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela CIDADES
 * @generated
 */
@Entity
@Table(name = "\"CIDADES\"")
@XmlRootElement
public class Cidades implements Serializable {

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
  @JoinColumn(name="fk_empresa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Empresa empresa;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_profissionais", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Profissionais profissionais;
  
  /**
  * @generated
  */
  @Column(name = "nomeCidade", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeCidade;
  
  /**
   * Construtor
   * @generated
   */
  public Cidades(){
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
  public Cidades setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém empresa
   * return empresa
   * @generated
   */
  public Empresa getEmpresa(){
    return this.empresa;
  }
  
  /**
   * Define empresa
   * @param empresa empresa
   * @generated
   */
  public Cidades setEmpresa(Empresa empresa){
    this.empresa = empresa;
    return this;
  }
  
  /**
   * Obtém profissionais
   * return profissionais
   * @generated
   */
  public Profissionais getProfissionais(){
    return this.profissionais;
  }
  
  /**
   * Define profissionais
   * @param profissionais profissionais
   * @generated
   */
  public Cidades setProfissionais(Profissionais profissionais){
    this.profissionais = profissionais;
    return this;
  }
  
  /**
   * Obtém nomeCidade
   * return nomeCidade
   * @generated
   */
  public java.lang.String getNomeCidade(){
    return this.nomeCidade;
  }
  
  /**
   * Define nomeCidade
   * @param nomeCidade nomeCidade
   * @generated
   */
  public Cidades setNomeCidade(java.lang.String nomeCidade){
    this.nomeCidade = nomeCidade;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Cidades object = (Cidades)obj;
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
