package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Episodio {
    private int numero;
    private String titulo;
    private int duracionMinutos;
    private List<Actor> actores;

    public Episodio(int numero, String titulo, int duracionMinutos) {
        this.numero = numero;
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.actores = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
        actor.participarEn(titulo);
    }

    public int getDuracionMinutos() { return duracionMinutos; }
    public String getTitulo() { return titulo; }
    public int getNumero() { return numero; }

    @Override
    public String toString() {
        return "  E" + numero + ": \"" + titulo + "\" ["
                + duracionMinutos + " min | "
                + actores.size() + " actor(es)]";
    }
}
