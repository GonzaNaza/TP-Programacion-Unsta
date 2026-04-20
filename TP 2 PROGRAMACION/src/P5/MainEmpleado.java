public class MainEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Ana García", 50000);
        Empleado emp2 = new Empleado("Carlos López", 60000);
        Empleado emp3 = new Empleado("María Torres", 45000);

        emp1.mostrarInformacion();
        emp2.mostrarInformacion();
        emp3.mostrarInformacion();

        System.out.println("Total de empleados: " + Empleado.getCantidadEmpleados());

        emp1.aumentarPorPorcentaje(10, "Evaluación anual");
        emp2.aumentarPorMonto(5000, "Proyecto especial");
    }
}
