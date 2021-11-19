package Main;
import Funciones.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {

        int opcion;
        boolean salir = false;

        Scanner entrada = new Scanner(System.in);
        LinkedList<Usuarios> usuariosLista = Usuarios.getUsuarios();

        while (!salir){
            System.out.println("\n\nMENU");
            System.out.println("Digite un numero:");
            System.out.println("    1- Consultar saldo.");
            System.out.println("    2- Depositar.");
            System.out.println("    3- Retirar.");
            System.out.println("    4- Crear Usuario.");
            System.out.println("    5- Mostrar Usuarios.");
            System.out.println("    6- Salir.");

            opcion = entrada.nextInt();

            if (opcion == 1){
                Opciones consulta = new Consulta();
                consulta.transacciones();
            } else if (opcion == 2){
                Opciones deposito = new Deposito();
                deposito.transacciones();
            } else if (opcion == 3){
                Opciones retiro = new Retiro();
                retiro.transacciones();
            } else if (opcion == 4){
                Usuarios usuarios = new Usuarios();
                usuarios.agregarUsuario();
            } else if (opcion == 5){
                Usuarios.mostrarUsuarios(usuariosLista);
            } else if (opcion == 6){
                System.out.println("Gracias por elegir lar red de cajeros LINK");
                salir = true;
            }

        }

        Almacenamiento datosGuardados = new Almacenamiento();

        Opciones deposito = new Deposito();

        String mensaje = "El depósito tiene actualmente " + deposito.getSaldo() +" pesos.\n";

        datosGuardados.guardar(mensaje);

        LeerDatosGuardados revision = new LeerDatosGuardados();

        revision.leer();

        Cliente[] listaClientes = new Cliente[2];
        listaClientes[0] = new Cliente("Martin", 34000);
        listaClientes[1] = new Cliente("Eduardo", 47000);

        try{
            ObjectOutputStream datosSerializados = new ObjectOutputStream(new FileOutputStream("C:/Users/Usuario/Desktop/Datos Bancarios Guardados/Datos Clientes.txt"));

            datosSerializados.writeObject(listaClientes);
            datosSerializados.close();

            ObjectInputStream datosDeserializados = new ObjectInputStream(new FileInputStream("C:/Users/Usuario/Desktop/Datos Bancarios Guardados/Datos Clientes.txt"));

            Cliente[] clienteRecuperado1 = (Cliente[]) datosDeserializados.readObject();
            datosDeserializados.close();

            for(Cliente cliente : listaClientes){
                System.out.println(cliente.toString());
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

