package exerciciojoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Bastos
 */
public class ExercicioJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Variáveis que irão guardar as informações necessárias para o programa.
        int numero;
        int totalValores = 0;
        int totalPares = 0;
        int totalImpares = 0;
        int acimaCem = 0;
        float mediaValores = 0;
        
        // Loop do-while, convertendo a entrada do JOptionPane em inteiro e guardando o valor na variável...
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor (0 interrompe):"));
            if (numero == 0) { // Se o primeiro número inserido já for zero, quebra o loop.
                break;
            }
            totalValores++; // Sempre que inserir um número, acrescenta 1 ao total.
            if (numero % 2 == 0) {
                totalPares++; // Se for par, acrescenta 1 ao total de pares.
            } else {
                totalImpares++; // Se não for par, acrescenta 1 ao total de ímpares.
            }
            if (numero > 100) {
                acimaCem++; // Se for maior que 100, acrescenta 1 ao acima de cem.
            }
            mediaValores = mediaValores + numero; // Vai somando os números à média para depois fazer o cálculo.
        } while (numero != 0); // ... enquanto o número inserido for diferente de zero.
        
        mediaValores = mediaValores / totalValores; // Divide a soma dos valores pelo total de números para obter a média.
        
        // Exibe os resultados pelo JOptionPane.
        JOptionPane.showMessageDialog(null, "Resultado:\n"
                + "__________\n"
                + "Total de valores: " + totalValores + "\n"
                + "Total de pares: " + totalPares + "\n"
                + "Total de ímpares: " + totalImpares + "\n"
                + "Acima de cem: " + acimaCem + "\n"
                + "Média dos valores: " + mediaValores);
        
    }
    
}
