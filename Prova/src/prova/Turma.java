package prova;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author curso
 */
public class Turma {
    
    // Atributos
    private String nome;
    private int anoLetivo;
    private int limiteAlunos;
    private ArrayList<Aluno> alunos;
    private ArrayList<Disciplina> disciplinas;
    
    // Construtor
    public Turma(String nome, int anoLetivo) {
        this.nome = nome;
        this.anoLetivo = anoLetivo;
        // Chama método para definir número limite de alunos.
        this.limitarTurma();
        // Instanciando lista de alunos.
        alunos = new ArrayList();
        disciplinas = new ArrayList();
    }
    
    // Métodos personalizados
    public void limitarTurma() {
        // Gera um número aleatório para limitar a turma.
        Random aleatorio = new Random();
        this.limiteAlunos = aleatorio.nextInt(50);
    }
    
    public void addAluno(Aluno aln) {
        // Verifica se há espaço suficiente para o novo aluno.
        if(alunos.size() < limiteAlunos) {
            // Se houver, adiciona o aluno na lista de alunos.
            alunos.add(aln);
        }
    }
    
    public void excluirAluno(Aluno aln) {
        // Declarando índice para buscar aluno.
        int index = 0;
        // Percorrendo lista de alunos.
        for(Aluno al: alunos) {
            // Se o aluno for encontrado.
            if(aln.equals(al)) {
                // Remove o aluno da lista.
                alunos.remove(index);
            }
            // Vai somando +1 na variável do index.
            index++;
        }
    }
    
    public void verificaAtiva() {
        // Verifica se a turma tem mais de um aluno cadastrado.
        if(alunos.size() > 0) {
            System.out.println("A turma está ativa.");
        } else {
            System.out.println("Turma inativa.");
        }
    }
    
    public void inserirDisciplina(Disciplina dsc) {
        // Insere nova disciplina na turma.
        disciplinas.add(dsc);
    }
    
    // Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public int getLimiteAlunos() {
        return limiteAlunos;
    }

    public void setLimiteAlunos(int limiteAlunos) {
        this.limiteAlunos = limiteAlunos;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
}
