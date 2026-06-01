package ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Docente {
    private String legajo;
    private String nombre;
    private int maxHorasSemanales;
    private List<String> materiasAsignadas;

    public Docente(String legajo, String nombre, int maxHorasSemanales) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.maxHorasSemanales = maxHorasSemanales;
        this.materiasAsignadas = new ArrayList<>();
    }

    private int getTotalHorasAsignadas() {
        // En una implementación real, se consultaría a las materias asignadas
        // Aquí usamos un acumulador simplificado
        return horasAcumuladas;
    }

    private int horasAcumuladas = 0;

    public boolean asignarMateria(Materia materia) {
        int nuevasCarga = horasAcumuladas + materia.getCargaHorariaSemanal();
        if (nuevasCarga > maxHorasSemanales) {
            System.out.println("  [VALIDACIÓN] ⚠ " + nombre
                    + " supera carga máxima asignando \"" + materia.getNombre()
                    + "\" (" + nuevasCarga + "/" + maxHorasSemanales + " hs).");
            return false;
        }
        horasAcumuladas = nuevasCarga;
        materiasAsignadas.add(materia.getNombre());
        System.out.println("  [DOCENTE] " + nombre + " asignado a \""
                + materia.getNombre() + "\" ("
                + horasAcumuladas + "/" + maxHorasSemanales + " hs).");
        return true;
    }

    public String getLegajo() { return legajo; }
    public String getNombre() { return nombre; }
    public int getHorasAcumuladas() { return horasAcumuladas; }
    public int getMaxHoras() { return maxHorasSemanales; }

    @Override
    public String toString() {
        return "Docente[" + nombre + " | Legajo: " + legajo
                + " | Carga: " + horasAcumuladas + "/" + maxHorasSemanales + " hs"
                + " | Materias: " + materiasAsignadas.size() + "]";
    }
}
