package ejercicio5;

public class Esqueleto extends MonstruoHostil {

    public Esqueleto(double x, double y) {
        super(x, y, 80, 8, 22, 5, "No-Muerto", 15, 120);
    }

    @Override
    public String getNombre() { return "Esqueleto Guerrero"; }

    @Override
    public void atacar(SerVivo objetivo) {
        System.out.println("  >> " + getNombre() + " ataca a " + objetivo.getNombre()
                + " con su espada oxidada! (" + getFuerza() + " de daño base)");
        objetivo.recibirDanio(getFuerza());
    }
}
