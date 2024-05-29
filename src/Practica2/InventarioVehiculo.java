package Taller.Practica2;

import java.util.ArrayList;

    class InventarioVehiculos {
    private ArrayList<Vehiculo> vehiculos;

    public InventarioVehiculos() {
        this.vehiculos = new ArrayList<>();
    }

    public void anadirVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehiculo añadido: " + vehiculo);
    }

    public void listarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    public Vehiculo buscarVehiculo(String marca, String modelo) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca().equalsIgnoreCase(marca) && vehiculo.getModelo().equalsIgnoreCase(modelo)) {
                return vehiculo;
            }
        }
        return null;
    }

    public boolean eliminarVehiculoPorId(int id) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getId() == id) {
                vehiculos.remove(vehiculo);
                System.out.println("Vehiculo eliminado: " + vehiculo);
                return true;
            }
        }
        return false;
    }

    public double calcularValorInventario() {
        double total = 0;
        for (Vehiculo vehiculo : vehiculos) {
            total += vehiculo.getPrecio();
        }
        return total;
    }
}