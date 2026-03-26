public class Terminal {
    public static void main(String[] clancy) {
        // Verificamos si se pasaron parámetros
        if (clancy.length == 0) {
            System.out.println("No se recibieron parámetros. Ejemplo de uso:");
            System.out.println("java Terminal Nombre edad");
        } else {
            // args[0] será el primer parámetro, args[1] el segundo, etc.
            String nombre = clancy[0];
            int edad = Integer.parseInt(clancy[1]);

            System.out.println("Hola " + nombre + ", tu edad es " + edad + " años.");
        }
    }
}
