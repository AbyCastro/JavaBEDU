import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

//Creacion de clase Tema
class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tema otro) {return this.titulo.compareTo(otro.titulo);} //Orden alfabetico

    @Override
    public String toString() {return "Tema " + titulo + " | Prioridad " + prioridad; }
}

public class Planeacion {
    public static void main(String[] args) {

    //Creacion de lista concurrente
    CopyOnWriteArrayList<Tema> clase = new CopyOnWriteArrayList<>();
    clase.add(new Tema("Redacción cientifica", 3));
    clase.add(new Tema("Bioquimica", 1));
    clase.add(new Tema("Microbiologia medica", 1));
    clase.add(new Tema("Estadistica basica", 2));
    clase.add(new Tema("Ecologia", 2));

    //Ordenar los temas alfabeticamente
    Collections.sort(clase);
    System.out.println("📚 Temas ordenados alfabéticamente:");
    for (Tema t : clase) {
        System.out.println(t);
    }

    //Ordenar los temas por prioridad usando Comparator
    clase.sort(new Comparator<Tema>() {
        @Override
        public int compare(Tema a, Tema b) {
            return Integer.compare(a.prioridad, b.prioridad); //Prioridad adcendente
        }
    });

    System.out.println("\n\uD83D\uDCCA Temas ordenados por prioridad (1 = urgente):");
    for (Tema t : clase) {
            System.out.println(t);
        }

    //Creacio de mapa concurrente de recursos usando ConcurrentHashMap
    ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
    recursos.put("Redacción cientifica", "https://www.nature.com/");
    recursos.put("Estadistica basica", "https://acortar.link/sqnnwW");
    recursos.put("Bioquimica", "https://acortar.link/VEhjG8");
    recursos.put("Microbiologia medica", "https://acortar.link/62aaCb");

    //Repositorio de recursos por tema
        System.out.println("\n\uD83D\uDCDA Repositorio de recursos por tema:");
        for (String tema : recursos.keySet()) {
            System.out.println(tema + " → " + recursos.get(tema));
        }
    }
}
