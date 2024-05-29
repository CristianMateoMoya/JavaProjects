package Taller.Proyecto_Oscar;

public class Falda extends Componentes {

    // Atributos
    boolean conCremallera;

    public Falda(int id, String nombre, String talla, String color, Boolean esComunitario, double precio,
            boolean conCremallera) {
        super(id, nombre, talla, color, esComunitario, precio);
        this.conCremallera = conCremallera;
    }

    @Override
    public String toString() {
        return "Falda{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", talla='" + getTalla() + '\'' +
                ", color='" + getColor() + '\'' +
                ", esComunitario=" + getEsComunitario() +
                ", precio=" + getPrecio() +
                ", conCremallera=" + conCremallera +
                '}';

    }

}
