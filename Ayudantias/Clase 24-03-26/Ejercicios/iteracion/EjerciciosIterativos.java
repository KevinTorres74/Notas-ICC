/**
 * Clase que contiene varios ejercicios Recursivos.
 * @author Kevin Torres
 * @version 2.0
*/

package iteracion;

public class EjerciciosIterativos {
    
    /**
     * Calcula el n-ésimo número de la secuencia de Fibonacci.
     * @param n el número de Fibonacci a calcular
     * @return el n-ésimo número de Fibonacci
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        int a = 0, b = 1, c; //Se utilizan para almacenar los valores previos en la secuencia.
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    /**
     * Calcula el factorial de un número.
     * @param n el número de factorial a calcular
     * @return el factorial de n
     */
    public static long factorial(int n) {
        long fac = 1;
        int i = 2; // Inicializamos i en 2
        if (n > 0) { // Verificamos que n sea mayor que 0
            do {
                fac *= i; // Multiplicamos facto por i
                i++; // Incrementamos i
            } while (i <= n); // Continuamos mientras i sea menor o igual a n
        }
        return fac;
    }

    /**
     * Calcula la suma de todos los números enteros positivos desde 1 hasta n.
     * @param n el número de dígitos para sumar a calcular
     * @return la suma de todos los números enteros desde 1 hasta n
     */
    public static int sumaConsecutivos(int n) {
        int suma = 0;
        int i = 1; // Inicializamos i en 1
        while (i <= n) {
            suma += i; // Sumar cada número desde 1 hasta n
            i++; // Incrementamos i
        }
        return suma;
    }
    
    /**
     * Calcula la potencia de un número dado una base y un exponente.
     * @param base el número base.
     * @param exponente el exponente al cual se eleva la base
     * @return el resultado de elevar la base al exponente
     */
    public static int potencia(int base, int exponente) {
        int pow = 1;
        for (int i = 0; i < exponente; i++) {
            pow *= base; // Multiplicar la base por sí misma
        }

        return pow;
    }

    /**
     * Busca el valor en un índice específico de un arreglo de enteros.
     * @param array El arreglo de enteros donde se buscará el índice.
     * @param indice El índice que se desea buscar en el arreglo.
     * @return El valor en el índice solicitado si es válido; de lo contrario, retorna -1.
     */
    public static int buscarIndice(int[] array, int indice) {
        if (indice >= 0 && indice < array.length) {
            for (int i = 0; i < array.length; i++) {
                if (i == indice) {
                    return array[i]; // Retornar el valor en el índice solicitado
                }
            }
        }
        // Retornar un valor especial si el índice está fuera de los límites
        return -1; 
    }
    
}
