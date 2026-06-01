package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Edificio {
    private String nombre;
    private String ciudad;
    private List<Oficina> oficinas;
    public Edificio(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.oficinas = new ArrayList<>();
        System.out.println("[EDIFICIO] " + nombre + " creado en " + ciudad);
    }

    public void agregarOficina(Oficina o) {
        oficinas.add(o);
        System.out.println("  [+] Oficina " + o.getNumero() + " agregada al edificio " + nombre);
    }

    public List<Oficina> getOficinasDisponibles() {
        return oficinas.stream().filter(Oficina::isDisponible).collect(Collectors.toList());
    }

    public void listarOficinas() {
        System.out.println("=== Edificio: " + nombre + " (" + ciudad + ") ===");
        oficinas.forEach(o -> {
            System.out.println("  " + o);
            o.getInventario().forEach(m -> System.out.println("    - " + m));
        });
        System.out.println("  Oficinas disponibles: " + getOficinasDisponibles().size());
    }
}
