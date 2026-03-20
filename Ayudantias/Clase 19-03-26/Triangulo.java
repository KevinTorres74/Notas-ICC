/**
 *Clase Triangulo para modelar un triangulo en R^2  
 *@author Kevin Torres
 *@version 1.0
 *@see Punto
 */

public class Triangulo {

    //Atributos de la clase
    private Punto p1;
    private Punto p2;
    private Punto p3;

    /**
     *Constructor por omision
     *Constructor por omisión. Construye un triángulo con vértices en:(0,0)--(10,0)--(5,10)
     */
    public Triangulo(){
        this.p1=new Punto();
        this.p2=new Punto(10,0, "p2");
        this.p3=new Punto(5,10, "p3");
    }


    /**
     * Constructor por parametros
     * Constructor por parámetros que construye un triágulo a partir de 3 puntos que fungen como vétices
     * @param p1- Punto que representa un vétice del triángulo
     * @param p2- Punto que representa un vétice del triángulo
     * @param p3- Punto que representa un vétice del triángulo
     */
    public Triangulo (Punto p1, Punto p2, Punto p3){
        this.p1 = p1;
	    this.p2 = p2;
	    this.p3 = p3;
    }


    /**
     * Constructor por copia
     *@param t - Triangulo del cual hace la copia
     */
    public Triangulo (Triangulo t){
        p1 = t.p1;
	    p2 = t.p2;
	    p3 = t.p3;
    }


    /**
    *Devuelve el perímetro del triangulo
    *@return double - Perímetro: suma de longitudes de los lados del triángulo
    */
    public double perimetro(){
        return p1.distanciaDosPuntos(p2) + p2.distanciaDosPuntos(p3) + p3.distanciaDosPuntos(p1);
    }


    /**
     *Devuelve el área del triángulo, usando la ecuación de Herón
     *@return double - Área: fórmula de Herón.
     */
    public double area(){
        double s =perimetro()/2;
	    double a=p1.distanciaDosPuntos(p2);
	    double b=p2.distanciaDosPuntos(p3);
	    double c=p3.distanciaDosPuntos(p1);
	    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }


    /**
    *Devuelve una clasificación acerca del triángulo que invoca el método.
    *@return String - El tipo del triángulo: Equilátero, Isósceles, Escaleno. 
    */
    public String tipo (){
        double a=p1.distanciaDosPuntos(p2);
        double b=p2.distanciaDosPuntos(p3);
        double c=p3.distanciaDosPuntos(p1);
        if (a==b && b==c) return "Es equilatero";
        else if (a == b || a == c || b == c) return "Es isósceles";
        else return "Es escaleno";
    }


    /**
     *Método que implementa equals. Compara si dos triangulos son iguales,
     *a partir de los puntos que contienen sus vértices.
     *@param t - Triangulo a comparar
     *@return boolean - true si son iguales, false en otro caso.
     */
	public boolean equals (Triangulo t) {
        boolean igual = true;
        //P1
        igual = igual && ((this.p1.equals(t.p1) || ((this.p1.equals(t.p2) || (this.p1.equals(t.p3)) ? true : false ))) ? true : false );
        //P2
        igual = igual && ((this.p2.equals(t.p1) || ((this.p2.equals(t.p2) || (this.p2.equals(t.p3)) ? true : false ))) ? true : false );    
        //P3
        igual = igual && ((this.p3.equals(t.p1) || ((this.p3.equals(t.p2) || (this.p3.equals(t.p3)) ? true : false ))) ? true : false );

	    return igual;
	}
    

	@Override
	/**
	 * Método toString recupera una cadena con la información de triangulo
	 * @return String cadena con la informacion del triangulo 
	 */
	    public String toString(){
	    return  "ab: (" + p1.obtenerX() + ", " + p1.obtenerY() + ") --> (" + p2.obtenerX() + ", " + p2.obtenerY() + "); bc: (" + p2.obtenerX() + ", " + p2.obtenerY() + ") --> (" + p3.obtenerX() + ", " + p3.obtenerY() + "); ac: (" + p1.obtenerX() + ", " + p1.obtenerY() + ") --> (" + p3.obtenerX() + ", " + p3.obtenerY() + ")";    
    }   
	
	
}