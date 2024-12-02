package jogolutadores;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Bastos
 */
public class Luta {
    
    // Atributos
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private String nomeVencedor;
    
    // Métodos personalizados
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        // Verifica se as categorias são iguais e se os lutadores são diferentes.
        if(l1.getCategoria().equals(l2.getCategoria()) && l1!=l2) {
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar() {
        // Verifica se a luta foi aprovada.
        if(this.isAprovada()) {
            // Apresenta os lutadores e gera número aleatório para resultado da luta.
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            int resultado = (int) Math.floor(Math.random() * (2-0+1) + 0);
            
            switch(resultado) {
                case 0:
                    // Representa um empate.
                    JOptionPane.showMessageDialog(null, "\nEmpate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    this.setNomeVencedor("- - -");
                    break;
                case 1:
                    // Representa vitória do desafiado.
                    JOptionPane.showMessageDialog(null, "\n" + this.desafiado.getNome() + " ganhou!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    this.setNomeVencedor(this.desafiado.getNome());
                    break;
                case 2:
                    // Representa vitória do desafiante.
                    JOptionPane.showMessageDialog(null, "\n" + this.desafiante.getNome() + " ganhou!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    this.setNomeVencedor(this.desafiante.getNome());
                    break;
            }
        } else {
            // Caso a luta não seja aprovada, exibe mensagem.
            JOptionPane.showMessageDialog(null, "\nA luta não pôde acontecer!"
                    + "\nVerifique se os lutadores são diferentes ou se os pesos não diferem!");
        }
    }
    
    // Métodos acessores
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public String getNomeVencedor() {
        return nomeVencedor;
    }

    public void setNomeVencedor(String nomeVencedor) {
        this.nomeVencedor = nomeVencedor;
    }
    
}
