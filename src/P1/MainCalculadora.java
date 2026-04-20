public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Suma 5+3: " + calculadora.sumar(5, 3));
        System.out.println("Resta 10-4: " + calculadora.restar(10, 4));
        System.out.println("Multiplicación 3*7: " + calculadora.multiplicar(3, 7));
        System.out.println("División 10/2: " + calculadora.dividir(10, 2));
        calculadora.dividir(5, 0); // prueba división por cero
    }
}
