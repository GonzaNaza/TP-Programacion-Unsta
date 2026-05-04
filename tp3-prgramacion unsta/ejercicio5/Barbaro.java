package ejercicio5;

public class Barbaro extends PersonajeJugable {

    public Barbaro(double x, double y) {
        super(x, y, 320, 25, 95, 40, "Bárbaro");
    }

    @Override
    public String getNombre() { return "Kael el Destructor"; }

    @Override
    public void habilidadEspecial() {
        System.out.println("  >> " + getNombre() + " activa [TORBELLINO DE ACERO]!");
        System.out.println("     Gira sin control golpeando a todos los enemigos cercanos por " + (getFuerza() * 2) + " de daño!");
    }
}
