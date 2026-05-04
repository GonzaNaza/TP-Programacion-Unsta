package ejercicio4;

public abstract class Dispositivo {
    private String nombre;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
}
