import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, resultado, operacion;
        boolean salir = false;

        do {
            System.out.println("Seleccione la operaci�n:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicaci�n");
            System.out.println("4. Divisi�n");
            System.out.println("5. Salir de la calculadora");
            System.out.print("Opci�n: ");
            operacion = scanner.nextInt();

            switch (operacion) {
                case 1:
                    System.out.print("Ingrese el primer n�mero: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo n�mero: ");
                    num2 = scanner.nextInt();
                    resultado = num1 + num2;
                    System.out.println("El resultado de " + num1 + " + " + num2 + " = " + resultado);
                    break;
                case 2:
                    System.out.print("Ingrese el primer n�mero: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo n�mero: ");
                    num2 = scanner.nextInt();
                    resultado = num1 - num2;
                    System.out.println("El resultado de " + num1 + " - " + num2 + " = " + resultado);
                    break;
                case 3:
                    System.out.print("Ingrese el primer n�mero: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo n�mero: ");
                    num2 = scanner.nextInt();
                    resultado = num1 * num2;
                    System.out.println("El resultado de " + num1 + " * " + num2 + " = " + resultado);
                    break;
                case 4:
                    System.out.print("Ingrese el primer n�mero: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo n�mero: ");
                    num2 = scanner.nextInt();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("El resultado de " + num1 + " / " + num2 + " = " + resultado);
                    } else {
                        System.out.println("Error: Divisi�n por cero");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Operaci�n inv�lida");
                    break;
            }
        } while (!salir);

        scanner.close();
    }
}