import java.util.Scanner;
public class Punto1 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("ingrese la nota: ");
            int nota = sc.nextInt();

            if (nota < 4) {
                System.out.println("desaprobado");
            } else if (nota == 10) {
                System.out.println("aprobado, sobresaliente");
            }else{
                System.out.println("aprobado");

            }

     }

}