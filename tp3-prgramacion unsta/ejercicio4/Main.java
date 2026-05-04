package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(new CamaraSeguridad("Cámara Puerta Principal"));
        dispositivos.add(new Termostato("Termostato Comedor"));
        dispositivos.add(new Smartphone("Samsung Galaxy S23 - Dueño"));

        System.out.println("===== CONTROLADOR CENTRAL - CONECTAR A WIFI =====");
        for (Dispositivo d : dispositivos) {
            // Solo conecta los que implementan ConectableWifi (instanceof)
            if (d instanceof ConectableWifi) {
                ((ConectableWifi) d).conectarseAWifi("Hogarsmart_Fibra300");
            } else {
                System.out.println("[" + d.getNombre() + "] No tiene WiFi, se omite.");
            }
        }

        System.out.println("\n===== CONTROLADOR CENTRAL - TOMAR FOTOS =====");
        for (Dispositivo d : dispositivos) {
            if (d instanceof Fotografiable) {
                ((Fotografiable) d).tomarFotografia();
            }
        }
    }
}
