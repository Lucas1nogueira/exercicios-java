package exercicioencapsulamento;

/**
 *
 * @author Lucas Bastos
 */
public class ControleRemoto implements Controlador {
    
    // Atributos
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Construtor

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    // Métodos personalizados
    
    public void ligar() {
        this.setLigado(true);
    }
    
    public void desligar() {
        this.setLigado(false);
    }
    
    public void abrirMenu() {
        // Se estiver ligado, exibe o menu:
        if(this.isLigado()) {
            System.out.println("** MENU **");
            System.out.println("Está tocando? ");
            // Verifica se está tocando algo.
            if(this.isTocando()) {
                System.out.println("Sim!");
            } else {
                System.out.println("Não!");
            }
            // Exibe nível do volume.
            System.out.print("Volume: " + this.getVolume() + " ");
            for(int i=0; i<= this.getVolume(); i+=10)
                System.out.print("|");
            System.out.println("");
        }           
    }
    
    public void fecharMenu() {
        System.out.println("\nFechando menu...");
    }
    
    public void maisVolume() {
        // Verifica se está ligado e se o volume é menor que o máximo.
        if(this.isLigado() && this.getVolume() < 100) {
            // Aumenta o volume em +10.
            this.setVolume(this.getVolume() + 10);
        }
    }
    
    public void menosVolume() {
        // Verifica se está ligado e se o volume é maior que o mínimo.
        if(this.isLigado() && this.getVolume() > 0) {
            // Diminui o volume em - 10.
            this.setVolume(this.getVolume() - 10);
        }
    }
    
    public void ligarMudo() {
        // Verifica se está ligado e se o volume não está zerado.
        if(this.isLigado() && this.getVolume() > 0) {
            // Se sim, atribui ao volume como zero.
            this.setVolume(0);
        }
    }
    
    public void desligarMudo() {
        // Verifica se está ligado e se o volume está zerado.
        if(this.isLigado() && this.getVolume() == 0) {
            // Se sim, atribui 50 ao volume.
            this.setVolume(50);
        }
    }
    
    public void play() {
        // Verifica se está ligado e se não está tocando.
        if(this.isLigado() && this.isTocando() == false) {
            // Se sim, ativa o modo tocando.
            this.setTocando(true);
        }
    }
    
    public void pause() {
        // Verifica se está ligado e tocando algo.
        if(this.isLigado() && this.isTocando()) {
            // Se sim, desativa o modo tocando.
            this.setTocando(false);
        }
    }
    
    // Métodos acessores (atividade pediu que fossem privados)

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
}
