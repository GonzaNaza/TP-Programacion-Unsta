package ejercicio2;

public abstract class Suscripcion {
    private String email;
    private int numeroCliente;
    private double costoBase;

    public Suscripcion(String email, int numeroCliente, double costoBase) {
        this.email = email;
        this.numeroCliente = numeroCliente;
        this.costoBase = costoBase;
    }

    public String getEmail() { return email; }
    public int getNumeroCliente() { return numeroCliente; }
    public double getCostoBase() { return costoBase; }

    // Contrato abstracto: cada plan calcula su costo real
    public abstract double calcularCostoMensual();
}
