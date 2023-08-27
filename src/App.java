import java.time.LocalDate;

import uniderp.poo.dominio.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno a1 = new Aluno();

        a1.setCodigo(2);
        a1.setCpf("987875423");
        a1.setDataInclusao(LocalDate.now());
        a1.setDataMatricula(LocalDate.of(2015, 01, 12));
        a1.setDataNascimento(LocalDate.of(2005,12,05));
        a1.setEndereco("Rua solano,22");
        a1.setMatricula("123414124124124");
        a1.setNome("Roberto");
        a1.setRg("123123124");
        a1.setTelefone("998989559");

    }
}
