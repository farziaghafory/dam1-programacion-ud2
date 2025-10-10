package Test;

import java.util.Scanner;

public class MiniCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask for the numbers
        System.out.print("Introduce the first numero entero: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce second numero entero: ");
        int num2 = sc.nextInt();

        // Operations
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int divisionEntera = num1 / num2;
        int resto = num1 % num2;
        double divisionDecimal = (double) num1 / num2;  // division decimal

        // Bonus, formatted output
        System.out.println("\nResultados");
        System.out.printf("%-20s %10d%n", "Suma:", suma); // 20 space to the right and 10 to the right 
        System.out.printf("%-20s %10d%n", "Resta:", resta);
        System.out.printf("%-20s %10d%n", "Multiplicación:", multiplicacion);
        System.out.printf("%-20s %10d%n", "División entera:", divisionEntera);
        System.out.printf("%-20s %10d%n", "Resto (módulo):", resto);
        System.out.printf("%-20s %10.2f%n", "División decimal:", divisionDecimal);

        System.out.println("     Fin del cálculo");
}
}
