package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ExpedienteClinico {
    private String codigo;
    private List<EntradaMedica> entradas;

    public ExpedienteClinico(String codigoPaciente) {
        this.codigo = "EXP-" + codigoPaciente;
        this.entradas = new ArrayList<>();
        System.out.println("  [EXPEDIENTE] Creado expediente " + codigo);
    }

    public void agregarEntrada(String tipo, String descripcion) {
        entradas.add(new EntradaMedica(tipo, descripcion));
        System.out.println("  [ENTRADA] Agregada entrada de tipo " + tipo);
    }

    public void generarReporte() {
        System.out.println("  === Reporte de Evolución - " + codigo + " ===");
        if (entradas.isEmpty()) {
            System.out.println("  Sin entradas registradas.");
        } else {
            entradas.forEach(System.out::println);
        }
    }

    public String getCodigo() { return codigo; }
}
