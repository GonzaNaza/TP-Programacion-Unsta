package ejercicio1;

public class Usuario {
    private String nombre;
    private Billetera billetera;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.billetera = new Billetera("BIL-" + nombre.toUpperCase());
        System.out.println("[USUARIO] " + nombre + " creado con billetera " + billetera.getId());
    }

    public Billetera getBilletera() { return billetera; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "Usuario[" + nombre + "]";
    }
}
