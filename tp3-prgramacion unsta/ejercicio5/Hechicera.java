package ejercicio5;

public class Hechicera extends PersonajeJugable implements LanzadorDeHechizos {
    private int maná;
    private int poder;

    public Hechicera(double x, double y) {
        super(x, y, 180, 28, 45, 20, "Hechicera");
        this.maná = 250;
        this.poder = 140;
    }

    @Override
    public String getNombre() { return "Lyria la Desterrada"; }

    @Override
    public int getPoder() { return poder; }

    @Override
    public void habilidadEspecial() {
        System.out.println("  >> " + getNombre() + " canaliza [NOVA DE HIELO]!");
        System.out.println("     Una explosión glacial congela todo a su alrededor por " + (poder + 30) + " de daño!");
        maná -= 40;
        System.out.println("     Maná restante: " + maná);
    }

    @Override
    public void lanzarHechizo(String nombreHechizo) {
        System.out.println("  >> " + getNombre() + " invoca: *** " + nombreHechizo + " ***");
        System.out.println("     Poder mágico: " + poder + " | Maná restante: " + (maná -= 30));
    }
}
