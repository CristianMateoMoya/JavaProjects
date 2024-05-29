package Taller.Practica2;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(int id, String marca, String modelo, int anio, double precio, int cilindrada) {
        super(id, marca, modelo, anio, precio);
        this.cilindrada = cilindrada;
    }

    // Getters y setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta [" + super.toString() + ", cilindrada=" + cilindrada + "]";
    }
}