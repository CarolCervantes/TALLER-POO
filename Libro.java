public class Libro {
    private String titulo;
    private String autor;
    private int numeropaginas;

    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.numeropaginas = 0;
    }

    public Libro(String titulo, String autor, int numeropaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
    }

    
    public String toString() {
        return "Libro{Título='" + titulo + "', Autor='" + autor + "', Número de páginas=" + numeropaginas + "}";
    }
    }


