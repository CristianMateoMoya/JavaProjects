package Taller.Ejercicio1;

public class Test {

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        for (int i = 0; i < 5; i++) {
            semaforo.cambio();
        }
    }
}