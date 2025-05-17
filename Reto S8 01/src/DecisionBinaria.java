import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué deseas hacer?");
        System.out.println("A: Correr hacia el bosque a tu espalda");
        System.out.println("B: Estirar tu mano para intentar tocarlo");
        System.out.print("Selecciona A o B: ");
        String input = scanner.nextLine();
        return input.toUpperCase();
    }
}
