package Taller.Proyecto_Java;

public class Blusa extends Componente {
    private boolean mangaLarga;

    public Blusa(int id, String nombre, String talla, String color, boolean escomunitario, double precio, boolean mangaLarga) {
        super(id, nombre, talla, color, escomunitario, precio);
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
                ", escomunitario=" + isEscomunitario() +
                ", precio=" + getPrecio() +
                ", mangaLarga=" + mangaLarga +
                '}';
    }
}
