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
                asientos[fila][columna] = new Asiento((char) ('1' + fila), label);
            }
        }
    }

    public void mostrarAsientos() {
        for (int fila = 0; fila < asientos.length; fila++) {
            for (int columna = 0; columna < asientos[fila].length; columna++) {
                String uso = asientos[fila][columna].ocupado ? "X " : "O";
                Asiento aux = asientos[fila][columna];
                System.out.print(aux.getFila() + "" + aux.getColumna() + " " + uso + " ");
            }
            System.out.println();
        }
    }

    public Asiento buscarAsiento(int fila, char columna) {
        int columnInt = getColumnLetter(columna);
        int filaInt = fila - 1;
        return asientos[filaInt][columnInt];
    }

    public void asignarAsiento(int fila, char columna, Espectador e) {
        int columnInt = getColumnLetter(columna);
        int filaInt = fila - 1;
        Asiento aux = asientos[filaInt][columnInt];
        if(aux.isOcupado()){
            System.out.println("El asiento: "+aux.toString()+" Esta ocupado.");
        }else{
            aux.setEspectador(e);
            aux.setOcupado(true);
        }
    }

    public int getColumnLetter(char columna) {
        switch (columna) {
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            case 'E':
                return 4;
            case 'F':
                return 5;
            case 'G':
                return 6;
            case 'H':
                return 7;
            case 'I':
                return 8;
            default:
                throw new AssertionError();
        }
    }

    public void mostrarInformacionCine() {
        System.out.println("-------------------------------");
        System.out.println(peliculaActual.toString());
        System.out.println("Precio de entrada: " + precioEntrada);
        System.out.println("-------------------------------");
    }
}
