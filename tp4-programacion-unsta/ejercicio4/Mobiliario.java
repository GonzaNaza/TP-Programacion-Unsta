package ejercicio4;

public class Mobiliario {
    private String id;
    private String tipo;
    private String estado;

    public Mobiliario(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
        this.estado = "EN_DEPOSITO";
    }

    public void asignar() {
        estado = "ASIGNADO";
    }

    public void enviarADeposito() {
        estado = "EN_DEPOSITO";
        System.out.println("  [DEPÓSITO] " + tipo + " [" + id + "] enviado al depósito general.");
    }

    public String getId() { return id; }
    public String getTipo() { return tipo; }
    public String getEstado() { return estado; }

    @Override
    public String toString() {
        return tipo + "[" + id + " | " + estado + "]";
    }
}
