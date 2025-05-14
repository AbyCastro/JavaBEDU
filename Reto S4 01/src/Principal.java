public class Principal {
    public static void main(String[] args) {

        //Creamos dos acturas con el mismo folio
        Factura f1 = new Factura("FRA0001", "Abigail Castro", 1989.13);
        Factura f2 = new Factura("FRA0001", "BioTech", 1989.13);

        //Mostrando ambas facturas con toString()
        System.out.println(f1);
        System.out.println(f2);

        //Comparamos si son iguales usando equals()
        System.out.println("⚠\uFE0F ¿Las facturas son iguales? " + f1.equals(f2));
    }
}
