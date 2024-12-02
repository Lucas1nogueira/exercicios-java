package exerciciorelacionamento;

/**
 *
 * @author Lucas Bastos
 */
public class ExercicioRelacionamento {

    public static void main(String[] args) {
        
        // Instanciando nova pessoa.
        Pessoa p1 = new Pessoa("Eduardo", 27, "Masculino");
        
        // Utilizando interface.
        Publicacao l1 = new Livro("Matemática", "Luís", 100, 35, false, p1);
        
        // Abrindo livro.
        l1.abrir();
        
        // Exibindo detalhes do livro.
        l1.detalhes();
        
    }
    
}
