package Taller.Proyecto_Oscar;

import java.util.ArrayList;

public interface IfabricaDeTrajes {

    void añadirComponentesAAlmacen(Componentes componentes) throws IdExeption;

    void listarComponentes();

    void añadirTrajeAAlmacen(String nombre, ArrayList<Componentes> piezas);

    void listarTrajes();

    void activarDesactivarRebajas();

    void crearEnvio();

    void consultarEnvio();

}
