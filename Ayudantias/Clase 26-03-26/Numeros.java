/**                                                                                 
 * Programa programa Numeros que lea 4 cadenas, la primera indica qué hacer y las otras tres deben tratarse como números.
 * @author Kevin Torres
 * @version 2.0                                                         
 */
public class Numeros{
    public static void main (String [] pps){

        if(pps.length != 4){
            System.out.println("Cantidad incorrecta de datos!!!");
        }else{
            int a = Integer.parseInt(pps[1]);
            int b = Integer.parseInt(pps[2]);
            int c = Integer.parseInt(pps[3]);
            int maximo = Math.max(a, Math.max(b,c));
            int minimo = Math.min(a, Math.min(b,c));
            int promedio = (a+b+c)/3;
            int medio;
            if ((a != maximo && a != minimo)) {
                medio = a;
            } else if ((b!= maximo && b != minimo)) {
                medio = b;
            } else {
                medio = c;
            }
            
            switch(pps[0]){
                case "-M":
                    System.out.println("El mayor de "+pps[1]+", "+pps[2]+" y "+pps[3]+" es "+maximo);
                    break; 
                case "-m":
                    System.out.println("El menor de "+pps[1]+", "+pps[2]+" y "+pps[3]+" es "+minimo);
                    break; 
                case "-p":
                    System.out.println("El promedio de "+pps[1]+", "+pps[2]+" y "+pps[3]+" es "+promedio);
                    break; 
                case "-o": 
                    System.out.println("Los números ordenados son "+ maximo + ", " +medio+ ", " + minimo );
                    break;
                case "-t": 
                    System.out.println("El mayor de "+pps[1]+", "+pps[2]+" y "+pps[3]+" es "+maximo);
                    System.out.println("El menor de "+pps[1]+", "+pps[2]+" y "+pps[3]+" es "+minimo);
                    System.out.println("El promedio de "+pps[1]+", "+pps[2]+" y "+pps[3]+" es "+promedio);
                    System.out.println("Los números ordenados son "+ maximo + ", " +medio+ ", " + minimo );
                    break;
                default:
                    System.out.println("Opción incorrecta !!!");
            }
        }
    }
}