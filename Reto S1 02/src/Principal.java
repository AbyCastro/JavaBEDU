public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Ballet El lago de los cisnes", 650.45);
        Entrada entrada2 = new Entrada("Concierto The Eras Tour", 1989.13);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        //Reto adicional
        Entrada_Record entrada3 = new Entrada_Record("Obra de teatro Los empeños de una casa", 521.45);
        entrada3.mostrarInformacion();
    }
}
