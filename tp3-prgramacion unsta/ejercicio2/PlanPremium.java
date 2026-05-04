package ejercicio2;

public class PlanPremium extends Suscripcion {
    private static final double CARGO_EXTRA_4K = 2800.0;

    public PlanPremium(String email, int numeroCliente, double costoBase) {
        super(email, numeroCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return getCostoBase() + CARGO_EXTRA_4K; // Cargo fijo por 4K y descargas
    }
}
