package Funciones;
import java.util.Scanner;

public abstract class Opciones {

    protected int retiro, deposito;
    private static int saldo;

    Scanner entrada = new Scanner(System.in);


    public void operaciones() {
        int opcion = 0, bandera = 0;
        do {
            do {
                System.out.println("Opciones del cajero LINK");
                System.out.println("    1- Consultar saldo.");
                System.out.println("    2- Depositar.");
                System.out.println("    3- Retirar.");
                System.out.println("    4- Salir.");

                opcion = entrada.nextInt();

                if (opcion <= 4 && opcion >= 1) {
                    bandera = 1;
                } else {
                    System.out.println("Error weon");
                }

            } while (bandera == 0);

            if (opcion == 1) {
                Opciones mensajero_consulta = new Consulta();
                mensajero_consulta.transacciones();
            } else if (opcion == 2) {
                Opciones mensajero_deposito = new Deposito();
                mensajero_deposito.transacciones();
            } else if (opcion == 3) {
                Opciones mensajero_retirar = new Retiro();
                mensajero_retirar.transacciones();
            } else if (opcion == 4) {
                System.out.println("Gracias por elegir lar red de cajeros LINK");
                System.out.println("\nPrograma finalizado");
                bandera = 1;
            }

        } while (bandera == 0);
    }


    public void depositar() {
        deposito = entrada.nextInt();

    }

    public void retirar() {
        retiro = entrada.nextInt();

    }
    //Polimorfismo
    public abstract void transacciones();


    //Metodos setter y getter
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}