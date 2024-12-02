package simulador.de.banco;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SimuladorDeBanco {

    public static void main(String[] args) {
        // Instanciando novo objeto.
        Operacoes p = new Operacoes();
        
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        
        // Exibindo um menu bancário para chamar os métodos.
        do {
            System.out.format("\n*****\nMENU\n");
            System.out.println("1- Criar conta");
            System.out.println("2- Ver info");
            System.out.println("3- Sacar");
            System.out.println("4- Depositar");
            System.out.println("5- Pagar taxa mensal");
            System.out.println("6- Excluir conta");
            System.out.println("0- Sair");
            System.out.format("\nDigite a opção desejada: ");
            op = teclado.nextInt();
            System.out.format("\n\n");
            switch (op) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    if(p.getStatus() == true) {
                        JOptionPane.showMessageDialog(p.frameFrente(), "(!) A conta já existe!");
                        break;
                    }
                    System.out.println("Insira o tipo da conta (CC ou CP): ");
                    teclado.nextLine();
                    String tipoConta = teclado.nextLine();
                    if(p.abrirConta(tipoConta))
                        System.out.println("Operação concluída com sucesso.");
                    else
                        System.out.println("Voltando ao menu...");
                    break;
                case 2:
                    p.estadoAtual();
                    break;
                case 3:
                    System.out.format("\nInsira o valor do saque: ");
                    if(p.sacar(teclado.nextFloat()))
                        System.out.println("Operação concluída com sucesso.");
                    else
                        System.out.println("Voltando ao menu...");
                    break;
                case 4:
                    System.out.format("\nInsira o valor do depósito: ");
                    if(p.depositar(teclado.nextFloat()))
                        System.out.println("Operação concluída com sucesso.");
                    else
                        System.out.println("Voltando ao menu...");
                    break;
                case 5:
                    if(p.pagarMensal())
                        System.out.println("Operação concluída com sucesso.");
                    else
                        System.out.println("Voltando ao menu...");
                    break;
                case 6:
                    if(p.fecharConta())
                        System.out.println("Operação concluída com sucesso.");
                    else
                        System.out.println("Voltando ao menu...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }
    
}
