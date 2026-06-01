package ejercicio3;

public class Locomotora {
    private String modelo;
    private int potenciaHP;

    public Locomotora(String modelo, int potenciaHP) {
        this.modelo = modelo;
        this.potenciaHP = potenciaHP;
    }

    @Override
    public String toString() {
        return "Locomotora[" + modelo + " | " + potenciaHP + " HP]";
    }
}
