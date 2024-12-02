package exerciciopolimorfismo;

/**
 *
 * @author Lucas Bastos
 */
public class Mamifero extends Animal {
    
    // Atributos
    
    private String corPelo;
    
    // Construtor

    public Mamifero(String corPelo, float peso, int idade, int membros) {
        this.corPelo = corPelo;
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }
    
    // Sobreposição de métodos
    
    @Override
    public void locomover() {
        System.out.println("* Andando... *");
    }
    
    @Override
    public void alimentar() {
        System.out.println("* Mamando... *");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("* Emitindo som vocal... *");
    }
    
    // Métodos acessores

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
