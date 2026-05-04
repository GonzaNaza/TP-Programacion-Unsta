package ejercicio5;

public abstract class MonstruoHostil extends SerVivo {
    private String tipo;
    private int recompensaOro;
    private int recompensaExp;

    public MonstruoHostil(double x, double y, int vida, int nivel, int fuerza, int defensa,
                          String tipo, int oro, int exp) {
        super(x, y, vida, nivel, fuerza, defensa);
        this.tipo = tipo;
        this.recompensaOro = oro;
        this.recompensaExp = exp;
    }

    public String getTipo() { return tipo; }
    public int getRecompensaOro() { return recompensaOro; }
    public int getRecompensaExp() { return recompensaExp; }

    public abstract void atacar(SerVivo objetivo);

    @Override
    public void dibujar() {
        System.out.println("  [ENEMIGO Nv." + getNivel() + "] " + getNombre()
                + " (" + tipo + ") - " + barraDeVida()
                + " | Recompensa: " + recompensaOro + " oro / " + recompensaExp + " XP");
    }
}
