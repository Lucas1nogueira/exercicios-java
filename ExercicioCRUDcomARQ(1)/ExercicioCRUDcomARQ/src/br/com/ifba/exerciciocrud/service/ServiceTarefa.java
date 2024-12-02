package br.com.ifba.exerciciocrud.service;

import br.com.ifba.exerciciocrud.dao.ITarefaDAO;
import br.com.ifba.exerciciocrud.dao.TarefaDAO;
import br.com.ifba.exerciciocrud.entities.Tarefa;
import br.com.ifba.exerciciocrud.exception.BusinessException;
import java.util.List;

/**
 *
 * @author Lucas Bastos
 */
public class ServiceTarefa implements IServiceTarefa {
    
    // =================== CONSTANTES ====================
    
    // Mensagens em casos de erros
    public final static String TAREFA_NULL = "Tarefa vazia";
    
    public final static String TAREFA_EXISTE = "Tarefa já existe";
    
    public final static String TAREFA_NAO_EXISTE = "Tarefa não existe na base de dados";
    
    public final static String TAREFA_INVALIDA = "Tarefa inválida";
    
    // =================== OBJETO ========================
    
    private final ITarefaDAO daoTarefa = new TarefaDAO();
    
    // =================== MÉTODOS =======================
    
    @Override
    public List<Tarefa> encontrarTodasTarefas() {
        return this.daoTarefa.encontrarTodos();
    }

    public void inserirTarefa(Tarefa tar) {
        // Tratamento de exceções
        if(tar == null) {
            // Objeto nulo
            throw new BusinessException(TAREFA_NULL);
        } else if(daoTarefa.obterPeloID(tar.getId()) != null) {
            // ID já existente
            throw new BusinessException(TAREFA_EXISTE);
        } else {
            daoTarefa.inserir(tar);
        }
    }

    @Override
    public void alterarTarefa(Tarefa tar) {
        // Tratamento de exceções
        if(tar == null) {
            // Objeto nulo
            throw new BusinessException(TAREFA_NULL);
        } else if(daoTarefa.obterPeloID(tar.getId()) == null) {
            // ID não existente
            throw new BusinessException(TAREFA_NAO_EXISTE);
        } else {
            daoTarefa.alterar(tar);
        }
    }

    @Override
    public void removerTarefa(Tarefa tar) {
        // Tratamento de exceções
        if(tar == null) {
            // Objeto nulo
            throw new BusinessException(TAREFA_NULL);
        } else if(daoTarefa.obterPeloID(tar.getId()) == null) {
            // ID não existente
            throw new BusinessException(TAREFA_NAO_EXISTE);
        } else {
            daoTarefa.remover(tar);
        }
    }
    
    @Override
    public List<Tarefa> buscarTarefa(String nome) {
        // Tratamento de exceções
        if(nome == null) {
            // String vazia
            throw new BusinessException("String vazia");
        } else {
            return daoTarefa.pesquisar(nome);
        }
    }
    
}
