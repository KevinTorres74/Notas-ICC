import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializarPelicula {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Inception", "Christopher Nolan", 2010);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pelicula.txt"))) {
            oos.writeObject(pelicula);
            System.out.println("Objeto Pelicula serializado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al serializar: " + e.getMessage());
        }
    }
}
