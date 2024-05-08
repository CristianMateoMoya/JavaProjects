package Taller.Taller_POO;

public class Vehiculo {

    private String placa;
    private String marca;
    private double precio;
    private int cilindraje;
    protected double impuestoCirculacion;
    public double cuotaMesGaraje;

    private static final double CUOTA_BASE_GARAGE = 100;

    public Vehiculo(String marca, double precio, int cilindraje) {
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.placa = null;
        this.impuestoCirculacion = calcularImpuestoCirculacion();
        this.cuotaMesGaraje = CUOTA_BASE_GARAGE;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa.length() == 6) {
            this.placa = placa;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        this.impuestoCirculacion = calcularImpuestoCirculacion();
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if (cuotaMesGaraje >= 0) {
            this.cuotaMesGaraje = cuotaMesGaraje;
        }
    }

    private double calcularImpuestoCirculacion() {
        return precio * 0.02;
    }

    public boolean matricular(String matricula) {
        if (matricula.length() == 6) {
            this.placa = matricula;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cilindraje=" + cilindraje +
                ", impuestoCirculacion=" + impuestoCirculacion +
                ", cuotaMesGaraje=" + cuotaMesGaraje +
                '}';
    }

    public String setTieneRadio(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTieneRadio'");
    }
}