package ejercicio5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("  SISTEMA DE GESTIÓN DE E-SPORTS Y TORNEOS");
        System.out.println("==========================================\n");

        Jugador j1 = new Jugador("ShadowX", "MID");
        Jugador j2 = new Jugador("IronWolf", "JUNGLE");
        Jugador j3 = new Jugador("PixelKing", "ADC");
        Jugador j4 = new Jugador("NightOwl", "SUPPORT");
        Jugador j5 = new Jugador("TitanGG", "TOP");

        Equipo equipo = new Equipo("Team Nortex");

        System.out.println("\n--- Fichajes ---");
        equipo.fichar(j1);
        equipo.fichar(j2);
        equipo.fichar(j3);
        equipo.fichar(j4);
        equipo.fichar(j5);

        System.out.println("\n--- Registrando partidas ---");
        j1.registrarPartida(8, 2, 5);
        j2.registrarPartida(5, 3, 10);
        j3.registrarPartida(12, 1, 3);

        System.out.println("\n--- Ganando trofeos ---");
        equipo.ganarTrofeo("Copa Regional NOA", 2025, "Liga Latinoamérica");
        equipo.ganarTrofeo("Championship Series", 2026, "ESL Pro League");

        System.out.println("\n--- Estado del equipo ---");
        equipo.mostrarEstadisticas();

        System.out.println("\n--- Disolución del equipo ---");
        List<Jugador> agentesLibres = equipo.disolver();

        System.out.println("\n--- Jugadores como agentes libres ---");
        agentesLibres.forEach(j -> System.out.println("  " + j));

        // Nuevo equipo ficha a algunos agentes libres
        System.out.println("\n--- Nuevo equipo fichando agentes libres ---");
        Equipo nuevoEquipo = new Equipo("Phoenix Rising");
        nuevoEquipo.fichar(agentesLibres.get(0));
        nuevoEquipo.fichar(agentesLibres.get(2));
        nuevoEquipo.mostrarEstadisticas();
    }
}
