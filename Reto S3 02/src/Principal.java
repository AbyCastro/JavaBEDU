public class Principal {
    public static void main(String[] args) {
        //Factura con RFC
        Factura facturaConRFC = new Factura(7500.0, "Diseño de Primers", "XAXX000701VJ3");

        //Factura sin RFC (se pasa null)
        Factura facturaSinRFC = new Factura(2400.0, "Consultoria", null);

        //Mostrar ambas facturas
        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}
