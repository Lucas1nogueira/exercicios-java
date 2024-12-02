package br.com.ifba.exerciciocrud.entities;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Lucas Bastos
 */

@Entity
@Table(name="tarefas")
public class Tarefa extends AbstractEntity {

    // Atributos
    
    private String nome;
    private int quantidade;
    private String descricao;
    private String fornecedor;
    private boolean finalizado;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataFinalizacao;

    // Construtor

    public Tarefa() {
        this.finalizado = false;
    }
    
    // Métodos acessores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Calendar getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Calendar dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }
    
}
