package ejercicio4;

// Solo se conecta a WiFi
public class Termostato extends Dispositivo implements ConectableWifi {
    public Termostato(String nombre) {
        super(nombre);
    }

    @Override
    public void conectarseAWifi(String redWifi) {
        System.out.println("[" + getNombre() + "]  Conectado a la red: " + redWifi);
    }
}
