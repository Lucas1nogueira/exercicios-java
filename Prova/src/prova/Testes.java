package prova;

/**
 *
 * @author curso
 */
public class Testes {
    
    // Método para imprimir informações na saída.
    public void listarInfo(Curso crs) {
        
        System.out.println("Nome do curso: " + crs.getNome());
        System.out.println("Código do curso: " + crs.getCodigoCurso());
        
        for(Turma trm: crs.getTurmas()) {
            System.out.println("\nNome da turma: " + trm.getNome());
            System.out.println("Ano letivo: " + trm.getAnoLetivo());
            System.out.println("Limite de alunos: " + trm.getLimiteAlunos());
            
            for(Disciplina dsc: trm.getDisciplinas()) {
                System.out.println("\nNome da disciplina: " + dsc.getNome());
                System.out.println("Código da disciplina: " + dsc.getCodigo());
                
                for(Professor pfr: dsc.getProfessores()) {
                    System.out.println("\nNome do professor: " + pfr.getNome());
                    System.out.println("Telefone: " + pfr.getTelefone());
                    System.out.println("E-mail: " + pfr.getEmail());
                    System.out.println("CPF: " + pfr.getCpf());
                    System.out.println("Siape: " + pfr.getSiape());
                }
            }
            
            for(Aluno aln: trm.getAlunos()) {
                System.out.println("\nNome do aluno: " + aln.getNome());
                System.out.println("Telefone: " + aln.getTelefone());
                System.out.println("E-mail: " + aln.getEmail());
                System.out.println("CPF: " + aln.getCpf());
                System.out.println("Matrícula: " + aln.getMatricula());
                System.out.println("Responsável: " + aln.getResp().getNome());
            }
        }
    }
    
}
