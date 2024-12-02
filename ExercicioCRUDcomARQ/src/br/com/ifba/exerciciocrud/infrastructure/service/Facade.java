package br.com.ifba.exerciciocrud.infrastructure.service;

import br.com.ifba.exerciciocrud.tarefa.model.Tarefa;
import br.com.ifba.exerciciocrud.tarefa.service.IServiceTarefa;
import br.com.ifba.exerciciocrud.tarefa.service.ServiceTarefa;
import java.util.List;

/**
 *
 * @author Lucas Bastos
 */
public class Facade implements IFacade {
    
    // =================== TAREFA ====================
    
    private final IServiceTarefa serviceTarefa = new ServiceTarefa();
    
    // =================== MÉTODOS ===================
    
    @Override
    public List<Tarefa> encontrarTodasTarefas() {
        return serviceTarefa.encontrarTodasTarefas();
    }

    @Override
    public void inserirTarefa(Tarefa tar) {
        this.serviceTarefa.inserirTarefa(tar);
    }

    @Override
    public void alterarTarefa(Tarefa tar) {
        this.serviceTarefa.alterarTarefa(tar);
    }

    @Override
    public void removerTarefa(Tarefa tar) {
        this.serviceTarefa.removerTarefa(tar);
    }
    
    @Override
    public List<Tarefa> buscarTarefa(String nome) {
        return serviceTarefa.buscarTarefa(nome);
    }
    
}
