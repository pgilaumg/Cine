
package Cine;
public class Cine {
    Pelicula peliculaActual;
    double precioEntrada;
    Asiento[][] asientos;

    public Cine(Pelicula peliculaActual, double precioEntrada, int filas, int columnas) {
        this.peliculaActual = peliculaActual;
        this.precioEntrada = precioEntrada;
        this.asientos = new Asiento[filas][columnas];
        inicializarAsientos();
    }

    private void inicializarAsientos() {
        for (int fila = 0; fila < asientos.length; fila++) {
            for (int columna = 0; columna < asientos[fila].length; columna++) {
                char label = (char) ('A' + columna);
                asientos[fila][columna] = new Asiento((char) ('8' - fila), label);
            }
        }
    }

    public void mostrarAsientos() {
        for (int fila = 0; fila < asientos.length; fila++) {
            for (int columna = 0; columna < asientos[fila].length; columna++) {
                System.out.print(asientos[fila][columna].ocupado ? "X " : "O ");
            }
            System.out.println();
        }
    }
}
