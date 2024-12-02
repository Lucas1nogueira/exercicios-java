package exerciciopolimorfismo;

/**
 *
 * @author Lucas Bastos
 */
public class Ave extends Animal {
    
    // Atributos
    
    private String corPena;
    
    // Construtor

    public Ave(String corPena, float peso, int idade, int membros) {
        this.corPena = corPena;
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }
    
    // Sobreposição de métodos
    
    @Override
    public void locomover() {
        System.out.println("* Voando... *");
    }
    
    @Override
    public void alimentar() {
        System.out.println("* Comendo insetos, frutas e animais menores... *");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("* Piando... *");
    }
    
    // Métodos personalizados
    
    public void fazerNinho() {
        System.out.println("* Fazendo ninho... *");
    }
    
    // Métodos acessores

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
