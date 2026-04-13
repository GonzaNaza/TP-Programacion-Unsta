import java.util.Scanner;
public class Punto3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese un numero (1-99): ");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 9) {
            System.out.println("el numero es de un solo digito");
        }else if (numero >=10 && numero <=99) {
            System.out.println("el numero es de dos digitos");
        }else {
            System.out.println("numero fuera de rango");
        }
    }
}
