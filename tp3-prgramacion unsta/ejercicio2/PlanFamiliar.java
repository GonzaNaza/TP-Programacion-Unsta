package ejercicio2;

public class PlanFamiliar extends Suscripcion {
    private int perfilesAdicionales;
    private static final double RECARGO_POR_PERFIL = 1200.0;

    public PlanFamiliar(String email, int numeroCliente, double costoBase, int perfilesAdicionales) {
        super(email, numeroCliente, costoBase);
        this.perfilesAdicionales = perfilesAdicionales;
    }

    @Override
    public double calcularCostoMensual() {
        return getCostoBase() + (perfilesAdicionales * RECARGO_POR_PERFIL);
    }
}
