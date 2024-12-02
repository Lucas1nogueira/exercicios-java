package exerciciorelacionamento;

/**
 *
 * @author Lucas Bastos
 */
public class Livro implements Publicacao {
    
    // Atributos
    
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Construtor

    public Livro(String titulo, String autor, int totalPaginas, int paginaAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }
    
    // Métodos personalizados
    
    public void detalhes() {
        // Exibe informações do livro.
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotalPaginas());
        System.out.println("Página atual: " + this.getPaginaAtual());
        System.out.println("Está aberto? " + this.isAberto());
        System.out.println("Leitor: " + this.getLeitor().getNome() + ", " +
                this.getLeitor().getIdade() + " anos");
    }
    
    public void abrir() {
        // Define aberto como verdadeiro.
        this.setAberto(true);
    }
    
    public void fechar() {
        // Define aberto como falso.
        this.setAberto(false);
    }
    
    public void folhear() {
        // Exibe mensagem.
        System.out.println("\nFolheando livro...");
    }
    
    public void avancarPag() {
        // Soma mais 1 à página atual.
        this.setPaginaAtual(this.getPaginaAtual() + 1);
    }
    
    public void voltarPag() {
        // Diminui menos 1 à página atual.
        this.setPaginaAtual(this.getPaginaAtual() - 1);
    }

    // Métodos acessores
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
}
