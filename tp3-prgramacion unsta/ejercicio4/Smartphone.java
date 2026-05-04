package ejercicio4;

// Implementa AMBAS interfaces: herencia múltiple de comportamientos
public class Smartphone extends Dispositivo implements Fotografiable, ConectableWifi {
    public Smartphone(String nombre) {
        super(nombre);
    }

    @Override
    public void tomarFotografia() {
        System.out.println("[" + getNombre() + "] 📸 Selfie tomada con cámara frontal.");
    }

    @Override
    public void conectarseAWifi(String redWifi) {
        System.out.println("[" + getNombre() + "] 📶 WiFi conectado: " + redWifi);
    }
}
