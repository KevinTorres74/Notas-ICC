/**
 * Clase principal que muestra el 
 * funcionamiento de los ejercicios recursivos.
 * @author Kevin Torres
 * @version 1.0
 */

import recursion.*;
import java.util.Scanner;

public class MainRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calcula el fibonacci de un "n" número
        System.out.print("Introduce un número para la operación fibonacci : ");
        int nFibo = scanner.nextInt();
        System.out.println("Fibonacci de " + nFibo + " , su resultado es : " + EjerciciosRecursivos.fibonacci(nFibo));

        // Calcula el factorial de un "n" número
        System.out.print("Introduce un número para la operación factorial : ");
        int nFac = scanner.nextInt();
        System.out.println("Factorial de " + nFac + " , su resultado es : " + EjerciciosRecursivos.factorial(nFac));

        // Calcula la Suma de "n" números consecutivos
        System.out.print("Introduce un número para la suma de N números consecutivos : ");
        int nSuma = scanner.nextInt();
        System.out.println("La suma de los primeros " + nSuma + " números" + " , su resultado es : " + EjerciciosRecursivos.sumaConsecutivos(nSuma));

        //Calcula el exponente con cualquier base y exponente
        System.out.print("Introduce la base: ");
        int base = scanner.nextInt();

        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();

        System.out.println("La pontencia de " + base + " elevado a la " + exponente + " es: " + EjerciciosRecursivos.potencia(base, exponente));
        
        scanner.close();
    }
}
