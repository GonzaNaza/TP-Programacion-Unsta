package ejercicio7;

public class Materia {
    private String codigo;
    private String nombre;
    private int cargaHorariaSemanal;
    private int anio; // año de la carrera en que se dicta

    public Materia(String codigo, String nombre, int cargaHorariaSemanal, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.anio = anio;
    }

    public int getCargaHorariaSemanal() { return cargaHorariaSemanal; }
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getAnio() { return anio; }

    @Override
    public String toString() {
        return "Materia[" + codigo + " | " + nombre
                + " | " + cargaHorariaSemanal + "hs/sem | Año " + anio + "]";
    }
}
