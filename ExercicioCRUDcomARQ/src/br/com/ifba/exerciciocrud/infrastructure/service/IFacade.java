package br.com.ifba.exerciciocrud.infrastructure.service;

import br.com.ifba.exerciciocrud.tarefa.model.Tarefa;
import java.util.List;

/**
 *
 * @author Lucas Bastos
 */
public interface IFacade {
    
    // Interface da Fachada
    
    public abstract List<Tarefa> encontrarTodasTarefas();

    public abstract void inserirTarefa(Tarefa tar);

    public abstract void alterarTarefa(Tarefa tar);

    public abstract void removerTarefa(Tarefa tar);
    
    public abstract List<Tarefa> buscarTarefa(String nome);
    
}
