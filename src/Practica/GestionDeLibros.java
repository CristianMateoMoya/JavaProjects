package Taller.Practica;

import java.util.ArrayList;

public class GestionDeLibros extends Libro {
    private ArrayList<Libro> libros;
    
    public GestionDeLibros(int id, String titulo, String autor, int añoPublicacion, double precio) {
        super(id, titulo, autor, añoPublicacion, precio);
        this.libros = new ArrayList<>();
    }

    public void añadirLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro añadido" +libro);
    }

    public void listarLibro() {
        for (Libro libro : libros)
            System.out.println(libro);

    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public boolean eliminarLibro(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                libros.remove(libro);
                System.out.println("Libro eliminado " + libro);
                return true;
            }
        }
        return false;
    }
    
        
}

