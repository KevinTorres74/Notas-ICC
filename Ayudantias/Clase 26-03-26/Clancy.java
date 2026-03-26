public class Clancy {
    
    public static double suma(int n) {
        if (n == 1) {
            return 1.0;
        } else {
            return 1.0 / n + suma(n - 1);
        }
    }

    public static String decimalABinario(int n) {
    if (n == 0) return "";
    return decimalABinario(n / 2) + (n % 2);
}

    public static void main(String[] args) {
        int n = 5;

        // Suma
        System.out.println("Suma " + n + ": " + suma(n));

        // Conversión decimal a binario
        int numero = 25;
        System.out.println("Decimal " + numero + " a binario: " + decimalABinario(numero));
        
    }
}
