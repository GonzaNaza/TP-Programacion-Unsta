package ejercicio2;

public class Paciente {
    private String dni;
    private String nombre;
    private ExpedienteClinico expediente; // COMPOSICIÓN

    public Paciente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.expediente = new ExpedienteClinico(dni);
        System.out.println("[PACIENTE] " + nombre + " registrado con expediente.");
    }

    public void registrarDiagnostico(String descripcion) {
        expediente.agregarEntrada("DIAGNOSTICO", descripcion);
    }

    public void registrarReceta(String descripcion) {
        expediente.agregarEntrada("RECETA", descripcion);
    }

    public void verEvolucion() {
        expediente.generarReporte();
    }

    public void darDeBaja() {
        System.out.println("[BAJA] Paciente " + nombre + " dado de baja. Expediente eliminado por privacidad.");
        expediente = null;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}
