package Taller.Taller_POO;

import java.util.Arrays;

public class Garaje implements iGaraje {

    private static final int NUM_ESPACIOS_GARAGE = 10;
    private Vehiculo[] espacios;
    private int ocupacionActual;

    public Garaje() {
        this.espacios = new Vehiculo[NUM_ESPACIOS_GARAGE];
        this.ocupacionActual = 0;
    }

    public boolean alquilarEspacio(Vehiculo vehiculo) {
        if (ocupacionActual < NUM_ESPACIOS_GARAGE && vehiculo.getPlaca() != null) {
            espacios[ocupacionActual] = vehiculo;
            ocupacionActual++;
            return true;
        }
        return false;
    }

    public boolean retirarVehiculo(String placa) {
        for (int i = 0; i < ocupacionActual; i++) {
            if (espacios[i].getPlaca().equals(placa)) {
                espacios[i] = null;
                ocupacionActual--;
                return true;
            }
        }
        return false;
    }

    
    public double calcularIngresos() {
        double ingresosTotales = 0;
        for (int i = 0; i < ocupacionActual; i++) {
            ingresosTotales += espacios[i].getCuotaMesGaraje();
        }
        return ingresosTotales;
    }

    
    public int calcularOcupacionPorTipoVehiculo(Vehiculo vehiculo) {
        int contador = 0;
        for (int i = 0; i < ocupacionActual; i++) {
            if (espacios[i].getClass().equals(vehiculo.getClass())) {
                contador++;
            }
        }
        return contador;
    }

    
    public String toString() {
        return "Garaje{" +
                "espacios=" + Arrays.toString(espacios) +
                ", ocupacionActual=" + ocupacionActual +
                '}';
    }
}
