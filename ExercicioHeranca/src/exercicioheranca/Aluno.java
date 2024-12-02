package exercicioheranca;

/**
 *
 * @author Lucas Bastos
 */
public class Aluno extends Pessoa {
    
    // Atributos
    private String matricula;
    private String curso;
    
    // Métodos personalizados
    public void cancelarMatr() {
        // Seta a matrícula do aluno como NULL.
        this.setMatricula(null);
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
