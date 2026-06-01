package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private String numero;
    private int capacidadPersonas;
    private boolean disponible;
    private List<Mobiliario> inventario; // AGREGACIÓN

    public Oficina(String numero, int capacidadPersonas) {
        this.numero = numero;
        this.capacidadPersonas = capacidadPersonas;
        this.disponible = true;
        this.inventario = new ArrayList<>();
    }

    public void agregarMobiliario(Mobiliario m) {
        m.asignar();
        inventario.add(m);
        System.out.println("  [OFICINA " + numero + "] Mobiliario agregado: " + m.getTipo());
    }

    public List<Mobiliario> remodelar() {
        System.out.println("  [REMODELACIÓN] Oficina " + numero + " - liberando mobiliario...");
        List<Mobiliario> liberados = new ArrayList<>(inventario);
        liberados.forEach(Mobiliario::enviarADeposito);
        inventario.clear();
        return liberados;
    }

    public void reservar() {
        if (!disponible) throw new IllegalStateException("Oficina " + numero + " ya está reservada.");
        disponible = false;
        System.out.println("  [RESERVA] Oficina " + numero + " reservada.");
    }

    public void liberar() {
        disponible = true;
        System.out.println("  [LIBRE] Oficina " + numero + " disponible.");
    }

    public String getNumero() { return numero; }
    public boolean isDisponible() { return disponible; }
    public List<Mobiliario> getInventario() { return inventario; }

    @Override
    public String toString() {
        return "Oficina[" + numero + " | Cap: " + capacidadPersonas + "p"
                + " | " + (disponible ? "DISPONIBLE" : "OCUPADA")
                + " | Muebles: " + inventario.size() + "]";
    }
}
