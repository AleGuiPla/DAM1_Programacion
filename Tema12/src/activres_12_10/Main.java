package activres_12_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> numerosOriginal = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numerosOriginal.add((int) (Math.random() * 10) + 1);
        }

        Comparator<Integer> c = Comparator.naturalOrder();
        numerosOriginal.sort(c);
        System.out.println("Lista original: " + numerosOriginal);

        Set<Integer> numerosSinRepeticiones = new TreeSet<>();
        numerosSinRepeticiones.addAll(numerosOriginal);
        System.out.println("Sin repeticiones: " + numerosSinRepeticiones);

        Set<Integer> numerosRepetidos = new TreeSet<>();
        for (Integer n : numerosSinRepeticiones) {
            numerosOriginal.remove(n);
        }
        numerosRepetidos.addAll(numerosOriginal);
        System.out.println("Repetidos: " + numerosRepetidos);

        Set<Integer> numerosUnicos = new TreeSet<>();
        numerosUnicos.addAll(numerosSinRepeticiones);
        numerosUnicos.removeAll(numerosRepetidos);
        System.out.println("Numeros unicos: " + numerosUnicos);

    }
}
