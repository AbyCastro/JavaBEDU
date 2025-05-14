public class Vuelo {
    final String codigoVuelo; //Constante
    String destino;
    String horaSalida;
    Pasajero asientoRevervado; //Se asignara una instancia o null


    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoRevervado = null;
    }

    //Metodo con parmmetro y valor de retorno
    public boolean reservarAsiento(Pasajero p) {
        if (asientoRevervado == null) {
            asientoRevervado = p;
            return true;
        } else {
            return false;
        }
    }

    //Metodo con sobrecarga permite reservar con una cadena simple
    public boolean reservarAsiento (String nombre, String pasaporte) {
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    //Metodo sin retorno
    public void cancelarReserva() {
        asientoRevervado = null;
    }

    //Metodo que retorna un String
    public String obtenerItinerario() {
        String info = "✈\uFE0F Itinerario de vuelo: \n";
        info += "Codigo: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoRevervado != null) {
            info += "Pasajero: " + asientoRevervado.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }
}