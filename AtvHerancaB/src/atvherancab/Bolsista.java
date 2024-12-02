package atvherancab;

/**
 *
 * @author Lucas Bastos
 */
public class Bolsista extends Aluno {
    
    // Atributos
    private double bolsa;
    
    // Métodos personalizados
    public void renovarBolsa() {
        // Acrescenta 200.0 para a bolsa do aluno.
        this.setBolsa(this.getBolsa() + 200.0);
    }
    
    // Métodos acessores
    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
}
