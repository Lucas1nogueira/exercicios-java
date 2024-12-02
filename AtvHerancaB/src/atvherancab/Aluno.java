package atvherancab;

/**
 *
 * @author Lucas Bastos
 */
public class Aluno extends Pessoa {
    
    // Atributos
    private String matricula;
    private String curso;
    
    // Métodos personalizados
    public void pagarMensalidade() {
        // Imprime mensagem.
        System.out.println("\nMensalidade paga com sucesso!");
    }
    
    // Métodos acessores
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
