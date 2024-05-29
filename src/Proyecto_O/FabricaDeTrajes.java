package Taller.Proyecto_Oscar;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import java.util.Scanner;

public class FabricaDeTrajes implements IfabricaDeTrajes {

    private ArrayList<Componentes> componentesEnAlmacen;

    private TreeSet<Traje> trajesEnAlmacen;
    private boolean sonRebajas = false;

    public FabricaDeTrajes() {
        this.componentesEnAlmacen = new ArrayList<>();
        this.trajesEnAlmacen = new TreeSet<>((traje1, traje2) -> traje1.getNombre().compareTo(traje2.getNombre()));
        this.sonRebajas = false;
    }

    public void escribirMenu() {
        System.out.println("Menu Fabrica De Trajes ");
        System.out.println("1.- Añadir componente a Almacen");
        System.out.println("2.- Listar componentes de Almacen");
        System.out.println("3.- Crear traje y añadir a Almacen");
        System.out.println("4.- Listar trajes de Almacen");
        System.out.println("7.- Activar/Desactivar las rebajas ");
        System.out.println("8.- Crear envio");
        System.out.println("9.- Crea componentes de Prueba ");
        System.out.println("0.- salir ");

    }

    @Override
    public void añadirComponentesAAlmacen(Componentes componentes) {
        for (Componentes comp : componentesEnAlmacen) {
            if (comp.getId() == componentes.getId()) {
                throw new IdExeption("El ID ya existe: " + componentes.getId());
            }
        }
        componentesEnAlmacen.add(componentes);
    }

    public void contarComponentesPorSubclase() {
        int faldas = 0;
        int chaquetas = 0;
        int pantalones = 0;
        int blusas = 0;

        for (Componentes componente : componentesEnAlmacen) {
            if (componente instanceof Falda) {
                faldas++;
            } else if (componente instanceof Chaqueta) {
                chaquetas++;
            } else if (componente instanceof Pantalon) {
                pantalones++;
            } else if (componente instanceof Blusa) {
                blusas++;
            }
        }

        System.out.println("Cantidad de faldas: " + faldas);
        System.out.println("Cantidad de chaquetas: " + chaquetas);
        System.out.println("Cantidad de pantalones: " + pantalones);
        System.out.println("Cantidad de blusas: " + blusas);
    }

    // @Override
    // public void añadirComponentesAAlmacen(Componentes componentes) {
    // componentesEnAlmacen.add(componentes);
    // }

    @Override
    public void añadirTrajeAAlmacen(String nombre, ArrayList<Componentes> componentes) {
        Traje traje = new Traje(nombre, componentes);
        trajesEnAlmacen.add(traje);
    }

    @Override
    public void listarComponentes() {
        for (Componentes componentes : componentesEnAlmacen) {
            System.out.println(componentes);
        }
    }

    @Override
    public void activarDesactivarRebajas() {
        sonRebajas = !sonRebajas;
        System.out.println("rebajas " + (sonRebajas ? "activadas" : "desactivadas"));
    }

    public void activarDesactivarRebajas(Class<? extends Componentes> tipoComponente, double porcentaje) {
        for (Componentes componente : componentesEnAlmacen) {
            if (tipoComponente.isInstance(componente)) {
                double nuevoPrecio = componente.getPrecio() * (1);
                componente.setPrecio(nuevoPrecio);
            }
        }
        System.out.println("Rebajas aplicadas a " + tipoComponente.getSimpleName() + " con un " + (porcentaje * 100)
                + "% de descuento.");
    }

    @Override
    public void consultarEnvio() {
        System.out.println("Su envio se encuentra en " + trajesEnAlmacen);
    }

    @Override
    public void crearEnvio() {
        System.out.println(trajesEnAlmacen);
        System.out.println("seleccione el traje que desea enviar ");
        Scanner me = new Scanner(System.in);
        int tipo = me.nextInt();
        me.nextLine();
        System.out.println("El envio a sido creado con exito: ");
        me.close();

    }

    @Override
    public void listarTrajes() {
        for (Traje traje : trajesEnAlmacen) {
            System.out.println(traje);
        }

    }

    public void menuPrueba() {

        System.out.println("Que componentes desea crear: ");
        System.out.println("1-. Falda");
        System.out.println("2-. Chaqueta");
        System.out.println("3-. Pantalon");
        System.out.println("4-. Blusa");
        System.out.println("0-. volver al menu principal ");
    }

    public void componenteDePrueba() {

        añadirComponentesAAlmacen(new Falda(1, "Falda Azul", "s", "Azul", false, 450, true));
        añadirComponentesAAlmacen(new Pantalon(2, "vaqueros", "M", "Gris", false, 280, true));
        añadirComponentesAAlmacen(new Blusa(3, "Blusa sencilla", "s", "Blanca", false, 150, false));
        añadirComponentesAAlmacen(new Chaqueta(4, "Americana", "L", "Negro", false, 230, 6));
        Componentes tr1 = new Falda(5, "Moda", "M", "rojo", false, 124, true);

    }

