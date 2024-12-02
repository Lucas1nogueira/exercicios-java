package prova;

/**
 *
 * @author curso
 */
public class Prova {

    public static void main(String[] args) {
        
        // Instanciando objetos para testes.
        Aluno alns[] = new Aluno[2];
        Responsavel pai = new Responsavel("Alex", "991774477", "alex@mail.com", "784455657");
        Turma trm = new Turma("3o Semestre", 3);
        Disciplina dsc[] = new Disciplina[2];
        Professor pfr[] = new Professor[2];
        
        Servidor coordenador = new Servidor();
        coordenador.setNome("George");
        coordenador.setTelefone("988378164");
        coordenador.setEmail("george@mail.com");
        coordenador.setCpf("873694582");
        coordenador.setSiape("909");
        
        Curso crs = new Curso("Básico", "872", coordenador);
        
        // Preenchendo alunos.
        alns[0] = new Aluno("Pedro", "999010101", "pedro@mail.com", "123456789", "001", pai);
        alns[1] = new Aluno("João", "999020202", "joao@mail.com", "223344556", "002", pai);
        
        // Preenchendo disciplinas.
        dsc[0] = new Disciplina("Matemática", "001");
        dsc[1] = new Disciplina("Português", "002");
        
        // Preenchendo professores.
        pfr[0] = new Professor("Eduardo", "988040404", "eduardo@mail.com", "505505505", "909", dsc[0]);
        pfr[1] = new Professor("José", "988535353", "jose@mail.com", "614872935", "950", dsc[1]);
        
        // Adicionando alunos na turma.
        trm.addAluno(alns[0]);
        trm.addAluno(alns[1]);
        
        // Adicionando professores às disciplinas.
        dsc[0].addProfessor(pfr[0]);
        dsc[1].addProfessor(pfr[1]);
        
        // Adicionando disciplinas à turma.
        trm.inserirDisciplina(dsc[0]);
        trm.inserirDisciplina(dsc[1]);
        
        // Adicionando turma ao curso.
        crs.addTurma(trm);
        
        // Imprimindo testes.
        Testes tst = new Testes();
        tst.listarInfo(crs);
        
    }
    
}
