import java.util.Scanner;
public class Punto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nota del primer parcial: ");
        double parcial1 = sc.nextDouble();
        System.out.print("nota del segundo parcial: ");
        double parcial2 = sc.nextDouble();
        System.out.print("nota del tercer parcial: ");
        double parcial3 = sc.nextDouble();

        double promedio = (parcial1 +  parcial2 + parcial3) / 3;
        System.out.println("tu promedio es: " + promedio);
        if (promedio >=8){
            System.out.println("estas promocionado");
        } else{
            System.out.println("no estas promocionado");
        }
    }

}
