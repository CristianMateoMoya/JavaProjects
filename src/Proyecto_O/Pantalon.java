package Taller.Proyecto_Oscar;

public class Pantalon extends Componentes {
    boolean conCremallera;

    public Pantalon(int id, String nombre, String talla, String color, Boolean esComunitario, double precio,
            boolean conCremallera) {
        super(id, nombre, talla, color, esComunitario, precio);
        this.conCremallera = conCremallera;
    }

    public boolean isConCremallera() {
        return conCremallera;
    }

    public void setConCremallera(boolean conCremallera) {
        this.conCremallera = conCremallera;
    }

    @Override
    public String toString() {
        return "Pantalon{" +
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
