package atvherancab;

/**
 *
 * @author Lucas Bastos
 */
public class AtvHerancaB {

    public static void main(String[] args) {
        
        // Instanciando objeto da classe Visitante.
        Visitante v1 = new Visitante();
        v1.setNome("João");
        v1.setIdade(19);
        v1.setSexo("Masculino");
        v1.fazerAniversario();
        
        // Instanciando objeto da classe Bolsista.
        Bolsista b1 = new Bolsista();
        b1.setNome("Carlos");
        b1.setIdade(27);
        b1.setSexo("Masculino");
        b1.setCurso("Informática");
        b1.setMatricula("123456789");
        b1.renovarBolsa();
        
        // Instanciando objeto da classe Técnico.
        Tecnico t1 = new Tecnico();
        t1.setNome("Maria");
        t1.setIdade(25);
        t1.setSexo("Feminino");
        t1.setCurso("ADS");
        t1.setMatricula("987654321");
        t1.setRegistroProfissional("Trabalhando em projetos.");
        
        // Instanciando objeto da classe Professor.
        Professor p1 = new Professor();
        p1.setNome("Bianca");
        p1.setIdade(32);
        p1.setSexo("Feminino");
        p1.setSalario(12000.0);
        p1.setEspecialidade("Matemática");
        p1.receberAumento(1000.0);
        
        // Impressão dos dados na saída...
        System.out.println("Dados:");
        
        // Dados do visitante:
        System.out.println("\nVisitante: " + v1.getNome());
        System.out.println("Idade: " + v1.getIdade());
        System.out.println("Sexo: " + v1.getSexo());
        
        // Dados do bolsista:
        System.out.println("\nBolsista: " + b1.getNome());
        System.out.println("Idade: " + b1.getIdade());
        System.out.println("Sexo: " + b1.getSexo());
        System.out.println("Cursando: " + b1.getCurso());
        System.out.println("Matrícula: " + b1.getMatricula());
        
        // Dados do técnico:
        System.out.println("\nTécnico: " + t1.getNome());
        System.out.println("Idade: " + t1.getIdade());
        System.out.println("Sexo: " + t1.getSexo());
        System.out.println("Cursando: " + t1.getCurso());
        System.out.println("Matrícula: " + t1.getMatricula());
        System.out.println("Registro profissional: " + t1.getRegistroProfissional());
        
        // Dados do professor:
        System.out.println("\nProfessor: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Sexo: " + p1.getSexo());
        System.out.println("Especialidade: " + p1.getEspecialidade());
        System.out.println("Salário pós-aumento: " + p1.getSalario());
        
    }
    
}
