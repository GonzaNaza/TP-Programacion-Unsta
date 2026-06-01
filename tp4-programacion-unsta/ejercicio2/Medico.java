package ejercicio2;

public class Medico {
    private String matricula;
    private String nombre;
    private String especialidad;

    public Medico(String matricula, String nombre, String especialidad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getMatricula() { return matricula; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "Dr. " + nombre + " [" + especialidad + " | Mat: " + matricula + "]";
    }
}
