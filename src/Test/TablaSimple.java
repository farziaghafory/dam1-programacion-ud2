package Test;

public class TablaSimple {
public static void main(String[] args) {
        // column titles
        System.out.printf("%-6s %-12s %8s%n", "ID", "Nombre", "Precio");

        // rows, i formatted them all same way
        System.out.printf("%04d  %-12s %8.2f%n", 1, "Ratón", 15.99);
        System.out.printf("%04d  %-12s %8.2f%n", 2, "Teclado", 25.50); // s left , f right, d digits

        // Bonus line
        System.out.println("Fin de la tabla.");
    }
}
