package ejercicio1;

public class Furgoneta extends Vehiculo {
    private double capacidadCargaKg;

    public Furgoneta(String marca, String modelo, double tarifaBase, double capacidadCargaKg) {
        super(marca, modelo, tarifaBase);
        this.capacidadCargaKg = capacidadCargaKg;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- FURGONETA ---");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tarifa base: $" + String.format("%,.0f", getTarifaBaseAlquiler()) + " ARS/día");
        System.out.println("Capacidad de carga: " + capacidadCargaKg + " kg");
    }
}
