public class NullPointer {
    public static void main(String[] args) {
        String texto = null;
        System.out.println(texto.length()); // Lanza NullPointerException
        //Ocurre cuando intentamos usar un objeto que es NULL
    }
}
