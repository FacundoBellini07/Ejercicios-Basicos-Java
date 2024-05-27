import java.util.Scanner;

public class Ejercicio3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numero;

	        do {
	            System.out.print("Ingrese un numero mayor a 100 y primo: ");
	            numero = scanner.nextInt();

	            if (numero <= 100 || !esPrimo(numero)) {
	            	System.err.println("El numero no es valido. Ingrese otro numero");
	            }

	        } while (numero <= 100 || !esPrimo(numero));

	        System.out.println("El numero ingresado cumple con las condiciones");
	        System.out.println("Programa finalizado.");
	        scanner.close();
	    }

	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= numero; i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
