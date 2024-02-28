package javaproyects;

import java.util.Scanner;

public class CuartoEjercicio {

/*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2 0%
2.01 - 5   10%
5.01 - 10 15%
10.01 en adelante 20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería. */

public static void main(String[] args) {
        double valorPorKilo = 6000;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantos kilos desea comprar?: ");
        double numerodeKilos = scanner.nextInt();

        double valorTotal = numerodeKilos * valorPorKilo;
        double descuento = 0;

        if (numerodeKilos <= 2.0){
            descuento = 0;
        }
        else if(numerodeKilos <= 5.0) {
            descuento = 0.10;
        } else if (numerodeKilos <= 10.0) {
            descuento = 0.15;
        } else {
            descuento = 0.20;
        }
        

        double valorConDescuento = valorTotal - (valorTotal * descuento);
        System.out.println("Su descuento fue de: " + (descuento * 100) + "%");
        System.out.println("Su valor total es: $" + valorConDescuento);
        
        scanner.close();
    }
}
    
/*Cristian Mateo Moya Rojas u20232215784 */
