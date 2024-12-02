package exercicioencapsulamento;

/**
 *
 * @author Lucas Bastos
 */
public class ExercicioEncapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciando novo objeto.
        Controlador c1 = new ControleRemoto();
        
        // Ligando o controle.
        c1.ligar();
        
        // Aumentando volume.
        c1.maisVolume();
        
        // Tocando algo.
        c1.play();
        
        // Exibindo menu.
        c1.abrirMenu();
    }
    
}
