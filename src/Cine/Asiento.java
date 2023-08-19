
package Cine;
public class Asiento {
    char fila;
    char columna;
    boolean ocupado;

    public Asiento(char fila, char columna) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = false;
    }
}
