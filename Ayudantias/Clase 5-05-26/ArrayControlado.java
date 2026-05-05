public class ArrayControlado {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        
        try {
            System.out.println(numeros[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango.");
        }
        
        System.out.println("El programa continúa normalmente.");
    }
}
