import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializarPelicula {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pelicula.txt"))) {
            Pelicula pelicula = (Pelicula) ois.readObject();
            System.out.println("Objeto deserializado: " + pelicula);
        } catch (IOException e) {
            System.err.println("Error al deserializar: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Clase no encontrada: " + e.getMessage());
        }
    }
}
