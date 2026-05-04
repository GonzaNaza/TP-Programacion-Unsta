package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear personajes
        Barbaro barbaro       = new Barbaro(2, 3);
        Hechicera hechicera   = new Hechicera(3, 2);
        Esqueleto esqueleto   = new Esqueleto(8, 8);
        Diablo diablo         = new Diablo(15, 15);

        List<EntidadEspacial> entidades = new ArrayList<>();
        entidades.add(barbaro);
        entidades.add(hechicera);
        entidades.add(esqueleto);
        entidades.add(diablo);

        //  Presentación del mundo
        sep("EL SANTUARIO DESPIERTA — ESTADO INICIAL");
        for (EntidadEspacial e : entidades) {
            e.dibujar();
        }

        // 1. Mover a todas las entidades
        sep("LAS FUERZAS SE APROXIMAN");
        for (EntidadEspacial e : entidades) {
            e.actualizarCoordenadas(e.getX() + 2, e.getY() + 2);
        }

        // 2. Combate: los monstruos atacan a los héroes
        sep("EL INFIERNO ATACA");
        esqueleto.atacar(barbaro);
        System.out.println();
        diablo.atacar(hechicera);

        // 3. Estado de supervivencia
        sep("ESTADO DE LOS SERES VIVOS");
        for (EntidadEspacial e : entidades) {
            if (e instanceof SerVivo sv) {
                System.out.println("  " + sv.getNombre() + " — " + sv.barraDeVida()
                        + (sv.estaVivo() ? "" : " [MUERTO]"));
            }
        }

        // 4. Habilidades especiales de los héroes
        sep("LOS HEROES CONTRAATACAN");
        barbaro.habilidadEspecial();
        System.out.println();
        hechicera.habilidadEspecial();

        // 5. Solo los que dominan la magia lanzan hechizos
        sep("ATAQUES MAGICOS — SOLO LOS ELEGIDOS");
        for (EntidadEspacial e : entidades) {
            if (e instanceof LanzadorDeHechizos mago) {
                mago.lanzarHechizo(obtenerHechizo(e));
                System.out.println();
            }
        }

        // 6. Los héroes ganan experiencia
        sep("RECOMPENSAS DE BATALLA");
        barbaro.ganarExperiencia(esqueleto.getRecompensaExp());
        hechicera.ganarExperiencia(esqueleto.getRecompensaExp());

        sep("FIN DEL ACTO I — EL SANTUARIO TIEMBLA");
    }

    private static void sep(String titulo) {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("  " + titulo);
        System.out.println("╚══════════════════════════════════════════════╝");
    }

    private static String obtenerHechizo(EntidadEspacial e) {
        if (e instanceof Hechicera) return "Meteoro Infernal";
        if (e instanceof Diablo)    return "Llama Eterna del Abismo";
        return "Hechizo Desconocido";
    }
}
