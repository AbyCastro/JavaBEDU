import java.rmi.MarshalledObject;
import java.util.*;

public class LabBioTech {
    public static void main(String[] args) {

    //  Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList<String> muestra = new ArrayList<>();
        muestra.add("Homo sapiens");
        muestra.add("Mus musculus");
        muestra.add("Arabidopsis thaliana");
        muestra.add("Homo sapiens");
        muestra.add("Cymbopogon citratus");
        muestra.add("Klebsiella pneumoniae");
        muestra.add("Arctium lappa");
        muestra.add("Amanita muscaria");
        muestra.add("Mus musculus");

        System.out.println("\uD83E\uDDEC Ingreso de muestras al laboratorio (ordenadas con duplicado):");
        for (int i = 0; i < muestra.size(); i++) {
            System.out.println(i + 1 + ". " + muestra.get(i));
        }

    // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> entradaMuestra = new HashSet<>(muestra); //Elimina duplicados

        System.out.println("\n\uD83E\uDDEA Especies unicas ingresadas:");
        for (String especie : entradaMuestra) {
            System.out.println("- " + especie);
        }

    // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> IDmuestra = new HashMap<>();
        IDmuestra.put("M-001", "Dra. Olivier Castro");
        IDmuestra.put("M-002", "Dra. Ingrid Vazquez");
        IDmuestra.put("M-003", "Dra. Daniela Bonilla");
        IDmuestra.put("M-004", "Dra. Marcela Mora");
        IDmuestra.put("M-005", "Dra. Elda Gamez");
        IDmuestra.put("M-006", "Dra. Abigail Castro");
        IDmuestra.put("M-007", "Dra. Ana Leal");
        IDmuestra.put("M-008", "Dra. Melisa Perez");
        IDmuestra.put("M-009", "Dra. Michell Vasquez");

        System.out.println("\n\uD83D\uDC69\u200D\uD83D\uDD2C ID de muestra → investigadora:");
        for (Map.Entry<String, String> entry: IDmuestra.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

    // Paso 4: Mostrar resultados
        String idBuscar = "M-006";
        System.out.println("\n\uD83D\uDD0D Muestra ingresada por investigador " + idBuscar + ": " + IDmuestra.get(idBuscar));

    }
}
