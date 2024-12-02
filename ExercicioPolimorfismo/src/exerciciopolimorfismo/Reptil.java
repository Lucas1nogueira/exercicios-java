package exerciciopolimorfismo;

/**
 *
 * @author Lucas Bastos
 */
public class Reptil extends Animal {
    
    // Atributos
    
    private String corEscama;
    
    // Construtor

    public Reptil(String corEscama, float peso, int idade, int membros) {
        this.corEscama = corEscama;
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }
    
    // Sobreposição de métodos
    
    @Override
    public void locomover() {
        System.out.println("* Rastejando... *");
    }
    
    @Override
    public void alimentar() {
        System.out.println("* Comendo insetos e outros animais... ");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("* Rugindo... *");
    }
    
    // Métodos acessores

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
