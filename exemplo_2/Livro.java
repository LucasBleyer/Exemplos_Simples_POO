package exemplo_2;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private int totalPagina;
    private String editora;
    private String autor;

//contrutores      
    public Livro() {
    }

    public Livro(String titulo, int anoPublicacao, int totalPagina, String editora) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.totalPagina = totalPagina;
        this.editora = editora;
    }

//getters e setters    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getTotalPagina() {
        return totalPagina;
    }

    public void setTotalPagina(int totalPagina) {
        this.totalPagina = totalPagina;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo= " + titulo + ", anoPublicacao= " + anoPublicacao + ", totalPagina= " + totalPagina + 
        ", editora= " + editora + ", autor= " + autor + '}';
    }  
}