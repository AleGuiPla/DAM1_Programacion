/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activresu_9_10;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Integer[] numAleatorios = generarArrayAleatorio(20);
        Comparator c = new ComparadorEnteros();

        Arrays.sort(numAleatorios, c);
        System.out.println(Arrays.toString(numAleatorios));

        Arrays.sort(numAleatorios, c.reversed());
        System.out.println(Arrays.toString(numAleatorios));
    }

    public static Integer[] generarArrayAleatorio(int s) {
        Integer[] t = new Integer[s];
        for (int i = 0; i < s; i++) {
            t[i] = (int) (Math.random() * 100) + 1;
        }
        return t;
    }
}
