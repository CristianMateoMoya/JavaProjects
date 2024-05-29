package Taller.Practica2;

class Coche extends Vehiculo {
    private int numPuertas;
    private boolean esElectrico;

    public Coche(int id, String marca, String modelo, int anio, double precio, int numPuertas, boolean esElectrico) {
        super(id, marca, modelo, anio, precio);
        this.numPuertas = numPuertas;
        this.esElectrico = esElectrico;
    }

    // Getters y setters
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    @Override
    public String toString() {
        return "Coche [" + super.toString() + ", numPuertas=" + numPuertas + ", esElectrico=" + esElectrico + "]";
    }
}