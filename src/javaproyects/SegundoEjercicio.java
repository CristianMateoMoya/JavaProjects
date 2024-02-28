package javaproyects;

import java.util.Scanner;

public class SegundoEjercicio {

    /*
     * En una serviteca se ha establecido una promoción de las llantas marca
     * “Pinchadas”, que consiste
     * en lo siguiente:
     * • Si se compran menos de cinco llantas el precio es de U$100 cada una, de
     * U$75 si se
     * compran de cinco a 10 y de U$50 si se compran más de 10.
     * • Obtener la cantidad de dinero que una persona tiene que pagar por cada una
     * de las llantas
     * que compra y la que tiene que pagar por el total de la compra.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantas llantas desea comprar?: ");
        int numerodeLlantas = scanner.nextInt();

        double valordeLlantas = 0;

        if (numerodeLlantas < 5) {
            valordeLlantas = 100;
        } else if (numerodeLlantas <= 10) {
            valordeLlantas = 75;
        } else if (numerodeLlantas > 10) {
            valordeLlantas = 50;
        }

        double valor = numerodeLlantas * valordeLlantas;
        System.out.println("El precio de cada llanta es: " + valordeLlantas);
        System.out.println("El valor total de la compra es: " + valor);

        scanner.close();
    }

}

/* Cristian Mateo Moya Rojas 20232215784 */