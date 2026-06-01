package ejercicio3;

public class HojaDeRuta {
    private String origen;
    private String destino;
    private String fechaViaje;
    private boolean valida;

    public HojaDeRuta(String origen, String destino, String fechaViaje) {
        this.origen = origen;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.valida = true;
        System.out.println("  [HOJA DE RUTA] " + origen + " -> " + destino + " | Fecha: " + fechaViaje);
    }

    public void invalidar() {
        valida = false;
        System.out.println("  [HOJA DE RUTA] Invalidada por cancelación del viaje.");
    }

    public boolean isValida() { return valida; }

    @Override
    public String toString() {
        return "HojaDeRuta[" + origen + " -> " + destino + " | " + fechaViaje
                + " | " + (valida ? "VÁLIDA" : "INVÁLIDA") + "]";
    }
}
