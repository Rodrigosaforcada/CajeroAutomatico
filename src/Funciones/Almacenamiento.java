package Funciones;

import java.io.FileWriter;
import java.io.IOException;

public class Almacenamiento {
    public void guardar(String frase) {

        try {
            FileWriter guardado = new FileWriter("C:/Users/Usuario/Desktop/Datos Bancarios Guardados/Datos Usuarios.txt", true);

            for (int i = 0; i < frase.length(); i++) {
                guardado.write(frase.charAt(i));
            }
            guardado.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}