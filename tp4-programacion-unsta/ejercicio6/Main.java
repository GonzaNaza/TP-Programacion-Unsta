package ejercicio6;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("  SISTEMA DE GESTIÓN DE CONTENIDOS (STREAMING)");
        System.out.println("==========================================\n");

        // Actores: entidades independientes (asociación)
        Actor a1 = new Actor("Sofía Reyes", "Argentina");
        Actor a2 = new Actor("Marco Vitelli", "Italia");
        Actor a3 = new Actor("Lin Chen", "China");

        // Serie con composición Serie -> Temporada -> Episodio
        Serie serie = new Serie("Código Umbral", "Thriller Sci-Fi");

        System.out.println("\n--- Construyendo Temporada 1 ---");
        Temporada t1 = new Temporada(1, 2024);
        Episodio e1 = new Episodio(1, "El Despertar", 52);
        Episodio e2 = new Episodio(2, "Señal Perdida", 48);
        Episodio e3 = new Episodio(3, "El Protocolo", 55);

        e1.agregarActor(a1);
        e1.agregarActor(a2);
        e2.agregarActor(a1);
        e2.agregarActor(a3);
        e3.agregarActor(a2);
        e3.agregarActor(a3);

        t1.agregarEpisodio(e1);
        t1.agregarEpisodio(e2);
        t1.agregarEpisodio(e3);

        System.out.println("\n--- Construyendo Temporada 2 ---");
        Temporada t2 = new Temporada(2, 2025);
        Episodio e4 = new Episodio(1, "Renacer", 60);
        Episodio e5 = new Episodio(2, "El Último Nodo", 65);

        // Un actor puede estar en episodios de distintas temporadas (asociación)
        e4.agregarActor(a1);
        e4.agregarActor(a3);
        e5.agregarActor(a1);
        e5.agregarActor(a2);
        e5.agregarActor(a3);

        t2.agregarEpisodio(e4);
        t2.agregarEpisodio(e5);

        serie.agregarTemporada(t1);
        serie.agregarTemporada(t2);

        // Mostrar catálogo con duración total
        serie.mostrarCatalogo();

        // Los actores siguen existiendo (asociación)
        System.out.println("\n--- Actores (entidades independientes) ---");
        System.out.println("  " + a1);
        System.out.println("  " + a2);
        System.out.println("  " + a3);
    }
}
