package ejercicio2;

import java.time.LocalDate;

public class EntradaMedica {
    private LocalDate fecha;
    private String tipo;
    private String descripcion;

    public EntradaMedica(String tipo, String descripcion) {
        this.fecha = LocalDate.now();
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "  [" + fecha + "] " + tipo + ": " + descripcion;
    }
}
