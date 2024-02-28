package Arreglos;

public class ForJava {
    public static void main(String[] args) {
        /*
         * Para i=1 hasta 5 Hacer
         * 
         * FinPara
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println("i:" + i);
        }

        for (int i = 5; i >= 1; i--) {
            System.out.println("i:" + i);
        }
        int i, j;
        for (i = 1, j = i + 10; i < 5; i++, j = 2 * i) {
            System.out.println("i= " + i + " j= " + j);
        }
        System.out.println("if:" + i);
        System.out.println("jf:" + j);
    }
}
