import java.util.Scanner;

public class PromedioAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cal1, cal2, cal3, promedio;

        System.out.print("Ingrese la primera calificación: ");
        cal1 = sc.nextDouble();

        System.out.print("Ingrese la segunda calificación: ");
        cal2 = sc.nextDouble();

        System.out.print("Ingrese la tercera calificación: ");
        cal3 = sc.nextDouble();

        promedio = (cal1 + cal2 + cal3) / 3;

        System.out.println("Promedio: " + promedio);

        if (promedio >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        sc.close();
    }
}