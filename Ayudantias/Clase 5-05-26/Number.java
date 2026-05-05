public class Number {
    public static void main(String[] args) {
        String valor = "abc";
        int numero = Integer.parseInt(valor); // Lanza NumberFormatException
        // Cuando intentamos convertir un texto que no es número.
        System.out.println(numero);
    }
}
