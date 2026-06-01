package ejercicio1;

import java.util.ArrayList;
import java.util.List;


public class Billetera {
    private String id;
    private boolean activa;
    private List<Cuenta> cuentas;
    private List<TarjetaCredito> tarjetas;

    public Billetera(String id) {
        this.id = id;
        this.activa = true;
        this.cuentas = new ArrayList<>();
        this.tarjetas = new ArrayList<>();
        cuentas.add(new Cuenta("PESOS", 0));
        cuentas.add(new Cuenta("DOLARES", 0));
        cuentas.add(new Cuenta("CRIPTO", 0));
    }

    private void verificarActiva() {
        if (!activa) throw new IllegalStateException("La billetera " + id + " está cerrada.");
    }

    public void depositar(String tipo, double monto) {
        verificarActiva();
        getCuenta(tipo).depositar(monto);
    }

    public void transferir(String tipoOrigen, String tipoDestino, double monto) {
        verificarActiva();
        System.out.println("  [TRANSFERENCIA] " + tipoOrigen + " -> " + tipoDestino + " $" + monto);
        getCuenta(tipoOrigen).extraer(monto);
        getCuenta(tipoDestino).depositar(monto);
    }

    public void agregarTarjeta(TarjetaCredito tc) {
        verificarActiva();
        tarjetas.add(tc);
        System.out.println("  [TC] Tarjeta " + tc.getNumero() + " asociada a billetera " + id);
    }

    public List<TarjetaCredito> migrarTarjetas() {
        List<TarjetaCredito> migradas = new ArrayList<>(tarjetas);
        tarjetas.clear();
        System.out.println("  [MIGRACIÓN] " + migradas.size() + " tarjeta(s) migradas desde billetera " + id);
        return migradas;
    }

    public void cerrar() {
        verificarActiva();
        System.out.println("  [CIERRE] Billetera " + id + " cerrada. Cuentas eliminadas.");
        cuentas.clear();
        activa = false;
    }

    public double getSaldoConsolidado() {
        verificarActiva();
        return cuentas.stream().mapToDouble(Cuenta::getSaldo).sum();
    }

    private Cuenta getCuenta(String tipo) {
        return cuentas.stream()
                .filter(c -> c.getTipo().equalsIgnoreCase(tipo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Cuenta no encontrada: " + tipo));
    }

    public String getId() { return id; }
    public boolean isActiva() { return activa; }

    public void mostrarEstado() {
        System.out.println("=== Billetera: " + id + " [" + (activa ? "ACTIVA" : "CERRADA") + "] ===");
        if (activa) {
            cuentas.forEach(c -> System.out.println("  " + c));
            tarjetas.forEach(t -> System.out.println("  " + t));
            System.out.println("  Saldo consolidado: $" + String.format("%.2f", getSaldoConsolidado()));
        }
    }
}
