package ejercicio1;

public class TarjetaCredito {
    private String numero;
    private double limiteCredito;
    private double saldoUtilizado;

    public TarjetaCredito(String numero, double limiteCredito) {
        this.numero = numero;
        this.limiteCredito = limiteCredito;
        this.saldoUtilizado = 0;
    }

    public void usar(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("Monto debe ser positivo.");
        if (saldoUtilizado + monto > limiteCredito)
            throw new IllegalStateException("Límite de crédito excedido.");
        saldoUtilizado += monto;
        System.out.println("  [TC] Tarjeta " + numero + " usada por $" + monto
                + ". Disponible: $" + (limiteCredito - saldoUtilizado));
    }

    public String getNumero() { return numero; }
    public double getLimite() { return limiteCredito; }
    public double getDisponible() { return limiteCredito - saldoUtilizado; }

    @Override
    public String toString() {
        return "TarjetaCredito[" + numero + " | Límite: $" + limiteCredito
                + " | Disponible: $" + String.format("%.2f", getDisponible()) + "]";
    }
}
