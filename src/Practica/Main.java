package Taller.Practica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionDeLibros gestionLibros = new GestionDeLibros(0, null, null, 0, 0);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("MENU GESTION LIBROS");
            System.out.println("1.- Añadir Libro");
            System.out.println("2.- Listar Libros");
            System.out.println("3.- Buscar Libro por Título");
            System.out.println("4.- Eliminar Libro por ID");
            System.out.println("5.- Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Año de Publicación: ");
                    int anio = scanner.nextInt();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    Libro libro = new Libro(id, titulo, autor, anio, precio);
                    gestionLibros.añadirLibro(libro);
                    break;
                case 2:
                    gestionLibros.listarLibro();
                    break;
                case 3:
                    System.out.print("Título: ");
                    titulo = scanner.nextLine();
                    Libro libroEncontrado = gestionLibros.buscarLibro(titulo);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado: " + libroEncontrado);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("ID: ");
                    id = scanner.nextInt();
                    if (!gestionLibros.eliminarLibro(id)) {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
