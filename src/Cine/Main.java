package Cine;

public class Main {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Ejemplo de Pelicula", 120, 13, "Director Ejemplo");
        Cine cine = new Cine(pelicula, 10.0, 8, 9);
        Espectador espectador = new Espectador("Jordi", 23, 100);
        cine.asignarAsiento(5, 'G', espectador);
        cine.asignarAsiento(5, 'G', espectador);
        cine.mostrarInformacionCine();
        cine.mostrarAsientos();
        System.out.println("----------BUSCAR ASIENTO-------");
        Asiento asieento = cine.buscarAsiento(5, 'G');
        System.out.println("asiento: " + asieento.toString());
    }
}
