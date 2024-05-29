package Taller.Proyecto_Oscar;

public class Componentes {

    // Atributos
    int id;
    String nombre;
    String talla;
    String color;
    Boolean esComunitario;
    double precio;

    // constructor
    public Componentes(int id, String nombre, String talla, String color, Boolean esComunitario, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.esComunitario = esComunitario;
        this.precio = precio;

        // getters and setters
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getEsComunitario() {
        return esComunitario;
    }

    public void setEsComunitario(Boolean esComunitario) {
        this.esComunitario = esComunitario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Componente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                ", esComunitario=" + esComunitario +
                ", precio=" + precio +
                '}';

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Componentes that = (Componentes) obj;
        return id == that.id;

    }

    public int compareTo(Componentes M) {
        return Integer.compare(this.id, M.id);
    }

}