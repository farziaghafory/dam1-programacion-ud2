package Test;

import java.util.Scanner;

public class ParImpar {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();

        String message; // variable for the message

       if (numero == 0) {
            message = " It is zero.";
        }
        // check if it is  es par o impar
        else if (numero % 2 == 0) {
            message = "The number is par.";
        } 
        else {
            message = "The numbe is  impar.";
        }

        System.out.println(message);
    }
}
