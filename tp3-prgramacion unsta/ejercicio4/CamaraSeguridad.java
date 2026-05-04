package ejercicio4;

// Solo toma fotos
public class CamaraSeguridad extends Dispositivo implements Fotografiable {
    public CamaraSeguridad(String nombre) {
        super(nombre);
    }

    @Override
    public void tomarFotografia() {
        System.out.println("[" + getNombre() + "] 📸 Fotografía capturada.");
    }
}
