public class Empleado {

    private static int contadorLegajo = 1;
    private static int cantidadEmpleados = 0;

    private int legajo;
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.legajo = contadorLegajo++;
        this.nombre = nombre;
        this.salario = salario;
        cantidadEmpleados++;
    }

    public void aumentarPorPorcentaje(double porcentaje, String motivo) {
        double aumento = salario * (porcentaje / 100);
        salario += aumento;
        System.out.println("Aumento de " + porcentaje + "% a " + nombre +
                " | Motivo: " + motivo + " | Nuevo salario: $" + salario);
    }

    public void aumentarPorMonto(double monto, String motivo) {
        salario += monto;
        System.out.println("Aumento de $" + monto + " a " + nombre +
                " | Motivo: " + motivo + " | Nuevo salario: $" + salario);
    }

    public static int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void mostrarInformacion() {
        System.out.println("Legajo: " + legajo + " | Nombre: " + nombre + " | Salario: $" + salario);
    }
}
