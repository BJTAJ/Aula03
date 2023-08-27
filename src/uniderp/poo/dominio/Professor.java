package uniderp.poo.dominio;

import java.time.LocalDate;

public class Professor extends BasePessoa {

  private String registro;
  private LocalDate dataContratacao;
  
    public String getRegistro() {
      return registro;
    }
    public void setRegistro(String registro) {
      this.registro = registro;
    }
    public LocalDate getDataContratacao() {
      return dataContratacao;
  }
    public void setDataContratacao(LocalDate dataContratacao) {
      this.dataContratacao = dataContratacao;
  } 

    public Professor() {
  }
    public Professor(int codigo, String nome, String endereco, String telefone, java.time.LocalDate dataNascimento,
      String rg, String cpf,LocalDate dataInclusao, String registro, LocalDate dataContratacao) {
    super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInclusao);
    this.registro = registro;
    this.dataContratacao = dataContratacao;
  }
 
  
  
}
