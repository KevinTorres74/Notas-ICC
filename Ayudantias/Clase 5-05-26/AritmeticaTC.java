public class AritmeticaTC {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Error: división entre cero.");
        }

        System.out.println("Hola");
    }
}
