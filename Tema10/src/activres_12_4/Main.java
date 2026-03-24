/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_12_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Collection<Integer> numeros = new ArrayList<>();
        int input = sc.nextInt();
        
        while (input != -1) {
            if (input >= 0) {
                numeros.add(input);
            }
            
            input = sc.nextInt();
        }
        
        System.out.println("SOLO NUMEROS PARES:");
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println("\n");
        
        Iterator<Integer> it = numeros.iterator();
        
        while (it.hasNext()) {
            if (it.next() % 3 == 0) {
                it.remove();
            }
        }
        
        System.out.println(numeros);
    }
}

