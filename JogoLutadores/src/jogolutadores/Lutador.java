package jogolutadores;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Bastos
 */
public class Lutador {
    
    // Atributos
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Construtor
    
    public Lutador(String nome, String nacionalidade, int idade, float altura,
                    float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    // Métodos personalizados
    
    public void ganharLuta() {
        // Soma mais 1 ao número de vitórias.
        setVitorias(getVitorias() + 1);
    }
    
    public void perderLuta() {
        // Soma mais 1 ao número de derrotas.
        setDerrotas(getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        // Soma mais 1 ao número de empates.
        setEmpates(getEmpates() + 1);
    }
    
    public void apresentar() {
        // Exibe apresentação do lutador.
        String apresentacao;
        
        apresentacao = "Nome: " + this.getNome() +
                        "\nOrigem: " + this.getNacionalidade() +
                        "\nIdade: " + this.getIdade() + " anos" +
                        "\nAltura: " + this.getAltura() + "m" +
                        "\nPeso: " + this.getPeso() + " Kg" +
                        "\nVitórias: " + this.getVitorias() +
                        "\nDerrotas: " + this.getDerrotas() +
                        "\nEmpates: " + this.getEmpates();
        
        JOptionPane.showMessageDialog(null, apresentacao);
    }
    
    public void status() {
        // Exibe uma apresentação abreviada do lutador.
        String info;
        
        info = "Este lutador se chama " + this.getNome() +
                "\nÉ um peso " + this.getCategoria() +
                "\nV:" + this.getVitorias() +
                "\nD:" + this.getDerrotas() +
                "\nE:" + this.getEmpates();
        
        JOptionPane.showMessageDialog(null, info);
    }
    
    // Métodos acessores
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if(this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if(this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if(this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
