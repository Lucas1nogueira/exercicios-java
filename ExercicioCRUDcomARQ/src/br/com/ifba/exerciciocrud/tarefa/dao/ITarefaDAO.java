package br.com.ifba.exerciciocrud.tarefa.dao;

import br.com.ifba.exerciciocrud.tarefa.model.Tarefa;
import java.util.List;
import br.com.ifba.exerciciocrud.infrastructure.dao.IBaseDAO;

/**
 *
 * @author Lucas Bastos
 */
public interface ITarefaDAO extends IBaseDAO<Tarefa> {
    
    // Interface do TarefaDAO
    
    List<Tarefa> pesquisar(String busca);
    
}
