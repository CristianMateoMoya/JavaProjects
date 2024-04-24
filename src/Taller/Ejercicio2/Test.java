package Taller.Ejercicio2;

public class Test {

    public static void main(String[] args) {
        Satelite satélite1 = new Satelite(40.40, -3.70, 384400);

        satélite1.mostrarPosicion();

        satélite1.cambiarPosicion(36.77, -118.24, 366300);
        satélite1.mostrarPosicion();
    }
}