package atvherancab;

/**
 *
 * @author Lucas Bastos
 */
public class Professor extends Pessoa {
    
    // Atributos
    private String especialidade;
    private double salario;
    
    // Métodos personalizados
    public void receberAumento(double valor) {
        // Aumenta o valor do salário recebido.
        this.setSalario(this.getSalario() + valor);
    }

    // Métodos acessores
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
