package prova;

/**
 *
 * @author curso
 */
public class Aluno extends Pessoa {
    
    // Atributos
    private String matricula;
    private Responsavel resp;
    
    // Construtor
    public Aluno(String nome, String telefone, String email, String cpf, String matricula, Responsavel resp) {
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setEmail(email);
        super.setCpf(cpf);
        this.matricula = matricula;
        this.resp = resp;
    }
    
    // Métodos acessores
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Responsavel getResp() {
        return resp;
    }

    public void setResp(Responsavel resp) {
        this.resp = resp;
    }
    
}
