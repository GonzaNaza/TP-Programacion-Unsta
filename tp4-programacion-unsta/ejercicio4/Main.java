package ejercicio4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("  MOTOR DE RESERVAS PARA COWORKING GLOBAL");
        System.out.println("==========================================\n");

        Edificio edificio = new Edificio("TechHub Palermo", "Buenos Aires");

        // Oficinas
        Oficina o1 = new Oficina("101", 6);
        Oficina o2 = new Oficina("102", 4);
        Oficina o3 = new Oficina("201", 10);

        edificio.agregarOficina(o1);
        edificio.agregarOficina(o2);
        edificio.agregarOficina(o3);

        // Mobiliario
        System.out.println("\n--- Asignando mobiliario ---");
        Mobiliario e1 = new Mobiliario("E-001", "ESCRITORIO");
        Mobiliario e2 = new Mobiliario("E-002", "ESCRITORIO");
        Mobiliario s1 = new Mobiliario("S-001", "SILLA_ERGONOMICA");
        Mobiliario s2 = new Mobiliario("S-002", "SILLA_ERGONOMICA");

        o1.agregarMobiliario(e1);
        o1.agregarMobiliario(s1);
        o2.agregarMobiliario(e2);
        o2.agregarMobiliario(s2);

        // Reservas
        System.out.println("\n--- Reservando oficinas ---");
        o1.reservar();

        System.out.println("\n--- Estado del edificio ---");
        edificio.listarOficinas();

        // Remodelación: los muebles van al depósito (agregación)
        System.out.println("\n--- Remodelando oficina 102 ---");
        List<Mobiliario> mobEnDeposito = o2.remodelar();
        System.out.println("  Muebles en depósito: " + mobEnDeposito.size());

        // Reasignar muebles del depósito a otra oficina
        System.out.println("\n--- Reasignando muebles a oficina 201 ---");
        mobEnDeposito.forEach(o3::agregarMobiliario);

        System.out.println("\n--- Estado final ---");
        edificio.listarOficinas();
    }
}
