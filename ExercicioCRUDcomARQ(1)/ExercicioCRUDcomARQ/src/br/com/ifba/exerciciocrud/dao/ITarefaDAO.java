package br.com.ifba.exerciciocrud.dao;

import br.com.ifba.exerciciocrud.entities.Tarefa;
import java.util.List;

/**
 *
 * @author Lucas Bastos
 */
public interface ITarefaDAO extends IGenericDAO<Tarefa> {
    
    // Interface do TarefaDAO
    
    List<Tarefa> pesquisar(String busca);
    
}
