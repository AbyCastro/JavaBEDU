import java.util.Objects;

//Clase tradicional con encapsulacion y validacion
public class CuentaFiscal {

    private final String rfc; //No se modifica despues del constructor
    private double saldoDisponible;

    //Constructor con validacion del saldo
    public CuentaFiscal(String rfc,double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("⚠\uFE0F El saldo no puede ser negativo. Se asigna 0.");
            this.saldoDisponible = 0;
        }
    }

    //Getters
    public String getRfc() {return rfc; }

    public double getSaldoDisponible() {return saldoDisponible; }

    //Metodo que valida si el RFC de la declaracion coincie con el RFC de la cuenta
    public boolean validarRFC(Declaraciones d) {return Objects.equals(this.rfc,d.rfcContribuyente());}

    //Metodo para mostrar informacion de la cuenta
    public void mostrarCuenta() {
        System.out.println("\uD83C\uDFE6 Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }
}