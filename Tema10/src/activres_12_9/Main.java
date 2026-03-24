/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_12_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();

        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();

        while (num >= 0) {

            listaNumeros.add(num);

            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
        }

        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) % 2 == 0) {
                int n = listaNumeros.get(i);
                System.out.println("El número en el índice " + i + " es " + n);
                listaNumeros.set(i, listaNumeros.get(i) * 100);
            }
        }

        System.out.println(listaNumeros);
    }
}
