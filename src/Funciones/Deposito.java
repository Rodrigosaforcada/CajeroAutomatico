package Funciones;
import java.util.Scanner;

public class Deposito extends Opciones{

    @Override
    public void transacciones(){
        System.out.print("Cuanto quiere depositar? ");
        depositar();
        System.out.println("El depósito es de: " + deposito);
        setSaldo(getSaldo() + deposito);
        System.out.println("Su saldo es " + getSaldo() );
    }
}