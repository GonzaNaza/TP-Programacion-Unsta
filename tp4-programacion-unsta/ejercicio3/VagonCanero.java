package ejercicio3;

public class VagonCanero {
    private String id;
    private double capacidadToneladas;
    private double cargaActual;

    public VagonCanero(String id, double capacidadToneladas) {
        this.id = id;
        this.capacidadToneladas = capacidadToneladas;
        this.cargaActual = 0;
    }

    public void cargar(double toneladas) {
        if (cargaActual + toneladas > capacidadToneladas)
            throw new IllegalStateException("Vagón " + id + " excede capacidad.");
        cargaActual += toneladas;
        System.out.println("  [VAGÓN " + id + "] Cargado: " + toneladas + "t. Total: " + cargaActual + "t");
    }

    public double getCapacidadToneladas() { return capacidadToneladas; }
    public double getCargaActual() { return cargaActual; }
    public String getId() { return id; }

    @Override
    public String toString() {
        return "Vagón[" + id + " | Cap: " + capacidadToneladas + "t | Carga: " + cargaActual + "t]";
    }
}
