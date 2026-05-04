package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Suscripcion> suscripciones = new ArrayList<>();

        suscripciones.add(new PlanBasico("gonzalo@gmail.com", 1001, 4500.0));
        suscripciones.add(new PlanFamiliar("martinez.familia@gmail.com", 1002, 4500.0, 3));
        suscripciones.add(new PlanPremium("carolina.vip@hotmail.com", 1003, 4500.0));
        suscripciones.add(new PlanFamiliar("rodriguez.home@yahoo.com", 1004, 4500.0, 1));

        double totalIngresos = 0;
        System.out.println("===== FACTURACIÓN MENSUAL =====");
        for (Suscripcion s : suscripciones) {
            double costo = s.calcularCostoMensual(); // Polimorfismo
            System.out.printf("Cliente %d (%s): $%,.0f ARS%n", s.getNumeroCliente(), s.getEmail(), costo);
            totalIngresos += costo;
        }
        System.out.printf("%nINGRESOS TOTALES: $%,.0f ARS%n", totalIngresos);
    }
}
