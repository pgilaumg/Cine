package Cine;

public class Espectador {

    String Nombre;
    int edad;
    double dinero;

    public Espectador(String nombre, int edad, double dinero) {
        this.Nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador{" + "Nombre=" + Nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
}
