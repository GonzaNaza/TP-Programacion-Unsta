package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class TrenAzucarero {
    private String id;
    private Locomotora locomotora;      // COMPOSICIÓN
    private HojaDeRuta hojaDeRuta;      // COMPOSICIÓN
    private List<VagonCanero> vagones;  // AGREGACIÓN
    private boolean enServicio;

    public TrenAzucarero(String id, Locomotora locomotora, String origen, String destino, String fecha) {
        this.id = id;
        this.locomotora = locomotora;
        this.hojaDeRuta = new HojaDeRuta(origen, destino, fecha);
        this.vagones = new ArrayList<>();
        this.enServicio = true;
        System.out.println("[TREN] " + id + " formado con " + locomotora);
    }

    public void engancharVagon(VagonCanero vagon) {
        vagones.add(vagon);
        System.out.println("  [ENGANCHE] Vagón " + vagon.getId() + " enganchado al tren " + id);
    }

    /** Desenganche: el vagón puede migrar a otro tren (agregación) */
    public VagonCanero desengancharVagon(String vagonId) {
        VagonCanero v = vagones.stream()
                .filter(vag -> vag.getId().equals(vagonId))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Vagón no encontrado: " + vagonId));
        vagones.remove(v);
        System.out.println("  [DESENGANCHE] Vagón " + vagonId + " desenganchado del tren " + id);
        return v;
    }

    public double calcularCapacidadTotal() {
        return vagones.stream().mapToDouble(VagonCanero::getCapacidadToneladas).sum();
    }

    public double calcularCargaTotal() {
        return vagones.stream().mapToDouble(VagonCanero::getCargaActual).sum();
    }

    public void cancelarViaje() {
        System.out.println("[CANCELACIÓN] Viaje del tren " + id + " cancelado.");
        hojaDeRuta.invalidar(); // composición: hoja pierde validez
        enServicio = false;
    }

    public void mostrarEstado() {
        System.out.println("=== Tren: " + id + " [" + (enServicio ? "EN SERVICIO" : "CANCELADO") + "] ===");
        System.out.println("  " + locomotora);
        System.out.println("  " + hojaDeRuta);
        System.out.println("  Vagones (" + vagones.size() + "):");
        vagones.forEach(v -> System.out.println("    " + v));
        System.out.println("  Capacidad total: " + calcularCapacidadTotal() + "t");
        System.out.println("  Carga actual: " + calcularCargaTotal() + "t");
    }
}
