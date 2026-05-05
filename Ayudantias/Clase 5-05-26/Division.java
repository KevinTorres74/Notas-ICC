/**
 * Clase que muestra el funcionamiento de Excepciones.
 * @author Kevin Torres
 * @version 1.0
*/

import java.util.Scanner;

/**
 * Excepción personalizada que se lanza cuando se ingresan números negativos.
 */
class Hallowen extends Exception {

    /**
     * Constructor de la excepción Hallowen.
     * @param message Mensaje de error que describe la excepción.
     */
    public Hallowen(String message) {
        super(message);
    }
}

/**
 * Clase que realiza la operación de división.
 */
public class Division {

    /**
     * Método que realiza la división de dos números enteros.
     *
     * @param a El numerador.
     * @param b El denominador.
     * @return El resultado de la división.
     * @throws ArithmeticException Si se intenta dividir por cero.
     */
    public static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }

    /**
     * Método principal que ejecuta el programa.
     * Solicita al usuario dos números y realiza la división.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Solicitar los números al usuario
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();
            
            // Verificar si los números son negativos
            if (num1 < 0 || num2 < 0) {
                // Aqui hacemos uso de nuestra excepcion personalizada.
                throw new Hallowen("No se permiten números negativos.");
            }
            
            // Intentar la división
            int resultado = dividir(num1, num2);
            System.out.println("El resultado de la división es: " + resultado);
        
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Hallowen e) {

            /*
             * Aqui les dejo de varias formas como se puede visualizar
             * "e" del bloque catch de nuestra excepción personalizada.
             */
            System.out.println("****        Distintas formas de imprimir el error       *****  \n");
        


            System.out.println("****************        Mensaje de error utilizando getMessage(): \n"); 
            System.out.println("Error personalizado: " + e.getMessage() + "\n");


            System.out.println("****************        Mensaje de error utilizando printStackTrace(): \n"); 
            /*
             * Este nos imprime la traza completa de la
             * excepcion, lo que nos es útil para 
             * depurar y entender donde ocurrió el error. 
             */
            e.printStackTrace();
            System.out.println("\n"); // Un simple salto de linea            
            

            System.out.println("****************        Mensaje de error utilizando .err en lugar de .out: \n");
            /*
             * Aqui nos imprime el error con más detalle
             * en este caso muestra nuestro personalizado.
             */
            System.err.println("Error personalizado:" + e + "\n");


        } finally {
            System.out.println("Operación finalizada.");
        }
    }
}
