package exerciciopolimorfismo;

/**
 *
 * @author Lucas Bastos
 */
public class Peixe extends Animal {
    
    // Atributos
    
    private String corEscama;
    
    // Construtor

    public Peixe(String corEscama, float peso, int idade, int membros) {
        this.corEscama = corEscama;
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }
    
    // Sobreposição de métodos
    
    @Override
    public void locomover() {
        System.out.println("* Nadando... *");
    }
    
    @Override
    public void alimentar() {
        System.out.println("* Comendo peixes menores... *");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("(Não emite som)");
    }
    
    // Métodos personalizados
    
    public void soltarBolha() {
        System.out.println("* Soltando bolha... *");
    }
    
    // Métodos acessores

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
