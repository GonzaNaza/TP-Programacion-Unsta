package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> flota = new ArrayList<>();

        flota.add(new Furgoneta("Renault", "Master", 85000.0, 1400.0));
        flota.add(new Furgoneta("Peugeot", "Expert", 72000.0, 950.0));
        flota.add(new Motocicleta("Zanella", "ZR 150", 18500.0, 150));
        flota.add(new Motocicleta("Motomel", "Skua 250", 27000.0, 250));

        System.out.println("===== REPORTE DE FLOTA =====");
        for (Vehiculo v : flota) {
            v.mostrarInformacion();  // Polimorfismo: cada uno imprime según su tipo
            System.out.println();
        }
    }
}
