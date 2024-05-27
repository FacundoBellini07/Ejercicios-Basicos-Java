public class Ejercicio2 {
	public class NumerosYDivisores {
	    public static void main(String[] args) {
	        for (int i = 50; i <= 100; i++) {
	            if (esPrimo(i)) {
	                System.out.println(i + ": primo");
	            } else {
	                System.out.print(i + ": ");
	                imprimirDivisores(i);
	                System.out.println();
	            }
	        }
	    }

	    public static boolean esPrimo(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        if (num == 2) {
	            return true;
	        }
	        if (num % 2 == 0) {
	            return false;
	        }
	        int sqrt = (int) Math.sqrt(num);
	        for (int i = 3; i <= sqrt; i += 2) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void imprimirDivisores(int num) {
	        for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.print(num);
	    }
	}
}
