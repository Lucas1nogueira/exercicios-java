package exercicioheranca;

/**
 *
 * @author Lucas Bastos
 */
public class ExercicioHeranca {

    public static void main(String[] args) {
        
        // Instanciando objeto da classe Aluno.
        Aluno a1 = new Aluno();
        a1.setNome("Lucas");
        a1.setIdade(21);
        a1.setSexo("Masculino");
        a1.setCurso("ADS");
        a1.setMatricula("123456789");
        
        // Instanciando objeto da classe Professor.
        Professor p1 = new Professor();
        p1.setNome("Pedro");
        p1.setIdade(30);
        p1.setSexo("Masculino");
        p1.setSalario(10000.0);
        p1.setEspecialidade("Engenharia de software");
        p1.receberAum(1000.0);
        
        // Instanciando objeto da classe Funcionário.
        Funcionario f1 = new Funcionario();
        f1.setNome("Gabriela");
        f1.setIdade(28);
        f1.setSexo("Feminino");
        f1.fazerAniv();
        f1.setTrabalhando(true);
        f1.setSetor("Refeitório");
        f1.mudarTrabalho("Administração");
        
        // Impressão dos dados na saída.
        System.out.println("Dados:");
        
        // Dados do aluno:
        System.out.println("\nAluno: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Sexo: " + a1.getSexo());
        System.out.println("Cursando: " + a1.getCurso());
        System.out.println("Matrícula: " + a1.getMatricula());
        
        // Dados do professor:
        System.out.println("\nProfessor: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Sexo: " + p1.getSexo());
        System.out.println("Especialidade: " + p1.getEspecialidade());
        System.out.println("Salário pós-aumento: " + p1.getSalario());
        
        // Dados do funcionário.
        System.out.println("\nFuncionário: " + f1.getNome());
        System.out.println("Idade pós-aniversário: " + f1.getIdade());
        System.out.println("Sexo: " + f1.getSexo());
        System.out.println("Trabalhando? " + f1.isTrabalhando());
        System.out.println("Novo setor pós-mudança: " + f1.getSetor());
        
    }
    
}
