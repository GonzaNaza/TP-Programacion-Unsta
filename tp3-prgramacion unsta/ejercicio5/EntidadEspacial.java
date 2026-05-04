package ejercicio5;

public abstract class EntidadEspacial {
    private double x;
    private double y;

    public EntidadEspacial(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public void actualizarCoordenadas(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("  >> " + getNombre() + " se desplaza a [" + x + ", " + y + "] en el Santuario.");
    }

    public abstract void dibujar();
    public abstract String getNombre();
}
