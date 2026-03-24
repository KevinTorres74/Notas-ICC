/**
 * Clase que contiene varios ejercicios Recursivos.
 * @author Kevin Torres
 * @version 1.0
 */

package recursion;

public class EjerciciosRecursivos {
    
    /**
     * Calcula el n-ésimo número de la secuencia de Fibonacci.
     * @param n el número de Fibonacci a calcular
     * @return el n-ésimo número de Fibonacci
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;   //Caso base
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); //LLamada recursiva
        }
    }

    /**
     * Calcula el factorial de un número.
     * @param n el número de factorial a calcular
     * @return el factorial de n
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;   //Caso base
        } else {
            return n * factorial(n - 1); //LLamada recursiva
        }
    }

    /**
     * Calcula la suma de todos los números enteros positivos desde 1 hasta n.
     * @param n el número de dígitos para sumar a calcular
     * @return la suma de todos los números enteros desde 1 hasta n
     */
    public static int sumaConsecutivos(int n) {
        if (n == 0) {   
            return 0;   //Caso base
        } else {
            return n + sumaConsecutivos(n - 1);     //LLamada recursiva
        }
    }

    /**
     * Calcula la potencia de un número dado una base y un exponente.
     * @param base el número base.
     * @param exponente el exponente al cual se eleva la base
     * @return el resultado de elevar la base al exponente
     */
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;    // Caso base
        } else {
            return base * potencia(base, exponente - 1); // Llamada recursiva
        }
    } 
}
