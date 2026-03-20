/**
 * Main que prueba los métodos de las clases Rectangulo y Triangulo
 * @author Kevin Torres
 * @version 1.0
 * @see Punto
 */

 public class Main{
    public static void main (String [] args){
        
        // Se crean varios objetos del tipo punto
        Punto p1 = new Punto(-4,3.5,"p1");
	    Punto p2 = new Punto(8,2,"p2");
	    Punto p3 = new Punto(10,-5.5,"p3");
	    Punto p4 = new Punto(0,4.5,"p4");
	    Punto p5 = new Punto(-1,1.5,"p5");
	    Punto p6 = new Punto(-3,6,"p6");

        // Se construyen dos triangulos t1 y t2 a partir de 3 puntos
	    Triangulo t1 = new Triangulo(p1,p2,p3);
	    Triangulo t2 = new Triangulo(p4,p5,p6);

        // Se construye un triangulo t3 por omision
	    Triangulo t3 = new Triangulo();

        // Se construye un triangulo t4 por copia de t1
	    Triangulo t4 = new Triangulo(t1);

        // Se calcula el perimetro del primer triangulo t1.
	    System.out.println("El perimetro de t1 es: " + t1.perimetro());

        // Se calula el perimetro del segundo triangulo t2.
	    System.out.println("El perimetro de t2 es: " + t2.perimetro());
        
        // Se calcula el area del primer triangulo t1.
	    System.out.println("El área de t1 es: " + t1.area());

        // Se calcula el area del segundo triangulo t2.
	    System.out.println("El área de t2 es: " + t2.area());
        
        // Se determina que tipo de triangulo es t1. 
	    System.out.println( "El t1 es de tipo: " + t1.tipo());

        // Se determina que tipo de triangulo es t2.
	    System.out.println("El t2 es de tipo: " + t2.tipo());

        // Se determina si dos triangulos son iguales.
	    System.out.println("¿Son iguales t1 y t2? " + t1.equals(t2));

		// Se determina si dos triangulos son iguales.
	    System.out.println("¿Son iguales t1 y t4? " + t1.equals(t4));

        // Recuperacion de los segmentos que conforman el triangulo t1.
	    System.out.println("Cadena con la información de triangulo t1:  \n " + t1.toString());

		// Recuperacion de los segmentos que conforman el triangulo t3.
	    System.out.println("Cadena con la información de triangulo t3 (por omision):  \n " + t3.toString());

    }
}

