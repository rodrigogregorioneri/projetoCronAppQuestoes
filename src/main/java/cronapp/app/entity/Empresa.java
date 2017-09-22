package cronapp.app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela EMPRESA
 * @generated
 */
@Entity
@Table(name = "\"EMPRESA\"")
@XmlRootElement
public class Empresa implements Serializable {

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
  @Column(name = "razao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String razao;
  
  /**
  * @generated
  */
  @Column(name = "qtdFuncionarios", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer qtdFuncionarios;
  
  /**
  * @generated
  */
  @Column(name = "cnpj", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer cnpj;
  
  /**
  * @generated
  */
  @Column(name = "segmento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String segmento;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_ramo", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Ramo ramo;
  
  /**
   * Construtor
   * @generated
   */
  public Empresa(){
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
  public Empresa setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém razao
   * return razao
   * @generated
   */
  public java.lang.String getRazao(){
    return this.razao;
  }
  
  /**
   * Define razao
   * @param razao razao
   * @generated
   */
  public Empresa setRazao(java.lang.String razao){
    this.razao = razao;
    return this;
  }
  
  /**
   * Obtém qtdFuncionarios
   * return qtdFuncionarios
   * @generated
   */
  public java.lang.Integer getQtdFuncionarios(){
    return this.qtdFuncionarios;
  }
  
  /**
   * Define qtdFuncionarios
   * @param qtdFuncionarios qtdFuncionarios
   * @generated
   */
  public Empresa setQtdFuncionarios(java.lang.Integer qtdFuncionarios){
    this.qtdFuncionarios = qtdFuncionarios;
    return this;
  }
  
  /**
   * Obtém cnpj
   * return cnpj
   * @generated
   */
  public java.lang.Integer getCnpj(){
    return this.cnpj;
  }
  
  /**
   * Define cnpj
   * @param cnpj cnpj
   * @generated
   */
  public Empresa setCnpj(java.lang.Integer cnpj){
    this.cnpj = cnpj;
    return this;
  }
  
  /**
   * Obtém segmento
   * return segmento
   * @generated
   */
  public java.lang.String getSegmento(){
    return this.segmento;
  }
  
  /**
   * Define segmento
   * @param segmento segmento
   * @generated
   */
  public Empresa setSegmento(java.lang.String segmento){
    this.segmento = segmento;
    return this;
  }
  
  /**
   * Obtém ramo
   * return ramo
   * @generated
   */
  public Ramo getRamo(){
    return this.ramo;
  }
  
  /**
   * Define ramo
   * @param ramo ramo
   * @generated
   */
  public Empresa setRamo(Ramo ramo){
    this.ramo = ramo;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Empresa object = (Empresa)obj;
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