package Taller.Proyecto_Oscar;

public class Chaqueta extends Componentes {

    // Atributos
    int numBotones;

    public Chaqueta(int id, String nombre, String talla, String color, Boolean esComunitario, double precio,
            int numBotones) {
        super(id, nombre, talla, color, esComunitario, precio);
        this.numBotones = numBotones;
    }

    public int getNumBotones() {
        return numBotones;
    }

    public void setNumBotones(int numBotones) {
        this.numBotones = numBotones;
    }

    @Override
    public String toString() {
        return "Chaqueta{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", talla='" + getTalla() + '\'' +
                ", color='" + getColor() + '\'' +
                ", esComunitario=" + getEsComunitario() +
                ", precio=" + getPrecio() +
                ", numBotones=" + numBotones +
                '}';

    }

}
