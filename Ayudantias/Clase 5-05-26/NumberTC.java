public class NumberTC {
    public static void main(String[] args) {
        String valor = "abc";
        try {
            int numero = Integer.parseInt(valor);
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto no es un número válido.");
        }
    }
}
