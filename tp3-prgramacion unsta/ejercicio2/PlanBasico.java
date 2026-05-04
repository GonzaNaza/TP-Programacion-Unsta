package ejercicio2;

public class PlanBasico extends Suscripcion {

    public PlanBasico(String email, int numeroCliente, double costoBase) {
        super(email, numeroCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return getCostoBase(); // Solo cobra el costo base
    }
}
