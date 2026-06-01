package ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class PlanDeEstudios {
    private String version;
    private List<Materia> materias;

    public PlanDeEstudios(String version) {
        this.version = version;
        this.materias = new ArrayList<>();
        System.out.println("  [PLAN] Plan de estudios versión " + version + " creado.");
    }

    public void agregarMateria(Materia m) {
        materias.add(m);
    }

    public int getCargaHorariaTotalSemanal() {
        return materias.stream().mapToInt(Materia::getCargaHorariaSemanal).sum();
    }

    public List<Materia> getMateriasPorAnio(int anio) {
        return materias.stream()
                .filter(m -> m.getAnio() == anio)
                .collect(Collectors.toList());
    }

    public List<Materia> getMaterias() { return materias; }
    public String getVersion() { return version; }

    public void mostrar() {
        System.out.println("    Plan v" + version + " | Total: "
                + getCargaHorariaTotalSemanal() + " hs/sem:");
        materias.forEach(m -> System.out.println("      " + m));
    }
}
