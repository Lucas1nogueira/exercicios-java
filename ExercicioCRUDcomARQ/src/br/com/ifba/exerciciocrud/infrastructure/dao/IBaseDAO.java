package br.com.ifba.exerciciocrud.infrastructure.dao;

import br.com.ifba.exerciciocrud.infrastructure.model.AbstractEntity;
import java.util.List;

/**
 *
 * @author Lucas Bastos
 * @param <T>
 */
public interface IBaseDAO<T extends AbstractEntity> {
    
    // Interface do GenericDAO
    
    T obterPeloID(Long id);

    List<T> encontrarTodos();

    void inserir(T entity);

    void alterar(T entity);

    void remover(T entity);
    
}
