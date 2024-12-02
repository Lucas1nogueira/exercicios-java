package br.com.ifba.exerciciocrud.tarefa.dao;

import br.com.ifba.exerciciocrud.infrastructure.dao.BaseDAO;
import br.com.ifba.exerciciocrud.tarefa.model.Tarefa;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Lucas Bastos
 */
public class TarefaDAO extends BaseDAO<Tarefa> implements ITarefaDAO {

    @Override
    public List<Tarefa> pesquisar(String busca) {

        // Pesquisa por tarefa no banco de dados
        Query query = manager.createQuery("SELECT a FROM Tarefa a "
                + "WHERE a.nome LIKE CONCAT ('%', ?1, '%')", Tarefa.class);
        query.setParameter(1, busca);

        // Salva a lista de tarefas encontradas
        List<Tarefa> tar = query.getResultList();

        // Retorna a lista
        return tar;

    }

}