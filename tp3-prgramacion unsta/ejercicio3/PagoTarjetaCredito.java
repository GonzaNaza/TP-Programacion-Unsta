package ejercicio3;

public class PagoTarjetaCredito implements PasarelaPago {
    private String numeroTarjeta;

    public PagoTarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("[TARJETA DE CRÉDITO] Conectando con procesador bancario...");
        System.out.println("[TARJETA DE CRÉDITO] Validando tarjeta: **** **** **** " + numeroTarjeta.substring(numeroTarjeta.length() - 4));
        System.out.printf("[TARJETA DE CRÉDITO] Cobro de $%,.0f ARS procesado exitosamente.%n", monto);
    }
}
