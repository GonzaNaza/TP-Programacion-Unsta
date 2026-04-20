public class MainLibro {
    public static void main(String[] args) {
        Libro miLibro = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "978-0345339683");

        miLibro.mostrarInformacion();
        miLibro.prestar();
        miLibro.mostrarInformacion();
        miLibro.prestar();       // ya está prestado
        miLibro.devolver();
        miLibro.mostrarInformacion();
    }
}
