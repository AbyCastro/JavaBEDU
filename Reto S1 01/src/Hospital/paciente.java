package Hospital;
// los package ayudan a tener en una carpeta una parte del codigo para tenerlo organizado cuendo se trabaja con proyectos grandes

public class paciente {
    String nombre;
    int edad;
    String numeroExpediente;

    public void mostrarInformacion(){
        System.out.println("Informacion del paciente: ");
        System.out.println("Paciente: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }
}
