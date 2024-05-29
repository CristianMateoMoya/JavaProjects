package Taller.Proyecto_Oscar;

public class Blusa extends Componentes {

    boolean mangaLarga;

    public Blusa(int id, String nombre, String talla, String color, Boolean esComunitario, double precio,
            boolean mangaLarga) {
        super(id, nombre, talla, color, esComunitario, precio);
        this.mangaLarga = mangaLarga;
    }

    public boolean isMangaLarga() {
        return mangaLarga;
    }

    public void setMangaLarga(boolean mangaLarga) {
        this.mangaLarga = mangaLarga;
    }

    @Override
    public String toString() {
        return "Blusa{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", talla='" + getTalla() + '\'' +
                ", color='" + getColor() + '\'' +
                ", esComunitario=" + getEsComunitario() +
                ", precio=" + getPrecio() +
                ", mangaLarga=" + mangaLarga +
                '}';
    }

}
