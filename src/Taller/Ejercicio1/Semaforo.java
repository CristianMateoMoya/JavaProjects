package Taller.Ejercicio1;

public class Semaforo {

    private String color;

    public Semaforo() {
        this.color = "Rojo";
    }

    public void cambio() {
        switch (color) {
            case "Rojo":
                color = "Amarillo";
                break;
            case "Amarillo":
                color = "Verde";
                break;
            case "Verde":
                color = "Rojo";
                break;
        }
        System.out.println("Nuevo color del semáforo: " + color);
    }
}  
    
