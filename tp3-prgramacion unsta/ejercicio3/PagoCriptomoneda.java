package ejercicio3;

public class PagoCriptomoneda implements PasarelaPago {
    private String walletAddress;
    private String moneda;

    public PagoCriptomoneda(String walletAddress, String moneda) {
        this.walletAddress = walletAddress;
        this.moneda = moneda;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("[CRIPTO - " + moneda + "] Conectando con blockchain...");
        System.out.println("[CRIPTO - " + moneda + "] Verificando wallet: " + walletAddress);
        System.out.printf("[CRIPTO - " + moneda + "] Transacción de $%,.0f ARS en %s confirmada en la red.%n", monto, moneda);
    }
}
