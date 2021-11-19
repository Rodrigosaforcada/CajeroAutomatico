package Funciones;
import java.util.Scanner;

public class Retiro extends Opciones{
    @Override
    public void transacciones(){
        System.out.print("Cuanto quiere retirar? ");
        retirar();
        if (getSaldo() >= retiro){
            System.out.println("Usted ha retirado " + retiro);
            setSaldo(getSaldo() - retiro);
            System.out.println("Tu saldo es: " + getSaldo());
        }else{
            System.out.println("ERROR");
        }
    }
}