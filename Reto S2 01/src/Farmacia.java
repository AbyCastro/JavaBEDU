//Importar el paquete Java.util
//Clase Scanner nos permite leer datos ingresados por el usuario
import java.util.Scanner;

//Declaramos clase principal
public class Farmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitud de datos al usuario
        System.out.print("Nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        //Calculo del total
        double totalSinDescuento = precio * cantidad;

        //Evaluar si aplica el descuento
        var aplicaDescuento =totalSinDescuento > 500; //Implementacion de var
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

        //Total a pagar
        double totalConDescuento = totalSinDescuento - descuento;

        //Resumen
        System.out.println("\nResumen de compra: ");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: $" + precio);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

        scanner.close();

    }
}

