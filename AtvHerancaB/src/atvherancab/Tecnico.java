package atvherancab;

/**
 *
 * @author Lucas Bastos
 */
public class Tecnico extends Aluno {
    
    // Atributos
    private String registroProfissional;
    
    // Métodos personalizados
    public void praticar() {
        // Imprime mensagem.
        System.out.println("\nPraticando...");
    }
    
    // Métodos acessores
    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
