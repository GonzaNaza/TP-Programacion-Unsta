package ejercicio5;

public abstract class PersonajeJugable extends SerVivo {
    private String clase;
    private int experiencia;

    public PersonajeJugable(double x, double y, int vida, int nivel, int fuerza, int defensa, String clase) {
        super(x, y, vida, nivel, fuerza, defensa);
        this.clase = clase;
        this.experiencia = 0;
    }

    public String getClase() { return clase; }
    public int getExperiencia() { return experiencia; }

    public void ganarExperiencia(int exp) {
        experiencia += exp;
        System.out.println("  >> " + getNombre() + " gana " + exp + " de experiencia! Total: " + experiencia + " XP");
    }

    public abstract void habilidadEspecial();

    @Override
    public void dibujar() {
        System.out.println("  [HEROE Nv." + getNivel() + "] " + getNombre()
                + " (" + clase + ") - " + barraDeVida());
    }
}
