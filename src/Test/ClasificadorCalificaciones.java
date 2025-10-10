package Test;

import java.util.Scanner;

public class ClasificadorCalificaciones {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota 0-10: ");
        double nota = sc.nextDouble();
        if (nota < 0) {
            System.out.println("Nota no válida");
        } 
         else if (nota <= 4.9) {
            System.out.println("Suspenso");
        } else if (nota <= 6.9) {
            System.out.println("Aprobado");
        } else if (nota <= 8.9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
}
}
