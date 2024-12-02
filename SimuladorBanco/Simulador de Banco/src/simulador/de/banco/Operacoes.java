package simulador.de.banco;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Operacoes {
    
    // Atributos
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Método construtor e acessores
    public Operacoes() {
        this.numConta = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    // Instanciando objeto scanner para obter dados do usuário.
    Scanner teclado = new Scanner(System.in);

    // Métodos personalizados
    public boolean abrirConta(String c) {
        // Criando conta corrente
        if("CC".equals(c)) {
            Random numAleatorio = new Random();
            setNumConta(numAleatorio.nextInt(5000)); // Gerando número aleatório.
            System.out.println("O número da sua conta será: " + getNumConta());
            System.out.print("Insira seu nome: ");
            setDono(teclado.nextLine());
            setStatus(true); // Mudando status
            setTipo("CC");
            setSaldo(50.0f);
            System.out.println("(!) Conta criada!");
            return true;
        }
        // Criando conta poupança
        if ("CP".equals(c)) {
            Random numAleatorio = new Random();
            setNumConta(numAleatorio.nextInt(5000)); // Gerando número aleatório.
            System.out.println("O número da sua conta será: " + getNumConta());
            System.out.print("Insira seu nome: ");
            setDono(teclado.nextLine());
            setStatus(true); // Mudando status
            setTipo("CP");
            setSaldo(150.0f);
            System.out.println("(!) Conta criada!");
            return true;
        }
        // Se não retornar verdadeiro, imprime mensagem e retorna falso.
        JOptionPane.showMessageDialog(this.frameFrente(), "(!) Opção inválida.");
        return false;
    }
    
    public boolean fecharConta() {
        // Verificando condições para fechar conta.
        if(getStatus() == false) {
            JOptionPane.showMessageDialog(this.frameFrente(), "(!) Erro: conta inexistente!");
            return false;
        }
        if(getSaldo() > 0) {
            JOptionPane.showMessageDialog(this.frameFrente(), "(!) Erro: saldo existente!");
            return false;
        }
        if(getSaldo() < 0) {
            JOptionPane.showMessageDialog(this.frameFrente(),"(!) Erro: dívida existente!");
            return false;
        }
        System.out.println("A conta " + getNumConta() + " será removida.");
        System.out.print("Continuar? [S/n] ");
        // Se confirmar, exclui a conta mudando o status para falso.
        if("S".equals(teclado.nextLine())) {
            setNumConta(0);
            setTipo("");
            setDono("");
            setSaldo(0.0f);
            setStatus(false);
            System.out.println("(!) Conta excluída.");
            return true;
        } else return false;
    }
    
    public boolean depositar(float valor) {
        // Verificando condições de depósito.
        if(getStatus() == false) {
            JOptionPane.showMessageDialog(this.frameFrente(), "(!) Erro: conta não cadastrada!");
            return false;
        }
        if(valor <= 0) {
            JOptionPane.showMessageDialog(this.frameFrente(), "(!) Erro: valor deve ser positivo!");
            return false;
        }
        // Confirmando depósito.
        System.out.println("DEPÓSITO DE R$ " + valor);
        System.out.print("Continuar? [S/n] ");
        if("S".equals(teclado.nextLine())) {
            setSaldo(getSaldo() + valor);
            System.out.println("(!) Valor depositado!");
            return true;
        } else return false;
    }
    
    public boolean sacar(float valor) {
        // Verificando condições para saque.
        if(getStatus() == false) {
            JOptionPane.showMessageDialog(this.frameFrente(), "(!) Erro: conta inexistente!");
            return false;
        }
        if(valor <= 0) {
            JOptionPane.showMessageDialog(this.frameFrente(), "(!) Erro: valor deve ser positivo!");
            return false;
        }
        if(valor > getSaldo()) {
            JOptionPane.showMessageDialog(this.frameFrente(), "(!) Erro: saldo insuficiente.");
            return false;
        }
        // Confirmando saque.
        System.out.println("SAQUE DE R$ " + valor);
        System.out.print("Continuar? [S/n] ");
        if("S".equals(teclado.nextLine())) {
            setSaldo(getSaldo() - valor);
            System.out.println("(!) Saque realizado!");
            return true;
        } else return false;
    }
    
    public boolean pagarMensal() {
        // Verificando condições para pagar mensalidade.
        if(getStatus() == false) {
            JOptionPane.showMessageDialog(this.frameFrente(), "(!) Erro: conta inexistente!");
            return false;
        }
        // Pagando mensalidade para conta corrente.
        if("CC".equals(getTipo()) && getSaldo() >= 12.0f) {
            System.out.println("Será paga a mensalidade de R$ 12.00");
            System.out.print("Continuar? [S/n] ");
            if("S".equals(teclado.nextLine())) {
                setSaldo(getSaldo() - 12.0f);
                System.out.println("(!) Taxa mensal foi paga.");
                return true;
            }
        }
        // Pagando mensalidade para conta poupança.
        if("CP".equals(getTipo()) && getSaldo() >= 20.0f) {
            System.out.println("Será paga a mensalidade de R$ 20.00");
            System.out.print("Continuar? [S/n] ");
            if("S".equals(teclado.nextLine())) {
                setSaldo(getSaldo() - 20.0f);
                System.out.println("(!) Taxa mensal foi paga.");
                return true;
            }
        }
        // Caso não tenha saldo, retorna falso.
        JOptionPane.showMessageDialog(this.frameFrente(), "(!) Saldo insuficiente!");
        return false;
    }
    
    public void estadoAtual() {
        // Imprime dados da conta.
        if(getStatus()) {
            System.out.println("--------------------------");
            System.out.println("Nº CONTA: " + getNumConta());
            System.out.println("TIPO: " + getTipo());
            System.out.println("PROPRIETÁRIO: " + getDono());
            System.out.println("SALDO: " + getSaldo());
        } else
            JOptionPane.showMessageDialog(this.frameFrente(), "(!) Conta inexistente!");
    }
    
    public JFrame frameFrente() {
        // Criando JFrame para exibir JOptionPane sempre na frente.
        // OBS: Fiz esse método porque o JOptionPane estava aparecendo em segundo plano.
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        return frame;
    }
}