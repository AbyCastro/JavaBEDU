public abstract class UnidadEmergencias {
    String nombre;

    public UnidadEmergencias(String nombre) {
        this.nombre = nombre; }

    public void activarUnidad() {
        System.out.println("\uD83D\uDEA8 Activando unidad: " + nombre);}

    public abstract void responder();
}