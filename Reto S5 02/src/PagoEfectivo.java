public class PagoEfectivo extends MetodoPago{

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        return true; //No se requiere validacion para efectivo
    }

    @Override
    public void procesarPago() {
        System.out.println("\uD83D\uDCB5 Procesando pago en efectivo por $" + monto);
    }
}
