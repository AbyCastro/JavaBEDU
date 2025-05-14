import java.util.Optional;

public class Factura {
    //Atributos privados para encapsular los datos
    private double monto;
    private String descripcion;
    private Optional<String> RFC; //Manejo seguro del valor nulo

    //Constructor: convierte el RFC en Optional, puede ser null
    public Factura(double monto, String descripcion, String RFC) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.RFC = Optional.ofNullable(RFC);
    }

    //Metodos publico que devuelve un resumen de la factura
    public String getResumen() {
        String resumen = "\uD83D\uDCC4 Factura generada:\n";
        resumen += "Descrición: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        //Si el RFC esta presente se muestra. Si no, un mensaje alternativo
        resumen += "RFC: " + RFC.orElse("[No proporcionado]") + "\n";

        return resumen;
    }
}