    public void crearComponenteDePrueba(Scanner pr) {
        FabricaDeTrajes Messi = new FabricaDeTrajes();
        int SubOption;
        do {
            Messi.menuPrueba();
            SubOption = pr.nextInt();
            pr.nextLine();
            switch (SubOption) {
                case 1:
                    System.out.println("Introduce los datos de la falda :");
                    System.out.println("ID: ");
                    int faldaId = pr.nextInt();
                    pr.nextLine();
                    System.out.println("Nombre: ");
                    String faldaNombre = pr.nextLine();
                    System.out.println("Talla: ");
                    String faldaTalla = pr.nextLine();
                    System.out.println("Color: ");
                    String faldaColor = pr.nextLine();
                    System.out.println("Es comunitario SI/NO: ");
                    String esComunitarioStr;
                    boolean faldaEsComunitario;
                    do {
                        esComunitarioStr = pr.nextLine().toLowerCase();
                    } while (!esComunitarioStr.equals("si") && !esComunitarioStr.equals("no"));
                    faldaEsComunitario = esComunitarioStr.equals("si");
                    System.out.println("Precio: ");
                    double faldaPrecio = pr.nextDouble();
                    System.out.println("Tiene Cremallera (si/no): ");
                    String tieneCremmallera;
                    boolean faldaTieneCremallera = true;
                    do {
                        tieneCremmallera = pr.nextLine().toLowerCase();
                    } while (!tieneCremmallera.equals("si") && !tieneCremmallera.equals("no"));
                    faldaEsComunitario = esComunitarioStr.equals("si");
                    Falda falda1 = new Falda(faldaId, faldaNombre, faldaTalla, faldaColor, faldaEsComunitario,
                            faldaPrecio,
                            faldaTieneCremallera);
                    añadirComponentesAAlmacen(falda1);
                    break;
                case 2:
                    System.out.println("Introduce los datos de la Chaqueta :");
                    System.out.println("ID: ");
                    int chaquetaId = pr.nextInt();
                    pr.nextLine();
                    System.out.println("Nombre: ");
                    String chaquetaNombre = pr.nextLine();
                    System.out.println("Talla: ");
                    String chaquetaTalla = pr.nextLine();
                    System.out.println("Color: ");
                    String chaquetaColor = pr.nextLine();
                    System.out.println("Es comunitario SI/NO: ");
                    String esComunitarioStr1;
                    boolean chaquetaEsComunitario;
                    do {
                        esComunitarioStr1 = pr.nextLine().toLowerCase();
                    } while (!esComunitarioStr1.equals("si") && !esComunitarioStr1.equals("no"));
                    chaquetaEsComunitario = esComunitarioStr1.equals("si");
                    System.out.println("Precio: ");
                    double chaquetaPrecio = pr.nextDouble();
                    System.out.println("cuantos botones tiene: ");
                    int chaquetaBotones = pr.nextInt();
                    Chaqueta chaqueta1 = new Chaqueta(chaquetaId, chaquetaNombre, chaquetaTalla, chaquetaColor,
                            chaquetaEsComunitario, chaquetaPrecio, chaquetaBotones);
                    añadirComponentesAAlmacen(chaqueta1);
                    break;
                case 3:
                    System.out.println("Introduce los datos del Pantalon :");
                    System.out.println("ID: ");
                    int pantaId = pr.nextInt();
                    pr.nextLine();
                    System.out.println("Nombre: ");
                    String pantaNombre = pr.nextLine();
                    System.out.println("Talla: ");
                    String pantaTalla = pr.nextLine();
                    System.out.println("Color: ");
                    String pantaColor = pr.nextLine();
                    System.out.println("Es comunitario SI/NO: ");
                    String esComunitarioStr2;
                    boolean pantaEsComunitario;
                    do {
                        esComunitarioStr2 = pr.nextLine().toLowerCase();
                    } while (!esComunitarioStr2.equals("si") && !esComunitarioStr2.equals("no"));
                    pantaEsComunitario = esComunitarioStr2.equals("si");
                    System.out.println("Precio: ");
                    double pantaPrecio = pr.nextDouble();
                    System.out.println("Tiene Cremallera (si/no): ");
                    String tieneCremmallera1;
                    boolean pantaTieneCremallera = true;
                    Pantalon pantalon1 = new Pantalon(pantaId, pantaNombre, pantaTalla, pantaColor, pantaEsComunitario,
                            pantaPrecio, pantaTieneCremallera);
                    añadirComponentesAAlmacen(pantalon1);
                    do {
                        tieneCremmallera1 = pr.nextLine().toLowerCase();
                    } while (!tieneCremmallera1.equals("si") && !tieneCremmallera1.equals("no"));
                    pantaEsComunitario = tieneCremmallera1.equals("si");
                    break;
                case 4:
                    System.out.println("Introduce los datos de la Blusa :");
                    System.out.println("ID: ");
                    int blusaId = pr.nextInt();
                    pr.nextLine();
                    System.out.println("Nombre: ");
                    String blusaNombre = pr.nextLine();
                    System.out.println("Talla: ");
                    String blusaTalla = pr.nextLine();
                    System.out.println("Color: ");
                    String blusaColor = pr.nextLine();
                    System.out.println("Es comunitario SI/NO: ");
                    String esComunitarioStr3;
                    boolean blusaEsComunitario;
                    do {
                        esComunitarioStr3 = pr.nextLine().toLowerCase();
                    } while (!esComunitarioStr3.equals("si") && !esComunitarioStr3.equals("no"));
                    blusaEsComunitario = esComunitarioStr3.equals("si");
                    System.out.println("Precio: ");
                    double blusaPrecio = pr.nextDouble();
                    System.out.println("Es mangalarga (si/no): ");
                    String esMangalarga;
                    boolean blusaEsMagalarga;
                    do {
                        esMangalarga = pr.nextLine().toLowerCase();
                    } while (!esMangalarga.equals("si") && !esMangalarga.equals("no"));
                    blusaEsMagalarga = esMangalarga.equals("si");
                    Blusa blusa1 = new Blusa(blusaId, blusaNombre, blusaTalla, blusaColor, blusaEsComunitario,
                            blusaPrecio, blusaEsMagalarga);
                    añadirComponentesAAlmacen(blusa1);
                    break;
                case 0:
                    System.out.println("Regresando al menu pricipal: ");

                default:
                    System.out.println("Opción no valida");
                    break;

            }

        } while (SubOption != 0);
        {

        }
    }

