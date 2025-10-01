import java.util.Scanner;
import utilidades.ProcesadorTexto;

public class DatosUsuario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce your name");
        String nombre = sc.nextLine();
        System.out.print("Introduce your age: ");
        int edad;
        try {
            edad = Integer.parseInt(sc.nextLine());
            if (edad < 0) {
                System.out.println("La edad no puede ser negativa.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduce un número valido para la edad.");
            return;
        }
        System.out.println("introduce you email");
        String email = sc.nextLine();
        boolean emailValido = ProcesadorTexto.esEmailValido(email);
    }


}
    