package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String titulo;
    private String genero;
    private List<Temporada> temporadas;

    public Serie(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.temporadas = new ArrayList<>();
        System.out.println("[SERIE] \"" + titulo + "\" [" + genero + "] creada en catálogo.");
    }

    public void agregarTemporada(Temporada t) {
        temporadas.add(t);
    }

    public int calcularDuracionTotal() {
        return temporadas.stream().mapToInt(Temporada::getDuracionTotal).sum();
    }

    public int getTotalEpisodios() {
        return temporadas.stream().mapToInt(Temporada::getCantidadEpisodios).sum();
    }

    public void mostrarCatalogo() {
        System.out.println("\n=== SERIE: \"" + titulo + "\" | Género: " + genero + " ===");
        System.out.println("  Temporadas: " + temporadas.size()
                + " | Episodios: " + getTotalEpisodios()
                + " | Duración total: " + calcularDuracionTotal() + " min ("
                + String.format("%.1f", calcularDuracionTotal() / 60.0) + " hs)");
        temporadas.forEach(Temporada::mostrar);
    }
}