    public static void main(String[] args) {
        FabricaDeTrajes Messi = new FabricaDeTrajes();
        Scanner Leo = new Scanner(System.in);
        int option;

        do {
            Messi.escribirMenu();
            option = Leo.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Introduce los datos del componente");
                    System.out.println("ID: ");
                    int id = Leo.nextInt();
                    Leo.nextLine();
                    System.out.println("Nombre");
                    String nombre = Leo.nextLine();
                    System.out.println("Talla");
                    String talla = Leo.nextLine();
                    System.out.println("Color");
                    String color = Leo.nextLine();
                    System.out.println("Es comunitario Si/No");
                    String esComunitario9;
                    boolean esComunitario;
                    do {
                        esComunitario9 = Leo.nextLine().toLowerCase();
                    } while (!esComunitario9.equals("si") && !esComunitario9.equals("no"));
                    esComunitario = esComunitario9.equals("si");
                    System.out.println("Precio");
                    double precio = Leo.nextDouble();
                    Leo.nextLine();
                    Componentes barcelona = new Componentes(id, nombre, talla, color, esComunitario, precio);
                    Messi.añadirComponentesAAlmacen(barcelona);
                    break;

                case 2:
                    Messi.listarComponentes();
                    break;

                case 3:
                    System.out.println("Introduce el nombre del traje ");
                    Leo.nextLine();
                    String nomtraje = Leo.nextLine();
                    ArrayList<Componentes> componentesTraje = new ArrayList<>();
                    System.out.println("Inserte los ids de los componentes, recuerda separarlos con un epsacio :");
                    String ids = Leo.nextLine();
                    for (String idsStr : ids.split(" ")) {
                        int compId = Integer.parseInt(idsStr);
                        for (Componentes comp : Messi.componentesEnAlmacen) {
                            if (comp.getId() == compId) {
                                componentesTraje.add(comp);
                                break;
                            }

                        }
                    }
                    Messi.añadirTrajeAAlmacen(nomtraje, componentesTraje);
                    System.out.println("Traje añadido correctamente ");
                    break;

                case 4:
                    Messi.listarTrajes();
                    break;

                case 5:
                    Messi.contarComponentesPorSubclase();
                    break;

                case 7:
                    Messi.activarDesactivarRebajas();
                    System.out.println("Ingrese el porcentaje de rebaja (entre 0 y 1):");
                    double porcentaje = Leo.nextDouble();
                    int tipo;
                    switch (tipo) {
                        case 1:
                            activarDesactivarRebajas(Falda.class, porcentaje);
                            break;
                        case 2:
                            activarDesactivarRebajas(Chaqueta.class, porcentaje);
                            break;
                        case 3:
                            activarDesactivarRebajas(Pantalon.class, porcentaje);
                            break;
                        case 4:
                            activarDesactivarRebajas(Blusa.class, porcentaje);
                            break;
                        default:
                            System.out.println("Tipo de componente no válido.");
                            break;
                    }
                    break;

                case 8:
                    Messi.crearEnvio();
                    break;

                case 9:
                    Messi.crearComponenteDePrueba(Leo);

                    break;

                case 0:
                    System.out.println("Estas saliendo del Menu ..........");
                    break;

                default:
                    System.out.println("opcion no valida, no sabes leeer");

                    break;

            }

        } while (option != 0);

        Leo.close();

    }

}
