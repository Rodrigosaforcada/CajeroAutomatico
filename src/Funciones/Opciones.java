package Funciones;
import java.util.Scanner;

public abstract class Opciones {

    protected static int retiro;

    protected static int deposito;

    private static int saldo;

    Scanner entrada = new Scanner(System.in);


    public void depositar() {
        deposito = entrada.nextInt();

    }

    public void retirar() {
        retiro = entrada.nextInt();

    }

    public abstract void transacciones();

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}