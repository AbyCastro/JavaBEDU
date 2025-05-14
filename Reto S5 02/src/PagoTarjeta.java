public class PagoTarjeta extends MetodoPago{
    private double saldoDisponible;

    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autenticar() {
        return saldoDisponible >= monto;
    }

    @Override
    public void procesarPago() {
        System.out.println("\uD83D\uDCB3 Procesando pago con tarjeta por $" + monto);
    }
}
