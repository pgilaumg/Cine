package Cine;
public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Ejemplo de Pelicula", 120, 13, "Director Ejemplo");
        Cine cine = new Cine(pelicula, 10.0, 8, 9);

        cine.mostrarAsientos();
    }
}
