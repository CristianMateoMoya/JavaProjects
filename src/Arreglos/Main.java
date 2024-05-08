package Taller.ParcialOscar;

import java.util.Scanner;

import Taller.Taller_POO.Garaje;
import Taller.Taller_POO.Vehiculo;

public class Main {

    public static final int ESPACIOS_CAMIONES = 5; // Constante para la cantidad de espacios de camiones
    public static final int MAX_CAMIONES_DOBLES = 3; // Constante para la cantidad máxima de camiones dobles

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Garaje garaje = new Garaje(20); // Crear un garaje con 20 espacios

        // Bucle principal del menú
        int opcion;
        do {
            System.out.println("\n\nMENU GARAJE");
            System.out.println("1. Ingresar vehículo");
            System.out.println("2. Retirar vehículo");
            System.out.println("3. Mostrar información de un vehículo");
            System.out.println("4. Mostrar información del garaje");
            System.out.println("5. Informar camiones y espacios disponibles");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ingresarVehiculo(garaje, sc);
                    break;
                case 2:
                    retirarVehiculo(garaje, sc);
                    break;
                case 3:
                    mostrarInformacionVehiculo(garaje, sc);
                    break;
                case 4:
                    mostrarInformacionGaraje(garaje);
                    break;
                case 5:
                    informarCamionesEspaciosDisponibles(garaje);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        sc.close();
    }

    private static void informarCamionesEspaciosDisponibles(Garaje garaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'informarCamionesEspaciosDisponibles'");
    }

    private static void mostrarInformacionGaraje(Garaje garaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarInformacionGaraje'");
    }

    private static void ingresarVehiculo(Garaje garaje, Scanner sc) {
        System.out.print("Tipo de vehículo (1: Auto, 2: Moto, 3: Camión): ");
        int tipoVehiculo = sc.nextInt();

        if (tipoVehiculo == 1 || tipoVehiculo == 2) {
            // Ingresar datos para un auto o una moto
            String placa = sc.nextLine();
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Cilindrada (solo para motos): ");
            int cilindrada = sc.nextInt();

            if (tipoVehiculo == 1) {
                garaje.ingresarAuto(placa, marca, modelo);
            } else {
                garaje.ingresarMoto(placa, marca, modelo, cilindrada);
            }
        } else if (tipoVehiculo == 3) {
            // Ingresar datos para un camión
            String placa = sc.nextLine();
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Tipo de carrocería (cerrada/abierta): ");
            String tipoCarroceria = sc.nextLine();
            System.out.print("Tipo de camión (sencillo/doble): ");
            String tipoCamion = sc.nextLine();
            System.out.print("Capacidad de carga (toneladas): ");
            double capacidadCarga = sc.nextDouble();

            garaje.ingresarCamion(placa, marca, modelo, tipoCarroceria, tipoCamion, capacidadCarga);
        } else {
            System.out.println("Tipo de vehículo no válido.");
        }
    }

    private static void retirarVehiculo(Garaje garaje, Scanner sc) {
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = sc.nextLine();

        if (garaje.retirarVehiculo(placa)) {
            System.out.println("Vehículo retirado exitosamente.");
        } else {
            System.out.println("No se encontró el vehículo con esa placa.");
        }
    }

    private static void mostrarInformacionVehiculo(Garaje garaje, Scanner sc) {
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = sc.nextLine();

        Vehiculo vehiculo = garaje.buscarVehiculo(placa);
    }
}
