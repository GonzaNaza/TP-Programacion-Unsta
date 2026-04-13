import java.util.Scanner;
public class Punto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Preguntamos cuántos triángulos
        System.out.print("¿Cuántos triángulos querés ingresar? ");
        int n = sc.nextInt();

        int cantEquilatero = 0;
        int cantIsosceles  = 0;
        int cantEscaleno   = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("    Triángulo " + i + "    ");
            System.out.print("Lado 1: ");
            int l1 = sc.nextInt();
            System.out.print("Lado 2: ");
            int l2 = sc.nextInt();
            System.out.print("Lado 3: ");
            int l3 = sc.nextInt();
            if (l1 == l2 && l2 == l3) {
                System.out.println("Equilátero");
                cantEquilatero++;
            } else if (l1 == l2 || l2 == l3 || l1 == l3) {
                System.out.println("Isósceles");
                cantIsosceles++;
            } else {
                System.out.println("Escaleno");
                cantEscaleno++;
            }
        }
        System.out.println("\n   Resumen  ");
        System.out.println("Equiláteros: " + cantEquilatero);
        System.out.println("Isósceles:   " + cantIsosceles);
        System.out.println("Escalenos:   " + cantEscaleno);

        int menor = cantEquilatero;
        if (cantIsosceles < menor) menor = cantIsosceles;
        if (cantEscaleno  < menor) menor = cantEscaleno;

        System.out.print("Tipo con menor cantidad: ");
        if (cantEquilatero == menor) System.out.print("Equilátero ");
        if (cantIsosceles  == menor) System.out.print("Isósceles ");
        if (cantEscaleno   == menor) System.out.print("Escaleno ");
        System.out.println();

    }
}