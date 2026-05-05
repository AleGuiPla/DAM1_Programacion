/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_11_20;

import java.util.Arrays;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[0];
        int opcion = 0;

        cargarClientes(clientes);

        do {
            mostrarMenu();

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1 ->
                    crearCliente(clientes);
                case 2 ->
                    System.out.println("Modificar datos");
                case 3 ->
                    System.out.println("Dar de baja cliente");
                case 4 ->
                    mostrarClientes(clientes);  
                case 5 -> {
                    guardarClientes(clientes);
                    System.out.println("Hasta pronto :)");
                }
                default ->
                    System.out.println("Opcion inválida");
            }

        } while (opcion != 5);
    }

    public static void mostrarMenu() {
        System.out.println("---- REGISTROS DE TEMPERATURA ----");
        System.out.println("1. Agregar cliente");
        System.out.println("2. Modificar cliente");
        System.out.println("3. Dar de baja a cliente");
        System.out.println("4. Listar clientes");
        System.out.println("5. Salir y guardar");
    }

    public static void cargarClientes(Cliente[] tabla) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src\\activaula_11_20\\clientes.dat"))) {
            tabla = (Cliente[]) in.readObject();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void guardarClientes(Cliente[] tabla) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src\\activaula_11_20\\clientes.dat"))) {
            out.writeObject(tabla);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void crearCliente(Cliente[] tabla) {
        int id;
        String nombre, telefono;

        do {
            System.out.print("\nID del cliente > ");
            id = sc.nextInt();
        } while (comprobarIdRepetido(id, tabla));
        sc.nextLine(); // Limpiar el buffer de entrada

        System.out.print("Nombre del cliente > ");
        nombre = sc.nextLine();

        System.out.print("Nombre del telefono > ");
        telefono = sc.nextLine();

        Cliente cliente = new Cliente(id, nombre, telefono);
        agregarClienteTabla(cliente, tabla);
    }

    public static boolean comprobarIdRepetido(int id, Cliente[] tabla) {
        for (Cliente cliente : tabla) {
            if (cliente.getId() == id) {
                return true;
            }
        }

        return false;
    }

    public static void agregarClienteTabla(Cliente cliente, Cliente[] tabla) {
        int nuevaLongitud = tabla.length + 1;
        tabla = Arrays.copyOf(tabla, nuevaLongitud);
        tabla[nuevaLongitud - 1] = cliente;
    }

    public static void mostrarClientes(Cliente[] tabla) {
        for (Cliente cliente : tabla) {
            System.out.println(cliente);
        }
    }
}
