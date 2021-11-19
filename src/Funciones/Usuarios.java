package Funciones;

import java.util.*;

public class Usuarios implements Comparable<Usuarios> {

    private String nombre;
    private int cuenta;
    private static LinkedList<Usuarios> usuarios = new LinkedList<Usuarios>();

    public Usuarios(String nombre, int cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public Usuarios() {

    }

    public static LinkedList<Usuarios> getUsuarios() {
        return usuarios;
    }

    private String getNombre() {
        return this.nombre;
    }

    public static Usuarios agregarUsuario() {

        String nombreCompleto;
        int nroCuenta;

        Scanner entrada = new Scanner(System.in);

        System.out.println("\\CREANDO USUARIO.....");

        try {
            System.out.print("Ingrese el nombre del usuario: ");
            nombreCompleto = entrada.nextLine();

            System.out.print("Ingrese el nro de cuenta: ");
            nroCuenta = entrada.nextInt();

            Usuarios usuarioCreado = new Usuarios(nombreCompleto, nroCuenta);

            usuarios.add(usuarioCreado);

        } catch (Exception e) {
            String error = "Error al cargar los datos. " + e;
            System.out.println(error);
            return null;
        }

        System.out.println("Usuario creado con exito!");
        System.out.println("Actualmente hay " + usuarios.size() + " usuarios creados.");

        return new Usuarios(nombreCompleto, nroCuenta);
    }

    public static void mostrarUsuarios(LinkedList<Usuarios> listaUsuarios) {

        Iterator<Usuarios> iterator = usuarios.iterator();

        System.out.println("\nLista de usuarios:");

        if (listaUsuarios.size() == 0)
            System.out.println("No hay usuarios cargados.");
        else {
            while(iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }



    }

    public String toString() {
        return "[Nombre: " + this.getNombre() + ", Cuenta: " + this.cuenta + "] ";
    }


    @Override
    public int compareTo(Usuarios o) {
        return 0;
    }
}


