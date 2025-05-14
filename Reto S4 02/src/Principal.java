public class Principal {
    public static void main(String[] args) {

        //Creamos una declaracion de impuestos
        Declaraciones declaracion = new Declaraciones("ZARA000305UX6", 15000.0);

        //Creamos una cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("ZARA000305UX6", 9600.0);

        //Mostramos la informacion
        System.out.println("\uD83D\uDCC4 Declaracion enviada por RFC: " + declaracion.rfcContribuyente() + " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        //Validamos si el RFC de la declaracion es valido
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("\uD83D\uDD0E ¿RFC valido para esta cuenta? " + rfcValido);
    }
}
