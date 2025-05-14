//Importar la clase scanner para leer la entrada del usuario
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Crear objeto Scanner
        var saldo = 1000.0; //Saldo inicial
        int opcion; //variable para almacenar la opcion del menu

        //Repetir el menu mientras la opcion no sea salir (4)
        do {
            //mostrar menu de opciones
            System.out.println("\n \uD83C\uDFE6 Bienvenid@ ");
            System.out.println("\uD83D\uDCB5 1 Consultar saldo");
            System.out.println("\uD83D\uDCB0 2 Depositar efectivo");
            System.out.println("\uD83D\uDCB8 3 Retirar efectivo");
            System.out.println("\uD83D\uDC4B 4 Salir");
            System.out.print("▶ Selecciona una opcion: ");

            opcion = scanner.nextInt(); //Leer la opcion seleccionada por el ususario
            //Estructura switch para menajar las opciones del menu
            switch (opcion){
                case 1 -> {
                    //Consultar saldo
                    System.out.println("\uD83D\uDCB3 Tu saldo actual es de: $" + saldo);
                }
                case 2 ->{
                    //Deposito
                    System.out.print("\uD83D\uDCB5 Ingresa el monto a Depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        //validacion del monto debe ser mayor a cero
                        System.out.println("⚠\uFE0F ¡El monto debe ser mayor a 0.!");
                        continue; //Volver al menu sin modificar el saldo
                    }

                    saldo += deposito; //Aumentar el saldo
                    System.out.println("✅ Deposito realizado. Saldo actualizado: $" + saldo);
                }
                case 3 ->{
                    //Retirar dinero
                    System.out.print("\uD83D\uDCB8 Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0){
                        //Validacion el monto debe ser mayor a cero
                        System.out.println("⚠\uFE0F ¡El monto debe ser mayor a 0.!");
                        continue; //Volver al menu sin hacer nada
                    }

                    if (retiro > saldo){
                        System.out.println("⚠\uFE0F ¡Saldo insuficiente! Tu saldo es: $" + saldo);
                    } else {
                        saldo -= retiro; //Restar el monto del saldo
                        System.out.println("✅ Retiro exitoso. Saldo restante: $" + saldo);
                    }
                }
                case 4 -> {
                    //Salir del programa
                    System.out.println("Gracias por usar el cajero ¡Vuelve pronto! \uD83D\uDC4B");
                }
                default -> {
                    //Opcion no valida
                    System.out.println("❌ ¡Opcion invalida! Intente nuevamente.");
                }
            }
        } while (opcion != 4); //Sañir cuando el usuario elija la opcion 4

        scanner.close(); //Cerrar el scanner
    }
}