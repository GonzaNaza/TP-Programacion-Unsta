public class MainCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("12345", "Juan Pérez", 1000);

        miCuenta.depositar(500);
        miCuenta.retirar(200);
        System.out.println("Saldo actual: " + miCuenta.consultarSaldo()); // 1300.0
        miCuenta.retirar(2000); // Saldo insuficiente
    }
}
