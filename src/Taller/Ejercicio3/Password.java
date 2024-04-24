package Taller.Ejercicio3;

import java.security.SecureRandom;


public class Password {

    public int longitud;
    public String contraseña;

    public Password() {
        this.longitud = 8;
        this.contraseña = generarPassword(longitud);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword(longitud);
    }

    public boolean esFuerte() {
        int mayusculas = 0, minusculas = 0, numeros = 0;

        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        return mayusculas >= 2 && minusculas >= 1 && numeros >= 5;
    }

    private String generarPassword(int longitud) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int ascii = random.nextInt(95) + 32; // Rango ASCII de caracteres imprimibles
            char caracter = (char) ascii;
            sb.append(caracter);
        }

        return sb.toString();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
