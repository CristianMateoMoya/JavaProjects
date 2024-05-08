package Taller.Taller_POO;

public class Moto extends Vehiculo {

    private boolean tieneSidecar;

    public Moto(String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;

        if (tieneSidecar) {
            this.impuestoCirculacion *= 1.1;
            this.cuotaMesGaraje *= 1.5;
        }
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;

        if (tieneSidecar) {
            this.impuestoCirculacion *= 1.1;
            this.cuotaMesGaraje *= 1.5;
        } else {
            this.impuestoCirculacion /= 1.1;
            this.cuotaMesGaraje /= 1.5;
        }
    }

    @Override
    public String toString() {
        return "Moto{" +
                "placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", precio=" + getPrecio() +
                ", cilindraje=" + getCilindraje() +
                ", tieneSidecar=" + tieneSidecar +
                ", impuestoCirculacion=" + impuestoCirculacion +
                ", cuotaMesGaraje=" + cuotaMesGaraje +
                '}';
    }
}