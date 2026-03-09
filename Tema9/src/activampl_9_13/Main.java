/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activampl_9_13;

import java.util.Comparator;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Futbolista[] futbolistas = {
            new Futbolista(1, "Juan", 18, 10),
            new Futbolista(5, "Pepe", 16, 20),
            new Futbolista(3, "Lucas", 20, 32),
            new Futbolista(2, "Alberto", 29, 31),
            new Futbolista(20, "Roberto", 23, 30)
        }; 

        Comparator comparadorEdades = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Futbolista) o1).edad - ((Futbolista) o2).edad;
            }
        };

        Comparator comparadorNombre = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Futbolista) o1).nombre.compareTo(((Futbolista) o2).nombre);
            }
        };

        Arrays.sort(futbolistas);
        System.out.println(Arrays.toString(futbolistas));

        Arrays.sort(futbolistas, comparadorEdades);
        System.out.println(Arrays.toString(futbolistas));

        Arrays.sort(futbolistas, comparadorNombre);
        System.out.println(Arrays.toString(futbolistas));
    }

}
