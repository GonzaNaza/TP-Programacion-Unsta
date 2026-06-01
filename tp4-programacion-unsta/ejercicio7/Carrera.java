package ejercicio7;

public class Carrera {
    private String nombre;
    private int duracionAnios;
    private PlanDeEstudios plan;

    public Carrera(String nombre, int duracionAnios, String versionPlan) {
        this.nombre = nombre;
        this.duracionAnios = duracionAnios;
        this.plan = new PlanDeEstudios(versionPlan);
        System.out.println("  [CARRERA] \"" + nombre + "\" creada (" + duracionAnios + " años).");
    }

    public void agregarMateria(Materia m) {
        plan.agregarMateria(m);
    }

    public PlanDeEstudios getPlan() { return plan; }
    public String getNombre() { return nombre; }

    public void mostrar() {
        System.out.println("  Carrera: " + nombre + " (" + duracionAnios + " años)");
        plan.mostrar();
    }
}
