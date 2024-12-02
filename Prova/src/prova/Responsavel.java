package prova;

/**
 *
 * @author curso
 */
public class Responsavel extends Pessoa {
    
    // Não foram informados atributos específicos.
    
    // Construtor.
    public Responsavel(String nome, String telefone, String email, String cpf) {
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setEmail(email);
        super.setCpf(cpf);
    }
    
    // Não foram necessários métodos acessores pois não há atributos específicos para esta classe.
    
}
