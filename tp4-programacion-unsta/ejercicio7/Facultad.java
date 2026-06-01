package ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String nombre;
    private boolean activa;
    private List<Carrera> carreras;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.activa = true;
        this.carreras = new ArrayList<>();
        System.out.println("[FACULTAD] \"" + nombre + "\" creada.");
    }

    public void agregarCarrera(Carrera c) {
        if (!activa) throw new IllegalStateException("La facultad está cerrada.");
        carreras.add(c);
        System.out.println("  [+] Carrera \"" + c.getNombre() + "\" incorporada a " + nombre);
    }

    public void asignarDocente(Docente docente, String codigoMateria) {
        for (Carrera c : carreras) {
            for (Materia m : c.getPlan().getMaterias()) {
                if (m.getCodigo().equals(codigoMateria)) {
                    docente.asignarMateria(m);
                    return;
                }
            }
        }
        System.out.println("  [ERROR] Materia " + codigoMateria + " no encontrada.");
    }

    public void cerrar() {
        System.out.println("[CIERRE] Facultad \"" + nombre
                + "\" cerrada. " + carreras.size() + " carrera(s) dejan de dictarse.");
        carreras.clear();  // carreras dejan de existir
        activa = false;
    }

    public void mostrarEstructura() {
        System.out.println("\n=== FACULTAD: " + nombre
                + " [" + (activa ? "ACTIVA" : "CERRADA") + "] ===");
        if (carreras.isEmpty()) {
            System.out.println("  Sin carreras activas.");
        } else {
            carreras.forEach(Carrera::mostrar);
        }
    }
}
