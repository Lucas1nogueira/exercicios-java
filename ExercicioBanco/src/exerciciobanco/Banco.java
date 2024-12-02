package exerciciobanco;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Bastos
 */
public class Banco {
    // Atributos
    
    private String tipoConta;
    private String nomeCliente;
    private boolean status;
    private float saldo;
    
    // Construtor
    
    public Banco() {
        this.status = false;
        this.saldo = 0f;
    }
    
    // Métodos personalizados
    
    public void abrirConta(String tipoConta) {
        // Define o status como verdadeiro.
        this.setStatus(true);
        this.setTipoConta(tipoConta);
        // Define o saldo, dependendo do tipo de conta escolhido.
        if(tipoConta.equals("CP")) {
            this.setSaldo(150f);
        } else if(tipoConta.equals("CC")) {
            this.setSaldo(50f);
        }
    }
    
    public void fecharConta() {
        // Verificando se a conta existe.
        if(this.isStatus() == true) {
            // Verificando se ainda há saldo na conta.
            if(this.getSaldo() == 0f) {
                // Exibe mensagem e verifica confirmação.
                int op;
                op = JOptionPane.showConfirmDialog(null, "Tem certeza que quer excluir?");
                if(op == 0) {
                    // Se confirmar, coloca o status da conta como falso.
                    this.setStatus(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ainda há saldo na conta!");
            }
        } else {
            // Exibe mensagem na tela.
            JOptionPane.showMessageDialog(null, "Conta inexistente!");
        }
    }
    
    public void depositar(float valor) {
        // Verificando se a conta existe.
        if(this.isStatus() == true) {
            // Verificando se o valora ser depositado é maior que zero.
            if(valor > 0f) {
                // Realiza depósito.
                this.setSaldo(this.getSaldo() + valor);
                JOptionPane.showMessageDialog(null, "Depósito realizado!");
            } else {
                // Exibe mensagem na tela.
                JOptionPane.showMessageDialog(null, "O valor deve ser maior que zero!");
            }
        } else {
            // Exibe mensagem na tela.
            JOptionPane.showMessageDialog(null, "Conta inexistente!");
        }
    }
    
    public void sacar(float valor) {
        // Verificando se a conta existe.
        if(this.isStatus() == true) {
            // Verificando se há saldo suficiente.
            if(this.getSaldo() >= valor) {
                // Verifica se o valor a ser sacado é maior que zero.
                if(valor > 0) {
                    // Realiza saque.
                    this.setSaldo(this.getSaldo() - valor);
                    JOptionPane.showMessageDialog(null, "Saque realizado!");
                } else {
                    // Exibe mensagem na tela.
                    JOptionPane.showMessageDialog(null, "O valor deve ser maior que zero!");
                }
            } else {
                // Exibe mensagem na tela.
                JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
            }
        } else {
            // Exibe mensagem na tela.
            JOptionPane.showMessageDialog(null, "Conta inexistente!");
        }
    }
    
    public void pagarMensalidade() {
        // Verificando se a conta existe.
        if(this.isStatus() == true) {
            // Verifica qual é o tipo de conta para cobrança.
            if(this.getTipoConta().equals("CC")) {
                // Se for corrente, paga 12 reais.
                this.setSaldo(this.getSaldo() - 12f);
            } else if (this.getTipoConta().equals("CP")) {
                // Se for poupança, paga 20 reais.
                this.setSaldo(this.getSaldo() - 20f);
            }
            // Exibe mensagem confirmando pagamento.
            JOptionPane.showMessageDialog(null, "Mensalidade paga com sucesso!");
        } else {
            // Exibe mensagem na tela.
            JOptionPane.showMessageDialog(null, "Conta inexistente!");
        }
    }
    
    // Métodos acessores
    
    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
