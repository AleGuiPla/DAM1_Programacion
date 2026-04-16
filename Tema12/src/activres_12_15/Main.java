/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_12_15;

import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> listadoProductos = new HashMap<String, Integer>();

        int op = menuGestion(sc);
        System.out.print("\n");

        while (op != 5) {
            switch (op) {
                case 1 ->
                    realizarAlta(sc, listadoProductos);
                case 2 ->
                    realizarBaja(sc, listadoProductos);
                case 3 ->
                    actualizarExistencias(sc, listadoProductos);
                case 4 ->
                    listarExistencias(listadoProductos);
                default ->
                    System.out.println("Opción no válida");
            }

            System.out.print("\n");
            op = menuGestion(sc);
            System.out.print("\n");
        }
    }

    public static int menuGestion(Scanner sc) {
        mostrarMenuPrincipal();
        System.out.print("Elige una opción > ");
        int op = sc.nextInt();
        return op;
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("-------- Gestor de productos --------");
        System.out.println("1. Dar de alta un producto");
        System.out.println("2. Dar de baja un producto");
        System.out.println("3. Actualizar stock de producto");
        System.out.println("4. Listar existencias");
        System.out.println("5. Salir");
        System.out.println("-------- ******************* --------");
    }

    public static void realizarAlta(Scanner sc, Map<String, Integer> m) {
        String cod;
        int stock;

        sc.nextLine(); // Limpia el buffer
        System.out.print("Introduce codigo de producto > ");
        cod = sc.nextLine();
        System.out.print("Introduce el stock del producto > ");
        stock = sc.nextInt();

        m.put(cod, stock);
        System.out.println("Producto introducido correctamente");
    }

    public static void realizarBaja(Scanner sc, Map<String, Integer> m) {
        String cod;

        sc.nextLine(); // Limpia el buffer
        System.out.print("Introduce codigo de producto > ");
        cod = sc.nextLine();

        m.remove(cod);
        System.out.println("Producto eliminado correctamente");
    }

    public static void actualizarExistencias(Scanner sc, Map<String, Integer> m) {
        String cod;
        int stock;

        sc.nextLine(); // Limpia el buffer
        System.out.print("Introduce codigo de producto > ");
        cod = sc.nextLine();
        System.out.print("Introduce el nuevo stock del producto > ");
        stock = sc.nextInt();

        m.replace(cod, stock);
        System.out.println("Producto actualizado correctamente");
    }

    public static void listarExistencias(Map<String, Integer> m) {
        System.out.println("Producto  |  Existencias");
        for (String prod : m.keySet()) {
            System.out.println(prod
                    + "             ".substring(prod.length())
                    + m.get(prod));
        }
    }
}
