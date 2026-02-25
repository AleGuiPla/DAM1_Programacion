/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaul_gestvehi;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehiculo[] listadoVehiculos = new Vehiculo[5];
        int contadorVehiculos = 0;

        boolean ejecutar = true;
        int option;

        do {
            menuPrincipal();
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    if (contadorVehiculos >= 2) {
                        System.out.println("No se pueden agregar mas vehiculos. Maximo 5");
                    } else {
                        menuAgregarVehiculo();
                        switch (sc.nextInt()) {
                            case 1 ->
                                listadoVehiculos[contadorVehiculos++] = generarAuto(sc);
                            case 2 ->
                                listadoVehiculos[contadorVehiculos++] = generarCamion(sc);
                            default ->
                                System.out.println("Opcion no válida\n");
                        }
                    }
                }

                case 2 ->
                    mostrarListadoVehiculos(listadoVehiculos);
                case 3 ->
                    ejecutar = false;
                default ->
                    System.out.println("Opción no valida\n");
            }

        } while (ejecutar);

        sc.close();
    }

    public static void menuPrincipal() {
        System.out.println("Menú hiper-chulo");
        System.out.println("----------");
        System.out.println("1. Agregar un vehículo nuevo");
        System.out.println("2. Listar vehículos");
        System.out.println("3. Salir");
        System.out.println("----------");
        System.out.print("Introduce una opción: ");
    }

    public static void menuAgregarVehiculo() {
        System.out.println("\nAgregar vehiculo");
        System.out.println("----------");
        System.out.println("1. Auto");
        System.out.println("2. Camion");
        System.out.println("----------");
        System.out.print("Introduce una opción: ");
    }

    public static Auto generarAuto(Scanner sc) {
        System.out.print("Introduce el numero de puertas: ");
        int numPuertas = sc.nextInt();
        sc.nextLine(); // limpia el \n despues del nextInt

        System.out.print("Introduce la marca: ");
        String marca = sc.nextLine();

        System.out.print("Introduce el modelo : ");
        String modelo = sc.nextLine();

        System.out.print("Introduce el año de fabricacion: ");
        int year = sc.nextInt();

        System.out.print("\n");

        return new Auto(numPuertas, marca, modelo, year);
    }

    public static Camion generarCamion(Scanner sc) {
        System.out.print("Introduce el numero de puertas: ");
        int capacidadCarga = sc.nextInt();
        sc.nextLine(); // limpia el \n despues del nextInt

        System.out.print("Introduce la marca: ");
        String marca = sc.nextLine();

        System.out.print("Introduce el modelo : ");
        String modelo = sc.nextLine();

        System.out.print("Introduce el año de fabricacion: ");
        int year = sc.nextInt();

        System.out.print("\n");

        return new Camion(capacidadCarga, marca, modelo, year);
    }

    public static void mostrarListadoVehiculos(Vehiculo[] listado) {
        int contador = 0;

        System.out.println("\nListado de vehículos");
        System.out.println("----------");
        for (Vehiculo v : listado) {
            if (v == null) {
                System.out.printf("%d. Vacio", ++contador);
            } else {
                System.out.printf("%d. %s", ++contador, v.toString());
            }
            System.out.print("\n");
        }
        System.out.println("----------\n");
    }
}
