import java.io.Serializable;
import java.util.List;

public class Saga implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private List<Pelicula> peliculas;

    public Saga(String nombre, List<Pelicula> peliculas) {
        this.nombre = nombre;
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Saga [Nombre=" + nombre + ", Películas=" + peliculas + "]";
    }
}
