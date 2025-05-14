public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Antonia");
        Patrulla patrulla = new Patrulla("Patrulla", "Fernanada");
        UnidadBomberos bomberos = new UnidadBomberos("Unidad bomberos", "Luisa");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();

    }
}
