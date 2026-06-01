package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String nombre;
    private String nacionalidad;
    private List<String> episodiosParticipados;

    public Actor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.episodiosParticipados = new ArrayList<>();
    }

    public void participarEn(String nombreEpisodio) {
        episodiosParticipados.add(nombreEpisodio);
        System.out.println("  [ACTOR] " + nombre + " participa en: " + nombreEpisodio);
    }

    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "Actor[" + nombre + " | " + nacionalidad
                + " | Episodios: " + episodiosParticipados.size() + "]";
    }
}
