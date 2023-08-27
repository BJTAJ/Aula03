package uniderp.poo.dominio;

import java.time.LocalDate;

public abstract class BasePessoa{

  protected int codigo;
  protected String nome;
  protected String endereco;
  protected String telefone;
  protected LocalDate dataNascimento;
  protected String rg;
  protected String cpf;
  protected LocalDate dataInclusao;
  
    public int getCodigo() {
      return codigo;
    }
    public void setCodigo(int codigo) {
      this.codigo = codigo;
    }
    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public String getEndereco() {
      return endereco;
    }
    public void setEndereco(String endereco) {
      this.endereco = endereco;
    }
    public String getTelefone() {
      return telefone;
    }
    public void setTelefone(String telefone) {
      this.telefone = telefone;
    }
    public LocalDate getDataNascimento() {
      return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
      this.dataNascimento = dataNascimento;
    }
    public String getRg() {
      return rg;
    }
    public void setRg(String rg) {
      this.rg = rg;
    }
    public String getCpf() {
      return cpf;
    }
    public void setCpf(String cpf) {
      this.cpf = cpf;
    }
    public LocalDate getDataInclusao() {
      return dataInclusao;
    }
    public void setDataInclusao(LocalDate dataInclusao) {
      this.dataInclusao = dataInclusao;
    }
    
    public BasePessoa() {
    }
    public BasePessoa(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
      String cpf, LocalDate dataInclusao) {
      this.codigo = codigo;
      this.nome = nome;
      this.endereco = endereco;
      this.telefone = telefone;
      this.dataNascimento = dataNascimento;
      this.rg = rg;
      this.cpf = cpf;
      this.dataInclusao = dataInclusao;
  }
  
  
}