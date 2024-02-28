package javaproyects;

import java.util.Scanner;

public class PrimerEjercicio {

    /*
     * En una tienda de computadoras se planea ofrecer a los clientes un descuento
     * que dependerá
     * del número de equipos que compre. Si las computadoras son menos de cinco se
     * les dará un
     * 10% de descuento sobre el total de la compra; si el número de computadoras es
     * mayor o igual
     * a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o
     * más se les da un
     * 40% de descuento. El precio de cada computadora es de U$500.
     */

    public static void main(String[] args) {
        double PrecioComputadora = 500;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantas computadoras desea comprar?: ");
        int numerodeComputadoras = scanner.nextInt();

        double valorTotal = numerodeComputadoras * PrecioComputadora;
        double descuento;

        if (numerodeComputadoras < 5) {
            descuento = 0.10;
        } else if (numerodeComputadoras < 10) {
            descuento = 0.20;
        } else {
            descuento = 0.40;
        }

        double valorConDescuento = valorTotal - (valorTotal * descuento);

        System.out.println("Valor de su compra: $" + valorTotal);
        System.out.println("Su descuento fue de: " + (descuento * 100) + "%");
        System.out.println("valor con descuento: $" + valorConDescuento);
        scanner.close();
    }
}

/* Cristian Mateo Moya Rojas 20232215784 */
