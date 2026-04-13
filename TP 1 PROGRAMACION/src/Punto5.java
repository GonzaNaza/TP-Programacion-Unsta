import java.util.Scanner;
public class Punto5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresá X (distinto de 0): ");
        int x = sc.nextInt();
        System.out.print("Ingresá Y (distinto de 0): ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("El punto está en el 1° Cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto está en el 2° Cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto está en el 3° Cuadrante");
        } else {
            System.out.println("El punto está en el 4° Cuadrante");
        }

    }
}