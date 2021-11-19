package Funciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerDatosGuardados {

    public void leer(){

        try {
            FileReader lectura = new FileReader("C:/Users/Usuario/Desktop/Datos Bancarios Guardados/Datos Usuarios.txt");

            BufferedReader cargaPrevia = new BufferedReader(lectura);

            String linea = "";

            while(linea != null) {
                linea = cargaPrevia.readLine();

                if(linea != null) {
                    System.out.println(linea);
                }
            }
            lectura.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}