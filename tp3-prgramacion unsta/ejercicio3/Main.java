package ejercicio3;

public class Main {
    // El carrito solo conoce la interfaz PasarelaPago, no le importa cómo funciona por dentro
    public static void procesarCompra(PasarelaPago pasarela, double monto) {
        System.out.println("Procesando compra por $" + String.format("%,.0f ARS", monto) + "...");
        pasarela.procesarPago(monto); // Polimorfismo de interfaz
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("===== PASARELA DE PAGOS E-COMMERCE =====\n");

        procesarCompra(new PagoTarjetaCredito("4512789034561234"), 156999.00);
        procesarCompra(new PagoPayPal("gonzalo.compras@gmail.com"), 48500.00);
        procesarCompra(new PagoCriptomoneda("0xAbC123...", "USDT"), 320000.00);
    }
}
