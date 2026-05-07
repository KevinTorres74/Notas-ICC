import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializarSaga {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("saga.txt"))) {
            Saga saga = (Saga) ois.readObject();
            System.out.println("Saga deserializada: " + saga);
        } catch (IOException e) {
            System.err.println("Error al deserializar saga: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Clase no encontrada: " + e.getMessage());
        }
    }
}
