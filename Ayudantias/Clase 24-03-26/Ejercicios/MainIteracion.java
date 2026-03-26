/**
 * Clase principal que muestra el 
 * funcionamiento de los ejercicios recursivos.
 * @author Kevin Torres
 * @version 1.0
 */

import iteracion.*;

import java.util.Scanner;

public class MainIteracion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calcula el fibonacci de un "n" número
        System.out.print("Introduce un número para la operación fibonacci : ");
        int nFibo = scanner.nextInt();
        System.out.println("Fibonacci de " + nFibo + " , su resultado es : " + EjerciciosIterativos.fibonacci(nFibo));

        // Calcula el factorial de un "n" número
        System.out.print("Introduce un número para la operación factorial : ");
        int nFac = scanner.nextInt();
        System.out.println("Factorial de " + nFac + " , su resultado es : " + EjerciciosIterativos.factorial(nFac));

        // Calcula la Suma de "n" números consecutivos
        System.out.print("Introduce un número para la suma de N números consecutivos : ");
        int nSuma = scanner.nextInt();
        System.out.println("La suma de los primeros " + nSuma + " números" + " , su resultado es : " + EjerciciosIterativos.sumaConsecutivos(nSuma));

        //Calcula el exponente con cualquier base y exponente
        System.out.print("Introduce la base: ");
        int base = scanner.nextInt();

        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();

        System.out.println("La pontencia de " + base + " elevado a la " + exponente + " es: " + EjerciciosIterativos.potencia(base, exponente));
        
        //Obtener el valor que se contiene en el i-ésimo índice de un array
        // Definir un array de enteros
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.print("Introduce el índice del array (0 a " + (numeros.length - 1) + "): ");
        int indice = scanner.nextInt();

        int resultado = EjerciciosIterativos.buscarIndice(numeros, indice);

        if (resultado != -1) {
            System.out.println("El valor en el índice " + indice + " es: " + resultado);
        } else {
            System.out.println("Índice fuera de los límites del array.");
        }

        scanner.close();
    }
    
}
