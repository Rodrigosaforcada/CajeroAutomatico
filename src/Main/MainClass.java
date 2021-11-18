package Main;
import javax.sound.sampled.SourceDataLine;

import Funciones.*;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("Hola mundo");

        Opciones mensajero_opciones = new Consulta();
        mensajero_opciones.setSaldo(6500);
        mensajero_opciones.operaciones();

    }
}
