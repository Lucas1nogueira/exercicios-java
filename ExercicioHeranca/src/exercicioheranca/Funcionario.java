package exercicioheranca;

/**
 *
 * @author Lucas Bastos
 */
public class Funcionario extends Pessoa {
    
    // Atributos
    private String setor;
    private boolean trabalhando;
    
    // Métodos personalizados
    public void mudarTrabalho(String novoSetor) {
        // Muda o setor do funcionário.
        this.setSetor(novoSetor);
        this.setTrabalhando(true);
    }

    // Métodos acessores
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
