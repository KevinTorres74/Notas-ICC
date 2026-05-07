import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SerializarSaga {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("The Fellowship of the Ring", "Peter Jackson", 2001);
        Pelicula p2 = new Pelicula("The Two Towers", "Peter Jackson", 2002);
        Pelicula p3 = new Pelicula("The Return of the King", "Peter Jackson", 2003);

        Saga saga = new Saga("El Señor de los Anillos", Arrays.asList(p1, p2, p3));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("saga.txt"))) {
            oos.writeObject(saga);
            System.out.println("Saga serializada correctamente.");
        } catch (IOException e) {
            System.err.println("Error al serializar saga: " + e.getMessage());
        }
    }
}
