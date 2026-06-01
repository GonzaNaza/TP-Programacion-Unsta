package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private boolean activo;
    private List<Jugador> jugadores;
    private HistorialTrofeos historial;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.activo = true;
        this.jugadores = new ArrayList<>();
        this.historial = new HistorialTrofeos();
        System.out.println("[EQUIPO] " + nombre + " fundado.");
    }

    public void fichar(Jugador jugador) {
        jugadores.add(jugador);
        System.out.println("  [FICHAJE] " + jugador.getNickname() + " unido a " + nombre);
    }

    public void ganarTrofeo(String nombre, int anio, String torneo) {
        if (!activo) throw new IllegalStateException("El equipo ya no existe.");
        historial.agregarTrofeo(nombre, anio, torneo);
    }

    public List<Jugador> disolver() {
        System.out.println("[DISOLUCIÓN] Equipo " + nombre + " disuelto. Historial eliminado.");
        List<Jugador> agentesLibres = new ArrayList<>(jugadores);
        jugadores.clear();
        historial = null; // composición: deja de existir
        activo = false;
        System.out.println("  " + agentesLibres.size() + " jugadores pasan a ser agentes libres.");
        return agentesLibres;
    }

    public void mostrarEstadisticas() {
        System.out.println("=== Equipo: " + nombre + " [" + (activo ? "ACTIVO" : "DISUELTO") + "] ===");
        if (activo) {
            System.out.println("  Roster (" + jugadores.size() + " jugadores):");
            jugadores.forEach(j -> System.out.println("    " + j));
            System.out.println("  Palmarés (" + historial.getCantidad() + " trofeos):");
            historial.mostrar();
        }
    }
}
