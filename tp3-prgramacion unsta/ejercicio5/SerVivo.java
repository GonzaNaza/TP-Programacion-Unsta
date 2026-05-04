package ejercicio5;

public abstract class SerVivo extends EntidadEspacial {
    private int vidaMaxima;
    private int vidaActual;
    private int nivel;
    private int fuerza;
    private int defensa;

    public SerVivo(double x, double y, int vidaMaxima, int nivel, int fuerza, int defensa) {
        super(x, y);
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = vidaMaxima;
        this.nivel = nivel;
        this.fuerza = fuerza;
        this.defensa = defensa;
    }

    public int getVidaActual() { return vidaActual; }
    public int getVidaMaxima() { return vidaMaxima; }
    public int getNivel() { return nivel; }
    public int getFuerza() { return fuerza; }
    public int getDefensa() { return defensa; }

    public void recibirDanio(int danio) {
        int danioReal = Math.max(1, danio - defensa); // la defensa reduce el daño
        vidaActual -= danioReal;
        if (vidaActual < 0) vidaActual = 0;
        System.out.println("  >> " + getNombre() + " recibe " + danioReal
                + " de daño (bloqueó " + defensa + "). Vida: "
                + vidaActual + "/" + vidaMaxima);
    }

    public boolean estaVivo() {
        return vidaActual > 0;
    }

    public String barraDeVida() {
        int bloques = (int) ((double) vidaActual / vidaMaxima * 10);
        String barra = "[" + "█".repeat(bloques) + "░".repeat(10 - bloques) + "]";
        return barra + " " + vidaActual + "/" + vidaMaxima + " HP";
    }
}
