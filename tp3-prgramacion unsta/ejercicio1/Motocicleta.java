package ejercicio1;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, double tarifaBase, int cilindrada) {
        super(marca, modelo, tarifaBase);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- MOTOCICLETA ---");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tarifa base: $" + String.format("%,.0f", getTarifaBaseAlquiler()) + " ARS/día");
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
