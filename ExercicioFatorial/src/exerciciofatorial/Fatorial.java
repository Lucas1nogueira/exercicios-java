package exerciciofatorial;

/**
 *
 * @author Lucas Bastos
 */

// Classe fatorial pedida na atividade.
public class Fatorial {
    int valor; // Variável para cálculo da fatorial.
    
    // Define o valor da variável através do parâmetro.
    public void setValor(int n) {
        this.valor = n;
    }
    
    // Calcula a fatorial e retorna seu valor.
    public int getFatorial() {
        int copiaValor = this.valor; // Faz uma cópia do valor.
        int fatorial = copiaValor;
        while(copiaValor != 1) { // Faz o cálculo da fatorial (n * (n-1)...)
            copiaValor = copiaValor - 1;
            fatorial = fatorial * copiaValor;
        }
        return fatorial; // Retorna o resultado.
    }
    
    // Obtém a fórmula da fatorial desejada.
    public String getFormula() {
        int copiaValor = this.valor; // Copia o valor.
        String formula = Integer.toString(copiaValor); // Armazena esse valor inicial convertido para string.
        while(copiaValor != 1) { // Enquanto o número for diferente de 1...
            copiaValor = copiaValor - 1; // Vai diminuindo o número
            formula = formula + " x " + copiaValor; // E concatenando os valores na string, incluindo o sinal de multiplicação.
        }
        formula = formula + " = "; // Por fim, concatena a string com o sinal de igualdade.
        return formula; // Retorna a string obtida.
    }
}
