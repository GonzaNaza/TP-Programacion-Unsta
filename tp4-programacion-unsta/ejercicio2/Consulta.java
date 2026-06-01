package ejercicio2;

import java.time.LocalDateTime;

public class Consulta {
    private LocalDateTime fechaHora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;

    public Consulta(Medico medico, Paciente paciente, String motivo) {
        this.medico = medico;
        this.paciente = paciente;
        this.motivo = motivo;
        this.fechaHora = LocalDateTime.now();
        System.out.println("  [CONSULTA] " + medico.getNombre()
                + " -> " + paciente.getNombre() + " | Motivo: " + motivo);
    }

    public Medico getMedico() { return medico; }
    public Paciente getPaciente() { return paciente; }
}
