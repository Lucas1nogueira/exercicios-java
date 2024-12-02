package br.com.ifba.exerciciocrud.dao;

import static br.com.ifba.exerciciocrud.dao.GenericDAO.manager;
import br.com.ifba.exerciciocrud.entities.Tarefa;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Lucas Bastos
 */
public class TarefaDAO extends GenericDAO<Tarefa> {

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
