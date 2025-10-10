package Test;

public class TiposBasicos {
    public static void main(String[] args) {
        String nombre = "Farzia Ghafory";
        int edad = 21;
        double precio = 25.50;
        char inicial = 'f';
        boolean activo = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Activo: " + activo);
        System.out.println("Inicial: " + inicial);

        // Bonus: I used ptintf instead of +
        System.out.printf("Tengo %d años y me llamo %s.%n", edad, nombre);
    }
}

