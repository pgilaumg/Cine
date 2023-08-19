package Cine;

public class Asiento {

    char fila;
    char columna;
    boolean ocupado;
    Espectador espectador;

    public Asiento(char fila, char columna) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = false;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Asiento{" + "fila=" + fila + ", columna=" + columna + ", ocupado=" + ocupado + ", espectador=" + espectador + '}';
    }

}
