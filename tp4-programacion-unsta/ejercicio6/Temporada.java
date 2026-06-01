package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private int numero;
    private int anio;
    private List<Episodio> episodios; // COMPOSICIÓN con Episodio

    public Temporada(int numero, int anio) {
        this.numero = numero;
        this.anio = anio;
        this.episodios = new ArrayList<>();
        System.out.println("  [TEMPORADA] T" + numero + " (" + anio + ") creada.");
    }

    public void agregarEpisodio(Episodio e) {
        episodios.add(e);
    }

    public int getDuracionTotal() {
        return episodios.stream().mapToInt(Episodio::getDuracionMinutos).sum();
    }

    public int getNumero() { return numero; }
    public int getCantidadEpisodios() { return episodios.size(); }
    public List<Episodio> getEpisodios() { return episodios; }

    public void mostrar() {
        System.out.println("  Temporada " + numero + " (" + anio + ") - "
                + episodios.size() + " episodios - "
                + getDuracionTotal() + " min totales:");
        episodios.forEach(e -> System.out.println("  " + e));
    }
}
