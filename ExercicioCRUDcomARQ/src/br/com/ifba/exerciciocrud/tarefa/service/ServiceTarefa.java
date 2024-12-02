package br.com.ifba.exerciciocrud.tarefa.service;

import br.com.ifba.exerciciocrud.tarefa.dao.ITarefaDAO;
import br.com.ifba.exerciciocrud.tarefa.dao.TarefaDAO;
import br.com.ifba.exerciciocrud.tarefa.model.Tarefa;
import br.com.ifba.exerciciocrud.infrastructure.exception.BusinessException;
import java.util.List;
import javax.swing.JOptionPane;

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
    
    public final static String NOME_VAZIO = "Campo de nome vazio";
    
    public final static String QTD_INVALIDA = "Quantidade inválida";
    
    public final static String DESCRICAO_VAZIA = "Campo da descrição vazio";
    
    public final static String FORNECEDOR_VAZIO = "Campo do fornecedor vazio";

    // =================== OBJETO ========================
    
    private final ITarefaDAO daoTarefa = new TarefaDAO();

    // =================== MÉTODOS =======================
    
    @Override
    public List<Tarefa> encontrarTodasTarefas() {
        return this.daoTarefa.encontrarTodos();
    }

    public void inserirTarefa(Tarefa tar) {
        // Tratamento de exceções
        if (tar == null) {
            // Objeto nulo
            throw new BusinessException(TAREFA_NULL);
        } else if (tar.getNome().isEmpty()) {
            // Nome vazio
            JOptionPane.showMessageDialog(null, NOME_VAZIO);
            throw new BusinessException(NOME_VAZIO);
        } else if (!Integer.toString(tar.getQuantidade()).matches("[0-9]+")) {
            // Quantidade não tiver apenas números
            JOptionPane.showMessageDialog(null, QTD_INVALIDA);
            throw new BusinessException(QTD_INVALIDA);
        } else if (tar.getDescricao().isEmpty()) {
            // Descrição vazia
            JOptionPane.showMessageDialog(null, DESCRICAO_VAZIA);
            throw new BusinessException(DESCRICAO_VAZIA);
        } else if (tar.getFornecedor().isEmpty()) {
            // Fornecedor vazio
            JOptionPane.showMessageDialog(null, FORNECEDOR_VAZIO);
            throw new BusinessException(FORNECEDOR_VAZIO);
        } else if (daoTarefa.obterPeloID(tar.getId()) != null) {
            // ID já existente
            throw new BusinessException(TAREFA_EXISTE);
        } else {
            daoTarefa.inserir(tar);
        }
    }

    @Override
    public void alterarTarefa(Tarefa tar) {
        // Tratamento de exceções
        if (tar == null) {
            // Objeto nulo
            throw new BusinessException(TAREFA_NULL);
        } else if (tar.getNome().isEmpty()) {
            // Nome vazio
            JOptionPane.showMessageDialog(null, NOME_VAZIO);
            throw new BusinessException(NOME_VAZIO);
        } else if (!Integer.toString(tar.getQuantidade()).matches("[0-9]+")) {
            // Quantidade não tiver apenas números
            JOptionPane.showMessageDialog(null, QTD_INVALIDA);
            throw new BusinessException(QTD_INVALIDA);
        } else if (tar.getDescricao().isEmpty()) {
            // Descrição vazia
            JOptionPane.showMessageDialog(null, DESCRICAO_VAZIA);
            throw new BusinessException(DESCRICAO_VAZIA);
        } else if (tar.getFornecedor().isEmpty()) {
            // Fornecedor vazio
            JOptionPane.showMessageDialog(null, FORNECEDOR_VAZIO);
            throw new BusinessException(FORNECEDOR_VAZIO);
        } else if (daoTarefa.obterPeloID(tar.getId()) == null) {
            // ID não existente
            throw new BusinessException(TAREFA_NAO_EXISTE);
        } else {
            daoTarefa.alterar(tar);
        }
    }

    @Override
    public void removerTarefa(Tarefa tar) {
        // Tratamento de exceções
        if (tar == null) {
            // Objeto nulo
            throw new BusinessException(TAREFA_NULL);
        } else if (daoTarefa.obterPeloID(tar.getId()) == null) {
            // ID não existente
            throw new BusinessException(TAREFA_NAO_EXISTE);
        } else {
            daoTarefa.remover(tar);
        }
    }

    @Override
    public List<Tarefa> buscarTarefa(String nome) {
        // Não há exceções para casos de busca.
        return daoTarefa.pesquisar(nome);
    }

}
