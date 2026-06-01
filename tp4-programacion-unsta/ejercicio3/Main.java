package ejercicio3;

public class Main {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("  LOGÍSTICA DE EXPORTACIÓN DE AZÚCAR (ZAFRA)");
        System.out.println("==============================================\n");

        // Locomotora (composición con el tren)
        Locomotora loco = new Locomotora("Alstom-3000", 4500);

        // Vagones (agregación: pueden migrar)
        VagonCanero v1 = new VagonCanero("V-001", 50.0);
        VagonCanero v2 = new VagonCanero("V-002", 50.0);
        VagonCanero v3 = new VagonCanero("V-003", 60.0);

        TrenAzucarero tren1 = new TrenAzucarero("TREN-A1", loco,
                "Ledesma", "Puerto Rosario", "2026-06-10");

        System.out.println("\n--- Enganchando vagones ---");
        tren1.engancharVagon(v1);
        tren1.engancharVagon(v2);
        tren1.engancharVagon(v3);

        System.out.println("\n--- Cargando azúcar ---");
        v1.cargar(45.0);
        v2.cargar(50.0);
        v3.cargar(30.0);

        System.out.println("\n--- Estado del Tren ---");
        tren1.mostrarEstado();

        // Reasignar vagón a otro tren (agregación)
        System.out.println("\n--- Reasignación de vagón ---");
        Locomotora loco2 = new Locomotora("GM-EMD", 3800);
        TrenAzucarero tren2 = new TrenAzucarero("TREN-B2", loco2,
                "San Martín", "Puerto Barranqueras", "2026-06-11");
        VagonCanero vagonMigrado = tren1.desengancharVagon("V-003");
        tren2.engancharVagon(vagonMigrado);

        System.out.println("\n--- Estado final de ambos trenes ---");
        tren1.mostrarEstado();
        tren2.mostrarEstado();
    }
}
