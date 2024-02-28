package Arreglos;

public class Array {
    public static void main(String[] args) {
        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) ((Math.random() * 10) + 1);
            System.out.println("i: " + i + "-num[i]:" + num[i]);
        }
        int acum = 0;
        int j = 0;
        while (j < num.length) {
            acum += num[j];
            j++;
        }
        System.out.println("Acum: " + acum);

        // Foreach
        int num1[] = new int[10];
        num1[0] = 99;
        num1[2] = 98;
        for (int n : num1) {
            System.out.println(n);
        }
    }
}
