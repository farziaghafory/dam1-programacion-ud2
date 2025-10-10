package Test;

import java.util.Scanner;

public class TicketCompra {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del producto: ");
        String producto = sc.nextLine();
        System.out.print("Precio por unidad: ");
        double precio = sc.nextDouble();
        System.out.print("Número de unidades: ");
        int unidades = sc.nextInt();
        double subtotal = precio * unidades;
        double iva = subtotal * 0.21;
        double total = subtotal + iva;
        System.out.printf("%-20s: %s%n", "Producto", producto);
        System.out.printf("%-20s: %.2f%n", "Precio/unidad", precio);
        System.out.printf("%-20s: %d%n", "Unidades", unidades);
        System.out.printf("%-20s: %.2f%n", "Subtotal", subtotal);
        System.out.printf("%-20s: %.2f%n", "IVA (21%)", iva);
        System.out.printf("%-20s: %.2f%n", "TOTAL", total);

}
}
