public class Principal {
    public static void main(String[] args) {
        //Crear un pasajero
        Pasajero pasajero = new Pasajero("Abigail Castro", "P030500");

        //Crear un vuelo
        Vuelo vuelo = new Vuelo("UK003", "Londres", "21:30");

        //Reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("✅ Su vuelo fue reservado con exito.\n");
        } else {
            System.out.println("⚠\uFE0F No se pudo realizar la reserva.\n");
        }

        //Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        //Cnacelar reserva
        System.out.println("❌ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        //Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        //Realizamos una nueva reservacion
        vuelo.reservarAsiento("Olivier Castro", "P070504");
        System.out.println(vuelo.obtenerItinerario());
    }
}