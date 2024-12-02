package br.com.ifba.exerciciocrud.dao;

import br.com.ifba.exerciciocrud.entities.AbstractEntity;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Lucas Bastos
 * @param <T>
 */
public class GenericDAO<T extends AbstractEntity> implements IGenericDAO<T> {

    // Fábrica e gerenciador p/ acesso do banco de dados
    protected static EntityManager manager;

    static {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        manager = factory.createEntityManager();
    }

    @Override
    public T obterPeloID(Long id) {

        // Encontra pelo ID
        
        /*  Retorna null caso o id seja nulo.
            Essa modificação foi feita devido ao uso da arquitetura,
            para evitar erro, já que na inserção de uma nova tarefa não há
            necessidade de o usuário informar um id.
        */
        if(id == null) {
            return null;
        }
        
        return (T) manager.find(getTypeClass(), id);

    }

    @Override
    public List<T> encontrarTodos() {

        // Cria uma lista com os itens do banco de dados
        return manager.createQuery("From " + getTypeClass().getName()).getResultList();

    }

    @Override
    public void inserir(T entity) {

        try {

            // Grava o item cadastrado no banco de dados
            manager.getTransaction().begin();
            manager.persist(entity);
            manager.getTransaction().commit();

        } catch (Exception ex) {

            // Captura exceção
            ex.printStackTrace();
            manager.getTransaction().rollback();

        }
    }

    @Override
    public void alterar(T entity) {

        try {

            // Gravando alteração no banco de dados
            manager.getTransaction().begin();
            manager.merge(entity);
            manager.getTransaction().commit();

        } catch (Exception ex) {

            // Captura exceção
            ex.printStackTrace();
            manager.getTransaction().rollback();

        }
    }

    @Override
    public void remover(T entity) {

        try {
            
            // Removendo tarefa do banco de dados
            manager.getTransaction().begin();
            manager.remove(manager.contains(entity) ? entity : manager.merge(entity));
            manager.getTransaction().commit();
            
        } catch (Exception ex) {
            
            // Captura exceção
            ex.printStackTrace();
            manager.getTransaction().rollback();
            
        }
    }
    
    private Class<?> getTypeClass() {
        
        Class<?> classe = (Class <?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return classe;
        
    }

}
