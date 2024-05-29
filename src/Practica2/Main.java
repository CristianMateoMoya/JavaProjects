package Taller.Practica2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventarioVehiculos inventario = new InventarioVehiculos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("MENU GESTION INVENTARIO DE VEHICULOS");
            System.out.println("1.- Añadir Vehículo");
            System.out.println("2.- Listar Vehículos");
            System.out.println("3.- Buscar Vehículo por Marca y Modelo");
            System.out.println("4.- Eliminar Vehículo por ID");
            System.out.println("5.- Calcular Valor del Inventario");
            System.out.println("6.- Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Tipo de vehículo (1: Coche, 2: Motocicleta, 3: Camión): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Año: ");
                    int anio = scanner.nextInt();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();

                    switch (tipo) {
                        case 1:
                            System.out.print("Número de puertas: ");
                            int numPuertas = scanner.nextInt();
                            System.out.print("¿Es eléctrico? (true/false): ");
                            boolean esElectrico = scanner.nextBoolean();
                            Vehiculo coche = new Coche(id, marca, modelo, anio, precio, numPuertas, esElectrico);
                            inventario.anadirVehiculo(coche);
                            break;
                        case 2:
                            System.out.print("Cilindrada: ");
                            int cilindrada = scanner.nextInt();
                            Vehiculo motocicleta = new Motocicleta(id, marca, modelo, anio, precio, cilindrada);
                            inventario.anadirVehiculo(motocicleta);
                            break;
                        case 3:
                            System.out.print("Capacidad de carga: ");
                            double capacidadCarga = scanner.nextDouble();
                            Vehiculo camion = new Camion(id, marca, modelo, anio, precio, capacidadCarga);
                            inventario.anadirVehiculo(camion);
                            break;
                        default:
                            System.out.println("Tipo de vehículo no válido.");
                            break;
                    }
                    break;
                case 2:
                    inventario.listarVehiculos();
                    break;
                case 3:
                    System.out.print("Marca: ");
                    marca = scanner.nextLine();
                    System.out.print("Modelo: ");
                    modelo = scanner.nextLine();
                    Vehiculo vehiculoEncontrado = inventario.buscarVehiculo(marca, modelo);
                    if (vehiculoEncontrado != null) {
                        System.out.println("Vehículo encontrado: " + vehiculoEncontrado);
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("ID: ");
                    id = scanner.nextInt();
                    if (!inventario.eliminarVehiculoPorId(id)) {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;
                case 5:
                    double valorInventario = inventario.calcularValorInventario();
                    System.out.println("Valor total del inventario: " + valorInventario);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
