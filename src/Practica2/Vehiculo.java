package Taller.Practica2;
import java.util.ArrayList;
import java.util.Scanner;

// Clase base abstracta
abstract class Vehiculo {
    private int id;
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    public Vehiculo(int id, String marca, String modelo, int anio, double precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio + "]";
    }
}