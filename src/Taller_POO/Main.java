package Taller.Taller_POO;

public class Main {

    public static void main(String[] args) {
        Garaje garaje = new Garaje();

        // Crear algunos vehículos de prueba
        Vehiculo moto1 = new Moto("Honda", 5000, 250, true);
        Vehiculo moto2 = new Moto("Yamaha", 3000, 125, false);
        Vehiculo auto1 = new Auto("Toyota", 15000, 2000, true, true);
        Vehiculo auto2 = new Auto("Ford", 10000, 1800, false, false);

        // Alquilar vehículos en el garaje
        System.out.println("Alquilando moto1: " + garaje.alquilarEspacio(moto1));
        System.out.println("Alquilando moto2: " + garaje.alquilarEspacio(moto2));
        System.out.println("Alquilando auto1: " + garaje.alquilarEspacio(auto1));
        System.out.println("Alquilando auto2: " + garaje.alquilarEspacio(auto2));

        // Mostrar información del garaje
        System.out.println("\nInformación del garaje:");
        System.out.println(garaje);

        // Calcular ingresos mensuales
        System.out.println("\nIngresos mensuales: " + garaje.calcularIngresos());

        // Calcular ocupación por tipo de vehículo
        System.out.println("\nMotos ocupadas: " + garaje.calcularOcupacionPorTipoVehiculo(new Moto(null, 0, 0, false)));
        System.out.println("Autos ocupados: " + garaje.calcularOcupacionPorTipoVehiculo(new Auto(null, 0, 0, false, false)));

        // Retirar un vehículo
        System.out.println("\nRetirando moto2: " + garaje.retirarVehiculo("YAMAHA123"));
        System.out.println(garaje);

        // Probar métodos de los vehículos
        System.out.println("\nMatricular moto1: " + moto1.matricular("HOND250"));
        System.out.println("Precio moto1: " + moto1.getPrecio());
        System.out.println("Impuesto moto1: " + moto1.getImpuestoCirculacion());
        System.out.println("Cuota garaje moto1: " + moto1.getCuotaMesGaraje());

        System.out.println("\nActivar radio auto1: " + auto1.setTieneRadio(true));
        System.out.println("Precio auto1: " + auto1.getPrecio());
        System.out.println("Impuesto auto1: " + auto1.getImpuestoCirculacion());
        System.out.println("Cuota garaje auto1: " + auto1.getCuotaMesGaraje());
    }
}