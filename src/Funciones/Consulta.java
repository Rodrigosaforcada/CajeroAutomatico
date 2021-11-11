package Funciones;

public class Consulta extends Opciones{

    @Override
    public void transacciones(){
        System.out.println("---------------");
        System.out.println("Su saldo es: " + getSaldo());
        System.out.println("---------------");
    }
}