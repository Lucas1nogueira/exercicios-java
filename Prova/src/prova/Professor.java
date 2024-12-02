package prova;

/**
 *
 * @author curso
 */
public class Professor extends Servidor {
    
    private Disciplina dsc;
    
    // Construtor
    public Professor(String nome, String telefone, String email, String cpf, String siape, Disciplina dsc) {
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setCpf(cpf);
        this.setSiape(siape);
        this.dsc = dsc;
    }
    
    // Não foram necessários métodos acessores pois não há atributos específicos para esta classe.
    
}
