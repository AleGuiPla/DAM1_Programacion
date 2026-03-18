/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import java.util.Arrays;

/**
 *
 * @author alex
 */
public class Main {

    public static void main(String[] args) {
        Dispositivo dispositivos[] = generarDispositivos(5);

        mostrarArray(dispositivos);

        dispositivos[3].setPrecio(300);
        dispositivos[4].setPrecio(300);

        Arrays.sort(dispositivos);

        System.out.println("\n---------- Ordenado natural (precio y cuando igual marca) ----------");
        mostrarArray(dispositivos);

        System.out.println("--------");
        dispositivos[2].usar();
        dispositivos[2].encender();
        dispositivos[2].usar();
        dispositivos[2].apagar();

        Arrays.sort(dispositivos, new ComparadorMarca());

        System.out.println("\n---------- Ordenado por marca ----------");
        mostrarArray(dispositivos);
        System.out.println("--------");

    }

    public static Dispositivo[] generarDispositivos(int l) {
        Dispositivo[] t = new Dispositivo[l];

        String[] marcas = {"Apple", "Xiaomi", "Samsung"};

        for (int i = 0; i < t.length; i++) {
            if ((int) (Math.random() * 2) == 0) {
                t[i] = new Movil(marcas[(int) (Math.random() * marcas.length)], "MOVIL" + i, (int) (Math.random() * 500f));
            } else {
                t[i] = new Ordenador(marcas[(int) (Math.random() * marcas.length)], "ORDENADOR" + i, (int) ((Math.random() * (1000f - 500f)) + 500f));
            }
        }

        return t;
    }

    public static void mostrarArray(Object[] t) {
        for (Object o : t) {
            System.out.println(o);
        }
    }
}
