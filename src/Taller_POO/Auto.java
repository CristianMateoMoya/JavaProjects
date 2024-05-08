package Taller.Taller_POO;

public class Auto extends Vehiculo {

    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;

        if (tieneRadio) {
            this.impuestoCirculacion *= 1.01;
        }
        if (tieneNavegador) {
            this.impuestoCirculacion *= 1.02;
        }

        if (cilindraje > 2499) {
            this.cuotaMesGaraje *= 1.2;
        }
    }

    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public String setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;

        if (tieneRadio) {
            this.impuestoCirculacion *= 1.01;
        } else {
            this.impuestoCirculacion /= 1.01;
        }
        return null;
    }

    public boolean isTieneNavegador() {
        return tieneNavegador;
    }

    public void setTieneNavegador(boolean tieneNavegador) {
        this.tieneNavegador = tieneNavegador;

        if (tieneNavegador) {
            this.impuestoCirculacion *= 1.02;
        } else {
            this.impuestoCirculacion /= 1.02;
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", precio=" + getPrecio() +
                ", cilindraje=" + getCilindraje() +
                ", tieneRadio=" + tieneRadio +
                ", tieneNavegador=" + tieneNavegador +
                ", impuestoCirculacion=" + impuestoCirculacion +
                ", cuotaMesGaraje=" + cuotaMesGaraje +
                '}';
    }
}