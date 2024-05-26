package Taller.Proyecto_Java;

import java.util.*;

public class FabricaDeTrajes implements IFabricaDeTrajes {
    private ArrayList<Componente> componentesEnAlmacen;
    private TreeSet<Traje> trajesEnAlmacen;
    private boolean sonRebajas;

    public FabricaDeTrajes() {
        this.componentesEnAlmacen = new ArrayList<>();
        this.trajesEnAlmacen = new TreeSet<>();
        this.sonRebajas = false;
    }

    @Override
    public void anadirComponenteAlmacen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de componente a añadir:");
        System.out.println("1. Chaqueta");
        System.out.println("2. Blusa");
        System.out.println("3. Falda");
        System.out.println("4. Pantalón");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.println("Ingrese los detalles del componente:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Talla: ");
        String talla = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Es comunitario (true/false): ");
        boolean escomunitario = scanner.nextBoolean();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        Componente componente = null;
        try {
            switch (opcion) {
                case 1:
                    System.out.print("Número de botones: ");
                    int numBotones = scanner.nextInt();
                    componente = new Chaqueta(id, nombre, talla, color, escomunitario, precio + numBotones * 2, numBotones);
                    break;
                case 2:
                    System.out.print("Es manga larga (true/false): ");
                    boolean mangaLarga = scanner.nextBoolean();
                    componente = new Blusa(id, nombre, talla, color, escomunitario, precio, mangaLarga);
                    break;
                case 3:
                    System.out.print("Tiene cremallera (true/false): ");
                    boolean conCremalleraFalda = scanner.nextBoolean();
                    componente = new Falda(id, nombre, talla, color, escomunitario, precio + (conCremalleraFalda ? 1 : 0), conCremalleraFalda);
                    break;
                case 4:
                    System.out.print("Tiene cremallera (true/false): ");
                    boolean conCremalleraPantalon = scanner.nextBoolean();
                    componente = new Pantalon(id, nombre, talla, color, escomunitario, precio + (conCremalleraPantalon ? 1 : 0), conCremalleraPantalon);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }

            validarComponente(componente);
            componentesEnAlmacen.add(componente);
            System.out.println("Componente añadido con éxito.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void listarComponentes() {
        for (Componente c : componentesEnAlmacen) {
            System.out.println(c);
        }
    }

    @Override
    public void anadirTrajeAlmacen() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la blusa:");
        listarComponentesPorTipo(Blusa.class);
        int blusaId = scanner.nextInt();
        Blusa blusa = (Blusa) obtenerComponentePorId(blusaId);

        System.out.println("Seleccione la chaqueta:");
        listarComponentesPorTipo(Chaqueta.class);
        int chaquetaId = scanner.nextInt();
        Chaqueta chaqueta = (Chaqueta) obtenerComponentePorId(chaquetaId);

        System.out.println("Seleccione la falda o pantalón:");
        listarComponentesPorTipo(Falda.class);
        listarComponentesPorTipo(Pantalon.class);
        int parteInferiorId = scanner.nextInt();
        Componente parteInferior = obtenerComponentePorId(parteInferiorId);

        try {
            validarTraje(blusa, chaqueta, parteInferior);

            int trajeId = generarNuevoId();
            String trajeNombre = "Traje " + trajeId;
            Traje traje = new Traje(trajeId, trajeNombre, blusa.getTalla(), blusa.getColor(), blusa.isEscomunitario(), blusa.getPrecio() + chaqueta.getPrecio() + parteInferior.getPrecio());
            traje.getPiezas().add(blusa);
            traje.getPiezas().add(chaqueta);
            traje.getPiezas().add(parteInferior);

            trajesEnAlmacen.add(traje);
            componentesEnAlmacen.remove(blusa);
            componentesEnAlmacen.remove(chaqueta);
            componentesEnAlmacen.remove(parteInferior);

            System.out.println("Traje añadido con éxito.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void listarTrajes() {
        for (Traje t : trajesEnAlmacen) {
            System.out.println(t);
        }
    }

    @Override
    public void activarDesactivarRebajas() {
        sonRebajas = !sonRebajas;
        for (Componente c : componentesEnAlmacen) {
            c.setPrecio(c.getPrecio() * (sonRebajas ? 0.9 : 1.1));
        }
        for (Traje t : trajesEnAlmacen) {
            t.setPrecio(t.getPrecio() * (sonRebajas ? 0.9 : 1.1));
        }
        System.out.println("Estado de rebajas cambiado a: " + sonRebajas);
    }

    @Override
    public void crearEnvio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione un traje para el envío:");
        listarTrajes();
        int trajeId = scanner.nextInt();
        Traje traje = obtenerTrajePorId(trajeId);

        if (traje != null) {
            System.out.println("Envío creado para el traje: " + traje.getNombre());
            trajesEnAlmacen.remove(traje);
        } else {
            System.out.println("Traje no encontrado.");
        }
    }

    @Override
    public void crearComponentesPrueba() {
        componentesEnAlmacen.add(new Chaqueta(1, "Chaqueta Azul", "M", "Azul", false, 50.0, 3));
        componentesEnAlmacen.add(new Blusa(2, "Blusa Roja", "M", "Rojo", false, 30.0, true));
        componentesEnAlmacen.add(new Falda(3, "Falda Negra", "M", "Negro", false, 25.0, true));
        componentesEnAlmacen.add(new Pantalon(4, "Pantalón Gris", "M", "Gris", false, 40.0, false));
        System.out.println("Componentes de prueba creados.");
    }

    private void validarComponente(Componente componente) throws Exception {
        for (Componente c : componentesEnAlmacen) {
            if (c.equals(componente)) {
                throw new Exception("El componente con ID " + componente.getId() + " ya existe.");
            }
        }
        
        long countEscomunitario = componentesEnAlmacen.stream().filter(Componente::isEscomunitario).count();
        if (componente.isEscomunitario() && countEscomunitario >= componentesEnAlmacen.size() / 2) {
            throw new Exception("No se puede añadir más del 50% de componentes escomunitarios.");
        }
        
        if (componente instanceof Blusa) {
            Blusa blusa = (Blusa) componente;
            for (Componente c : componentesEnAlmacen) {
                if (c instanceof Blusa) {
                    Blusa otraBlusa = (Blusa) c;
                    if (blusa.isMangaLarga() && !otraBlusa.isMangaLarga() && blusa.getColor().equals(otraBlusa.getColor())) {
                        throw new Exception("No se puede añadir una blusa de manga larga al almacén si ya hay una de manga corta del mismo color.");
                    }
                }
            }
        }
    }

    private void validarTraje(Componente... componentes) throws Exception {
        String color = componentes[0].getColor();
        String talla = componentes[0].getTalla();
        
        for (Componente c : componentes) {
            if (!c.getColor().equals(color)) {
                throw new Exception("Todos los componentes deben ser del mismo color.");
            }
            if (!c.getTalla().equals(talla)) {
                throw new Exception("Todos los componentes deben ser de la misma talla.");
            }
        }

        for (Traje t : trajesEnAlmacen) {
            if (t.getNombre().equals(componentes[0].getNombre())) {
                throw new Exception("El traje con ese nombre ya existe.");
            }
        }
    }
    private void listarComponentesPorTipo(Class<? extends Componente> tipo) {
        for (Componente c : componentesEnAlmacen) {
            if (tipo.isInstance(c)) {
                System.out.println(c);
            }
        }
    }

    private Componente obtenerComponentePorId(int id) {
        for (Componente c : componentesEnAlmacen) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    private Traje obtenerTrajePorId(int id) {
        for (Traje t : trajesEnAlmacen) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    private int generarNuevoId() {
        int maxId = 0;
        for (Componente c : componentesEnAlmacen) {
            if (c.getId() > maxId) {
                maxId = c.getId();
            }
        }
        for (Traje t : trajesEnAlmacen) {
            if (t.getId() > maxId) {
                maxId = t.getId();
            }
        }
        return maxId + 1;
    }

    
    public void escribirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("MENU FABRICA TRAJES");
            System.out.println("1.- Añadir Componente al almacén");
            System.out.println("2.- Listar Componentes del almacén");
            System.out.println("3.- Crear traje y añadir al almacén");
            System.out.println("4.- Listar trajes del almacén");
            System.out.println("5.- Activar/Desactivar las rebajas");
            System.out.println("6.- Crear envío");
            System.out.println("7.- Crear componentes de prueba");
            System.out.println("0.- Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    anadirComponenteAlmacen();
                    break;
                case 2:
                    listarComponentes();
                    break;
                case 3:
                    anadirTrajeAlmacen();
                    break;
                case 4:
                    listarTrajes();
                    break;
                case 5:
                    activarDesactivarRebajas();
                    break;
                case 6:
                    crearEnvio();
                    break;
                case 7:
                    crearComponentesPrueba();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }

    public static void main(String[] args) {
        FabricaDeTrajes fabrica = new FabricaDeTrajes();
        fabrica.escribirMenu();
    }
}
