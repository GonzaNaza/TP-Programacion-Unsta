package ejercicio5;

public class Diablo extends MonstruoHostil implements LanzadorDeHechizos {
    private int poder;

    public Diablo(double x, double y) {
        super(x, y, 9999, 99, 200, 120, "Señor del Terror", 50000, 999999);
        this.poder = 350;
    }

    @Override
    public String getNombre() { return "Diablo, Señor del Terror"; }

    @Override
    public int getPoder() { return poder; }

    @Override
    public void atacar(SerVivo objetivo) {
        System.out.println("  >> " + getNombre() + " descarga su GOLPE INFERNAL sobre " + objetivo.getNombre() + "!");
        System.out.println("     Sus garras desgarra el alma del objetivo por " + getFuerza() + " de daño!");
        objetivo.recibirDanio(getFuerza());
    }

    @Override
    public void lanzarHechizo(String nombreHechizo) {
        System.out.println("  >> " + getNombre() + " ruge desde las profundidades del Infierno:");
        System.out.println("     ~~~ " + nombreHechizo + " ~~~");
        System.out.println("     El cielo se oscurece. Poder oscuro liberado: " + poder + " pts.");
    }
}
