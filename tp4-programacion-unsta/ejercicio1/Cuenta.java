package ejercicio1;

public class Cuenta {
    private String tipo;
    private double saldo;

    public Cuenta(String tipo, double saldoInicial) {
        this.tipo = tipo;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("Monto debe ser positivo.");
        saldo += monto;
        System.out.println("  [+] Depositado $" + monto + " en cuenta " + tipo + ". Saldo: $" + saldo);
    }

    public void extraer(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("Monto debe ser positivo.");
        if (monto > saldo) throw new IllegalStateException("Saldo insuficiente en cuenta " + tipo);
        saldo -= monto;
        System.out.println("  [-] Extraído $" + monto + " de cuenta " + tipo + ". Saldo: $" + saldo);
    }

    public double getSaldo() { return saldo; }
    public String getTipo() { return tipo; }

    @Override
    public String toString() {
        return "Cuenta[" + tipo + " | Saldo: $" + String.format("%.2f", saldo) + "]";
    }
}
