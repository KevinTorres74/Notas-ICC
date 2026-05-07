import java.io.Serializable;

public class Pelicula implements Serializable {
    private static final long serialVersionUID = 1L;

    private String titulo;
    private String director;
    private int anio;

    public Pelicula(String titulo, String director, int anio) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Pelicula [Título=" + titulo + ", Director=" + director + ", Año=" + anio + "]";
    }
}
