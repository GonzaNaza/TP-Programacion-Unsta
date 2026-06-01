package ejercicio5;

import java.util.ArrayList;
import java.util.List;

class Trofeo {
    private String nombre;
    private int anio;
    private String torneo;

    public Trofeo(String nombre, int anio, String torneo) {
        this.nombre = nombre;
        this.anio = anio;
        this.torneo = torneo;
    }

    @Override
    public String toString() {
        return "🏆 " + nombre + " (" + anio + ") - " + torneo;
    }
}

public class HistorialTrofeos {
    private List<Trofeo> trofeos;

    public HistorialTrofeos() {
        this.trofeos = new ArrayList<>();
    }

    public void agregarTrofeo(String nombre, int anio, String torneo) {
        trofeos.add(new Trofeo(nombre, anio, torneo));
        System.out.println("  [TROFEO] Ganado: " + nombre + " en " + torneo + " (" + anio + ")");
    }

    public void mostrar() {
        if (trofeos.isEmpty()) {
            System.out.println("  Sin trofeos registrados.");
        } else {
            trofeos.forEach(t -> System.out.println("  " + t));
        }
    }

    public int getCantidad() { return trofeos.size(); }
}
