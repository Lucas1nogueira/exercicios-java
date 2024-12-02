package prova;

import java.util.ArrayList;

/**
 *
 * @author curso
 */
public class Curso {
    
    // Atributos
    private String nome;
    private String codigoCurso;
    private Servidor coordenador;
    private ArrayList<Turma> turmas;
    
    // Construtor
    public Curso(String nome, String codigoCurso, Servidor coordenador) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.coordenador = coordenador;
        // Instanciando nova lista para turmas.
        this.turmas = new ArrayList();
    }
    
    // Métodos personalizados
    public void addTurma(Turma tm) {
        // Adiciona nova turma ao curso.
        turmas.add(tm);
    }
    
    // Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Servidor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Servidor coordenador) {
        this.coordenador = coordenador;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
    
}
