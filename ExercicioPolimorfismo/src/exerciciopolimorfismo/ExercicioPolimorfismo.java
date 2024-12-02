package exerciciopolimorfismo;

/**
 *
 * @author Lucas Bastos
 */
public class ExercicioPolimorfismo {

    public static void main(String[] args) {
        
        // Instanciando objetos para testes.
        
        Mamifero m1 = new Mamifero("Amarelo", 15.0f, 5, 4);
        Reptil r1 = new Reptil("Verde", 60.0f, 20, 4);
        Peixe p1 = new Peixe("Azul marinho", 3.0f, 5, 0);
        Ave a1 = new Ave("Branco", 10.0f, 8, 2);
        
        // Exibindo testes.
        
        System.out.println("Mamífero:");
        System.out.println("Cor do pelo: " + m1.getCorPelo());
        System.out.println("Peso: " + m1.getPeso() + " kgs");
        System.out.println("Idade: " + m1.getIdade() + " anos");
        System.out.println("Membros: " + m1.getMembros());
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();
        
        System.out.println("\nRéptil:");
        System.out.println("Cor da escama: " + r1.getCorEscama());
        System.out.println("Peso: " + r1.getPeso() + " kgs");
        System.out.println("Idade: " + r1.getIdade() + " anos");
        System.out.println("Membros: " + r1.getMembros());
        r1.locomover();
        r1.alimentar();
        r1.emitirSom();
        
        System.out.println("\nPeixe:");
        System.out.println("Cor da escama: " + p1.getCorEscama());
        System.out.println("Peso: " + p1.getPeso() + " kgs");
        System.out.println("Idade: " + p1.getIdade() + " anos");
        System.out.println("Membros: " + p1.getMembros());
        p1.locomover();
        p1.alimentar();
        p1.emitirSom();
        p1.soltarBolha();
        
        System.out.println("\nAve:");
        System.out.println("Cor da pena: " + a1.getCorPena());
        System.out.println("Peso: " + a1.getPeso() + " kgs");
        System.out.println("Idade: " + a1.getIdade() + " anos");
        System.out.println("Membros: " + a1.getMembros());
        a1.locomover();
        a1.alimentar();
        a1.emitirSom();
        a1.fazerNinho();
        
    }
    
}
