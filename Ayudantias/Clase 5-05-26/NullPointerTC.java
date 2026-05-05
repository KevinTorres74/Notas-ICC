public class NullPointerTC {
    public static void main(String[] args) {
        String texto = null;
        try {
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.out.println("Error: el objeto es null.");
        }
    }
}
