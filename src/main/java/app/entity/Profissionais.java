package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela PROFISSIONAIS
 * @generated
 */
@Entity
@Table(name = "\"PROFISSIONAIS\"")
@XmlRootElement
public class Profissionais implements Serializable {

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
  @Column(name = "Sobrenome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String sobrenome;
  
  /**
  * @generated
  */
  @Column(name = "idade", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer idade;
  
  /**
  * @generated
  */
  @Column(name = "escolaridade", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String escolaridade;
  
  /**
  * @generated
  */
  @Column(name = "classificacao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String classificacao;
  
  /**
  * @generated
  */
  @Column(name = "curso", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String curso;
  
  /**
  * @generated
  */
  @Column(name = "skype", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String skype;
  
  /**
  * @generated
  */
  @Column(name = "whatsapp", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String whatsapp;
  
  /**
  * @generated
  */
  @Column(name = "facebook", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String facebook;
  
  /**
  * @generated
  */
  @Column(name = "instagram", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String instagram;
  
  /**
  * @generated
  */
  @Column(name = "linkedin", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String linkedin;
  
  /**
  * @generated
  */
  @Column(name = "telefone", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String telefone;
  
  /**
  * @generated
  */
  @Column(name = "celular", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String celular;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cargo", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Cargo cargo;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_empresa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Empresa empresa;
  
  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
  * @generated
  */
  @Column(name = "iduser", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String iduser;
  
  /**
   * Construtor
   * @generated
   */
  public Profissionais(){
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
  public Profissionais setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém sobrenome
   * return sobrenome
   * @generated
   */
  public java.lang.String getSobrenome(){
    return this.sobrenome;
  }
  
  /**
   * Define sobrenome
   * @param sobrenome sobrenome
   * @generated
   */
  public Profissionais setSobrenome(java.lang.String sobrenome){
    this.sobrenome = sobrenome;
    return this;
  }
  
  /**
   * Obtém idade
   * return idade
   * @generated
   */
  public java.lang.Integer getIdade(){
    return this.idade;
  }
  
  /**
   * Define idade
   * @param idade idade
   * @generated
   */
  public Profissionais setIdade(java.lang.Integer idade){
    this.idade = idade;
    return this;
  }
  
  /**
   * Obtém escolaridade
   * return escolaridade
   * @generated
   */
  public java.lang.String getEscolaridade(){
    return this.escolaridade;
  }
  
  /**
   * Define escolaridade
   * @param escolaridade escolaridade
   * @generated
   */
  public Profissionais setEscolaridade(java.lang.String escolaridade){
    this.escolaridade = escolaridade;
    return this;
  }
  
  /**
   * Obtém classificacao
   * return classificacao
   * @generated
   */
  public java.lang.String getClassificacao(){
    return this.classificacao;
  }
  
  /**
   * Define classificacao
   * @param classificacao classificacao
   * @generated
   */
  public Profissionais setClassificacao(java.lang.String classificacao){
    this.classificacao = classificacao;
    return this;
  }
  
  /**
   * Obtém curso
   * return curso
   * @generated
   */
  public java.lang.String getCurso(){
    return this.curso;
  }
  
  /**
   * Define curso
   * @param curso curso
   * @generated
   */
  public Profissionais setCurso(java.lang.String curso){
    this.curso = curso;
    return this;
  }
  
  /**
   * Obtém skype
   * return skype
   * @generated
   */
  public java.lang.String getSkype(){
    return this.skype;
  }
  
  /**
   * Define skype
   * @param skype skype
   * @generated
   */
  public Profissionais setSkype(java.lang.String skype){
    this.skype = skype;
    return this;
  }
  
  /**
   * Obtém whatsapp
   * return whatsapp
   * @generated
   */
  public java.lang.String getWhatsapp(){
    return this.whatsapp;
  }
  
  /**
   * Define whatsapp
   * @param whatsapp whatsapp
   * @generated
   */
  public Profissionais setWhatsapp(java.lang.String whatsapp){
    this.whatsapp = whatsapp;
    return this;
  }
  
  /**
   * Obtém facebook
   * return facebook
   * @generated
   */
  public java.lang.String getFacebook(){
    return this.facebook;
  }
  
  /**
   * Define facebook
   * @param facebook facebook
   * @generated
   */
  public Profissionais setFacebook(java.lang.String facebook){
    this.facebook = facebook;
    return this;
  }
  
  /**
   * Obtém instagram
   * return instagram
   * @generated
   */
  public java.lang.String getInstagram(){
    return this.instagram;
  }
  
  /**
   * Define instagram
   * @param instagram instagram
   * @generated
   */
  public Profissionais setInstagram(java.lang.String instagram){
    this.instagram = instagram;
    return this;
  }
  
  /**
   * Obtém linkedin
   * return linkedin
   * @generated
   */
  public java.lang.String getLinkedin(){
    return this.linkedin;
  }
  
  /**
   * Define linkedin
   * @param linkedin linkedin
   * @generated
   */
  public Profissionais setLinkedin(java.lang.String linkedin){
    this.linkedin = linkedin;
    return this;
  }
  
  /**
   * Obtém telefone
   * return telefone
   * @generated
   */
  public java.lang.String getTelefone(){
    return this.telefone;
  }
  
  /**
   * Define telefone
   * @param telefone telefone
   * @generated
   */
  public Profissionais setTelefone(java.lang.String telefone){
    this.telefone = telefone;
    return this;
  }
  
  /**
   * Obtém celular
   * return celular
   * @generated
   */
  public java.lang.String getCelular(){
    return this.celular;
  }
  
  /**
   * Define celular
   * @param celular celular
   * @generated
   */
  public Profissionais setCelular(java.lang.String celular){
    this.celular = celular;
    return this;
  }
  
  /**
   * Obtém cargo
   * return cargo
   * @generated
   */
  public Cargo getCargo(){
    return this.cargo;
  }
  
  /**
   * Define cargo
   * @param cargo cargo
   * @generated
   */
  public Profissionais setCargo(Cargo cargo){
    this.cargo = cargo;
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
  public Profissionais setEmpresa(Empresa empresa){
    this.empresa = empresa;
    return this;
  }
  
  /**
   * Obtém nome
   * return nome
   * @generated
   */
  public java.lang.String getNome(){
    return this.nome;
  }
  
  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Profissionais setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém iduser
   * return iduser
   * @generated
   */
  public java.lang.String getIduser(){
    return this.iduser;
  }
  
  /**
   * Define iduser
   * @param iduser iduser
   * @generated
   */
  public Profissionais setIduser(java.lang.String iduser){
    this.iduser = iduser;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Profissionais object = (Profissionais)obj;
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