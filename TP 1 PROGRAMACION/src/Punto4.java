import java.util.Scanner;
public class Punto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Día: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Año: ");
        int año = sc.nextInt();

        System.out.println("Fecha ingresada: " + dia + "/" + mes + "/" + año);

        if (mes >= 1 && mes <= 3) {
            System.out.println("estamos en el primer trimestre");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("estamos en el segundo trimestre");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("estamos en el tercer trimestre ");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("estamos en el cuarto trimestre ");
        } else {
            System.out.println("Mes inválido.");
        }

    }
}