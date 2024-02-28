package javaproyects;

import java.util.Scanner;

public class TercerEjercicio {

    /*
     * Un proveedor de reproductores de música ofrece un descuento del 10% sobre el
     * precio sin IVA,
     * de algún aparato, si esta cuesta U$500 o más. Además, independientemente de
     * esto, ofrece un
     * 5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA
     * incluido, un cliente
     * cualquiera por la compra de su aparato. El IVA es del 19%
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del productor de musica? ");
        double sinDescuento = scanner.nextDouble();
        System.out.println("Su producto es marca NOSY? ");
        String NOSY = scanner.next();
        
        double descuento = 0;

        if (sinDescuento >= 500) 
            {descuento += 0.10;}
        if (NOSY.equalsIgnoreCase("Si")) 
            {descuento += 0.05;}
        
        double valorConDescuento = sinDescuento - (sinDescuento * descuento);
        double precioConIVA = valorConDescuento * 0.19;
        double precioTotal = valorConDescuento + precioConIVA;

        System.out.println("Su valor a pagar es: $" + precioTotal);
        scanner.close();

    }
}

/* Cristian Mateo Moya Rojas 20232215784 */