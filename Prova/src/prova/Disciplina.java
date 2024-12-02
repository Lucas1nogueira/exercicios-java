package prova;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author curso
 */
public class Disciplina {
    
    // Atributos
    private String nome;
    private String codigo;
    private ArrayList<Professor> professores;
    
    // Construtor
    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        // Instanciando lista de professores.
        this.professores = new ArrayList();
    }
    
    // Métodos personalizados
    public void addProfessor(Professor pfr) {
        // Adiciona o professor na turma.
        professores.add(pfr);
    }
    
    public void excluirProfessor(Professor pfr) {
        // Declarando índice para buscar professor.
        int index = 0;
        // Percorrendo lista de professores.
        for(Professor pf: professores) {
            // Se o professor for encontrado.
            if(pfr.equals(pf)) {
                // Remove o professor da lista.
                professores.remove(index);
            }
            // Vai somando +1 na variável do index.
            index++;
        }
    }
    
    public void avaliacaoComportamento() {
        // Gerando número aleatório para usar como avaliação de comportamento da turma.
        Random aleatorio = new Random();
        int aval = aleatorio.nextInt(2);
        if(aval == 0) {
            System.out.println("A turma possui bom desempenho!");
        } else {
            System.out.println("A turma posui desempenho mediano!");
        }
    }
    
    // Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }
    
}
