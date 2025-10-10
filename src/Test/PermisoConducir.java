package Test;

import java.util.Scanner;

public class PermisoConducir {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask the user 
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Tienes carnet de conducir? (si/no): ");
        String answer = sc.nextLine().toLowerCase(); // change to lowercase

        String mensaje = "";

        if (edad < 0 || edad > 120) { // Si la edad es menor que 0 o mayor que 120, muestra “Edad no válida”.
            mensaje = "Edad no válida.";
        }
        // Si la respuesta no es “si” ni “no”, muestra “Respuesta no válida”.
        else if ( answer.equals("si") && answer.equals("no")) {
            mensaje = "Respuesta no válida.";
        }
        else {
            if (edad >= 18 && answer.equals("si")) {
                mensaje = "You can drive. ";
            } 
            else if (edad < 18 && answer.equals("si")) {
                mensaje = "You cant drive cuz you are under age.";
            } 
            else if (edad >= 18 && answer.equals("no")) {
                mensaje = "No puedes conducir porque no tienes carnet.";
            } 
        }

        System.out.println(mensaje);

}
}