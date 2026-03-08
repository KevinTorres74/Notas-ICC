import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Ingrese la temperatura en Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);

        sc.close();
    }
}