/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activamp_12_37;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, Jugador> plantilla = new HashMap<>();

        altaJugador(plantilla, 1);
        altaJugador(plantilla, 2);

        mostrar(plantilla);
        mostrar(plantilla, PosicionCampo.PORTERO);

        bajaJugador(plantilla, 3);
        bajaJugador(plantilla, 2);

        editarJugador(plantilla, 1);

        mostrar(plantilla);
    }

    public static void altaJugador(Map<Integer, Jugador> plantilla, int dorsal) {
        String dni, nombre;
        int estatura;
        PosicionCampo posicion;

        System.out.println("** Proceso de alta de jugador");
        System.out.println("Dorsal: " + dorsal);
        System.out.print("DNI: ");
        dni = sc.nextLine();
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Altura (en cm): ");
        estatura = sc.nextInt();
        sc.nextLine(); // Limpia buffer de entrada
        System.out.print("Posicion: ");
        posicion = PosicionCampo.valueOf(sc.nextLine().toUpperCase());

        Jugador j = new Jugador(dni, nombre, estatura, posicion);
        plantilla.put(dorsal, j);

        System.out.println("** Jugador creado\n");
    }

    public static Jugador bajaJugador(Map<Integer, Jugador> plantilla, int dorsal) {
        Jugador j = plantilla.remove(dorsal);

        System.out.println("** Proceso de baja de jugador");

        if (j == null) {
            System.out.println("Jugador con dorsal " + dorsal + " inexistente");
        } else {
            System.out.println("Jugador a dar de baja: " + j);
        }
        System.out.println("** Jugador dado de baja\n");

        return j;
    }

    public static boolean editarJugador(Map<Integer, Jugador> plantilla, int dorsal) {
        String nombre;
        int estatura;
        PosicionCampo posicion;

        Jugador jugadorAntiguo = plantilla.get(dorsal);

        System.out.println("** Proceso de edicion de jugador");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Altura (en cm): ");
        estatura = sc.nextInt();
        sc.nextLine(); // Limpia buffer de entrada
        System.out.print("Posicion: ");
        posicion = PosicionCampo.valueOf(sc.nextLine().toUpperCase());
        System.out.println("** Jugador editado\n");

        if (jugadorAntiguo == null) {
            return false;
        }

        plantilla.replace(dorsal, new Jugador(jugadorAntiguo.getDni(), nombre, estatura, posicion));

        return true;
    }

    public static void mostrar(Map<Integer, Jugador> plantilla) {
        System.out.println("** Jugadores");

        for (int dorsal : plantilla.keySet()) {
            Jugador j = plantilla.get(dorsal);

            System.out.println("Dorsal " + dorsal + ": " + j);
        }

        System.out.println("** Completado\n");
    }

    public static void mostrar(Map<Integer, Jugador> plantilla, PosicionCampo posicion) {
        System.out.println("** Jugadores con posicion " + posicion.toString());

        for (int dorsal : plantilla.keySet()) {
            Jugador j = plantilla.get(dorsal);

            if (posicion == j.getPosicion()) {
                System.out.println("Dorsal " + dorsal + ": " + j);
            }
        }

        System.out.println("** Completado\n");
    }

}
