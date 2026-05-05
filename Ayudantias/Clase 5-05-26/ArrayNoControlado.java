public class ArrayNoControlado {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        
        // Esto lanza una excepción en tiempo de ejecución
        // Acceder a una posición inexistente en un arreglo.
        System.out.println(numeros[5]); 
    }
}
