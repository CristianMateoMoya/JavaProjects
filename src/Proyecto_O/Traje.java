package Taller.Proyecto_Oscar;

import java.util.ArrayList;

public class Traje {

    String nombre;

    ArrayList<Componentes> piezas;

    public Traje(String nombre, ArrayList<Componentes> piezas) {
        this.nombre = nombre;
        this.piezas = piezas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Componentes> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Componentes> piezas) {
        this.piezas = piezas;
    }

    public void addComponente(Componentes componentes) {

        piezas.add(componentes);
    }

    // talla excepcion
    public void mismaTalla(piezas){
        for (Componentes comp : piezas){
           if (comp.getTalla() = componentes.getTalla()){
            throw tallaExcepcion("las tallas no son compatibles "+ componentes.getTalla());
           }
        }  
    }

    public double precioFinal() {
        double precioTotal = 0.0;
        for (Componentes componente : componentes) {
            precioTotal += componente.getPrecio() + precio.conCremallera(get.precio);
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Traje{" +
                "nombre='" + nombre + '\'' +
                ", piezas=" + piezas +
                '}';
    }

}
