package ejercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("  PLATAFORMA DE TELEMEDICINA ALTA COMPLEJIDAD");
        System.out.println("============================================\n");

        // Médicos: entidades independientes (asociación)
        Medico medico1 = new Medico("MP-1001", "Ana García", "Cardiología");
        Medico medico2 = new Medico("MP-2002", "Luis Pérez", "Neurología");

        Paciente paciente = new Paciente("28.500.123", "Juan López");

        System.out.println("\n--- Consultas y registros ---");
        new Consulta(medico1, paciente, "Control cardíaco");
        paciente.registrarDiagnostico("Hipertensión arterial leve");
        paciente.registrarReceta("Enalapril 10mg - 1 comprimido diario");

        new Consulta(medico2, paciente, "Cefalea recurrente");
        paciente.registrarDiagnostico("Migraña sin aura");
        paciente.registrarReceta("Ibuprofeno 400mg - según necesidad");

        // Reporte de evolución
        System.out.println("\n--- Reporte de Evolución Histórica ---");
        paciente.verEvolucion();

        // Médicos continúan existiendo (asociación, no composición)
        System.out.println("\n--- Baja del paciente ---");
        paciente.darDeBaja();
        System.out.println("Médicos siguen activos: " + medico1 + ", " + medico2);
    }
}
