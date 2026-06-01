package ejercicio1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("  SISTEMA DE GESTIÓN DE NEOBANCO");
        System.out.println("======================================\n");

        // Crear usuario (composición: crea su propia billetera)
        Usuario usuario = new Usuario("Carlos");
        Billetera bil = usuario.getBilletera();

        // Depositar en diferentes cuentas
        System.out.println("\n--- Depósitos ---");
        bil.depositar("PESOS", 50000);
        bil.depositar("DOLARES", 1000);
        bil.depositar("CRIPTO", 0.5);

        // Agregar tarjeta de crédito (agregación)
        System.out.println("\n--- Tarjeta de Crédito ---");
        TarjetaCredito tc = new TarjetaCredito("4242-4242-4242-4242", 200000);
        bil.agregarTarjeta(tc);
        tc.usar(30000);

        // Transferencia entre cuentas
        System.out.println("\n--- Transferencia entre cuentas ---");
        bil.transferir("PESOS", "DOLARES", 10000);

        // Estado actual
        System.out.println("\n--- Estado de la Billetera ---");
        bil.mostrarEstado();

        // Simular migración y cierre
        System.out.println("\n--- Migración de tarjetas y cierre de billetera ---");
        Usuario usuario2 = new Usuario("Maria");
        List<TarjetaCredito> migradas = bil.migrarTarjetas();
        migradas.forEach(t -> usuario2.getBilletera().agregarTarjeta(t));

        bil.cerrar(); // Cuentas destruidas (composición), tarjetas ya migradas (agregación)

        System.out.println("\n--- Estado de la nueva billetera de Maria ---");
        usuario2.getBilletera().mostrarEstado();
    }
}
