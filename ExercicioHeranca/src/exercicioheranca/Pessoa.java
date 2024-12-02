package exercicioheranca;

/**
 *
 * @author Lucas Bastos
 */
public class Pessoa {
    
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    // Métodos personalizados
    public void fazerAniv() {
        // Acrescenta 1 à idade da pessoa.
        this.setIdade(this.getIdade() + 1);
    }
    
    // Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
