package Taller.Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de passwords: ");
        int cantidadPasswords = 0;
        try {
            cantidadPasswords = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero.");
            System.exit(1);
        }

        System.out.print("Ingrese la longitud de las passwords: ");
        int longitudPassword = 0;
        try {
            longitudPassword = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero.");
            System.exit(1);
        }

        Password[] passwords = new Password[cantidadPasswords];
        boolean[] sonFuertes = new boolean[cantidadPasswords];

        for (int i = 0; i < passwords.length; i++) {
            passwords[i] = new Password(longitudPassword);
            sonFuertes[i] = passwords[i].esFuerte();
        }

        System.out.println("\nPasswords generadas:");
        for (int i = 0; i < passwords.length; i++) {
            System.out.printf("Password #%d: %s (Longitud: %d, ¿Fuerte?: %s)\n", i + 1, passwords[i].getContraseña(),
                    passwords[i].getLongitud(), sonFuertes[i] ? "Sí" : "No");
        }
    }
}