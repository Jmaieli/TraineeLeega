public class Livro {
    private String autor;
    private String titulo;
    private int paginas;

    public Livro(String autor, String titulo, int paginas){
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public void detalhes(){
        System.out.println("Autor: " + autor + "Titulo: " + titulo + " Número de Paginas:" + paginas);
    }

    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getPaginas() {
        return paginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
