public class MainReloj {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj();

        miReloj.establecerHora(10, 30, 45);
        miReloj.mostrarHora();        // 10:30:45
        miReloj.avanzarSegundo();
        miReloj.mostrarHora();        // 10:30:46

        // prueba cambio de minuto y hora
        miReloj.establecerHora(10, 59, 59);
        miReloj.avanzarSegundo();
        miReloj.mostrarHora();        // 11:00:00
    }
}
