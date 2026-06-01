package ejercicio5;

public class Jugador {
    private String nickname;
    private String rol;
    private int kills;
    private int muertes;
    private int asistencias;

    public Jugador(String nickname, String rol) {
        this.nickname = nickname;
        this.rol = rol;
    }

    public void registrarPartida(int k, int m, int a) {
        kills += k;
        muertes += m;
        asistencias += a;
        System.out.println("  [STATS] " + nickname + " -> K:" + k + " M:" + m + " A:" + a);
    }

    public double getKDA() {
        return muertes == 0 ? (kills + asistencias) : (double)(kills + asistencias) / muertes;
    }

    public String getNickname() { return nickname; }
    public String getRol() { return rol; }

    @Override
    public String toString() {
        return "Jugador[" + nickname + " | " + rol
                + " | KDA: " + String.format("%.2f", getKDA()) + "]";
    }
}
