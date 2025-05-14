public class PagoTransferencia extends MetodoPago{
    private boolean validadoExternamente;

    public PagoTransferencia(double monto, boolean validadoExternamente) {
        super(monto);
        this.validadoExternamente = validadoExternamente;
    }

    @Override
    public boolean autenticar() {
        return validadoExternamente;
    }

    @Override
    public void procesarPago() {
        System.out.println("\uD83D\uDCC2\t Procesando transferencia por $" + monto);
    }
}
