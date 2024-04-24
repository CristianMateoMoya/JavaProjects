package Taller.Ejercicio2;

public class Satelite {

    private double paralelo;
    private double meridiano;
    private int distanciaTierra;

    public Satelite(double paralelo, double meridiano, int distanciaTierra) {
        this.paralelo = paralelo;
        this.meridiano = meridiano;
        this.distanciaTierra = distanciaTierra;
    }

    public void cambiarPosicion(double nuevoParalelo, double nuevoMeridiano, int nuevaDistanciaTierra) {
        this.paralelo = nuevoParalelo;
        this.meridiano = nuevoMeridiano;
        this.distanciaTierra = nuevaDistanciaTierra;
    }

    public void mostrarPosicion() {
        System.out.println("Posición Paralelo: " + paralelo);
        System.out.println("Posicion Meridiano: " + meridiano);
        System.out.println("Posicion Distancia Tierra: " + distanciaTierra);
    }
}