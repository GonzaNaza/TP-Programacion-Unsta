package ejercicio7;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("  PLANIFICACIÓN ACADÉMICA UNIVERSITARIA");
        System.out.println("==========================================\n");

        // Facultad (composición con carreras)
        Facultad facultad = new Facultad("Ingeniería Informática");

        // Carreras (composición con Facultad)
        Carrera informatica = new Carrera("Ingeniería Informática", 5, "2024");
        Carrera sistemas    = new Carrera("Licenciatura en Sistemas", 4, "2023");

        // Materias (composición con PlanDeEstudios)
        informatica.agregarMateria(new Materia("II-101", "Programación I",     6, 1));
        informatica.agregarMateria(new Materia("II-102", "Matemática Discreta",4, 1));
        informatica.agregarMateria(new Materia("II-201", "Programación II",    6, 2));
        informatica.agregarMateria(new Materia("II-202", "Algoritmos",         4, 2));
        informatica.agregarMateria(new Materia("II-301", "Base de Datos",      5, 3));

        sistemas.agregarMateria(new Materia("LS-101", "Introducción a Sistemas", 4, 1));
        sistemas.agregarMateria(new Materia("LS-102", "Cálculo I",               5, 1));
        sistemas.agregarMateria(new Materia("LS-201", "Programación Orientada a Objetos", 6, 2));

        facultad.agregarCarrera(informatica);
        facultad.agregarCarrera(sistemas);

        // Docentes (asociación: independientes, pueden estar en varias carreras)
        Docente d1 = new Docente("D-001", "Dr. Carlos Méndez",  12);
        Docente d2 = new Docente("D-002", "Ing. Laura Castillo", 8);
        Docente d3 = new Docente("D-003", "Mg. Roberto Díaz",   16);

        System.out.println("\n--- Asignación y validación de carga horaria ---");
        // D1: 6+6 = 12hs (límite exacto)
        facultad.asignarDocente(d1, "II-101");
        facultad.asignarDocente(d1, "II-201");
        facultad.asignarDocente(d1, "LS-201"); // debería rechazarse (12+6 > 12)

        // D2: 4+5 = 9hs > 8hs (segunda asignación debe fallar)
        facultad.asignarDocente(d2, "II-102");
        facultad.asignarDocente(d2, "LS-102"); // 4+5 > 8, falla

        // D3: puede dictar en ambas carreras (asociación cross-facultad)
        facultad.asignarDocente(d3, "II-301");
        facultad.asignarDocente(d3, "LS-101");
        facultad.asignarDocente(d3, "II-202");

        // Estructura de la facultad
        facultad.mostrarEstructura();

        // Resumen de docentes (siguen existiendo: asociación)
        System.out.println("\n--- Estado final de docentes ---");
        System.out.println("  " + d1);
        System.out.println("  " + d2);
        System.out.println("  " + d3);

        // Cierre de facultad (carreras desaparecen, docentes NO)
        System.out.println("\n--- Cierre de la facultad ---");
        facultad.cerrar();
        facultad.mostrarEstructura();

        System.out.println("\n  Docentes siguen existiendo tras el cierre:");
        System.out.println("  " + d1);
        System.out.println("  " + d2);
        System.out.println("  " + d3);
    }
}
