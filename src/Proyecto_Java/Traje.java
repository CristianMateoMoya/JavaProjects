package Taller.Proyecto_Java;

import java.util.ArrayList;

public class Traje extends Componente {
    private ArrayList<Componente> piezas;

    public Traje(int id, String nombre, String talla, String color, boolean escomunitario, double precio) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.piezas = new ArrayList<>();
    }

    public ArrayList<Componente> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Componente> piezas) {
        this.piezas = piezas;
    }

    @Override
    public String toString() {
        return "Traje{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", talla='" + getTalla() + '\'' +
                ", color='" + getColor() + '\'' +
                ", escomunitario=" + isEscomunitario() +
                ", precio=" + getPrecio() +
                ", piezas=" + piezas +
                '}';
    }
}
