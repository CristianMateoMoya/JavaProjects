package Taller.Practica2;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(int id, String marca, String modelo, int anio, double precio, double capacidadCarga) {
        super(id, marca, modelo, anio, precio);
        this.capacidadCarga = capacidadCarga;
    }

    // Getters y setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camion [" + super.toString() + ", capacidadCarga=" + capacidadCarga + "]";
    }
}
