package ejercicio3;

public class PagoPayPal implements PasarelaPago {
    private String cuentaPayPal;

    public PagoPayPal(String cuentaPayPal) {
        this.cuentaPayPal = cuentaPayPal;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("[PAYPAL] Iniciando sesión con cuenta: " + cuentaPayPal);
        System.out.println("[PAYPAL] Autorizando transferencia con token OAuth...");
        System.out.printf("[PAYPAL] Transferencia de $%,.0f ARS completada.%n", monto);
    }
}
