/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_12_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 100 + 1));
        }

        Integer[] tabla = lista.toArray(new Integer[0]);
        Arrays.sort(tabla);

        Collection<Integer> listaOrdenadaCreciente = new ArrayList<>();
        listaOrdenadaCreciente.addAll(Arrays.asList(tabla));

        Comparator<Integer> comparadorDecreciente = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        };
        Arrays.sort(tabla, comparadorDecreciente);

        Collection<Integer> listaOrdenadaDecreciente = new ArrayList<>();
        listaOrdenadaDecreciente.addAll(Arrays.asList(tabla));

        System.out.println(lista);
        System.out.println(listaOrdenadaCreciente);
        System.out.println(listaOrdenadaDecreciente);

    }
}
