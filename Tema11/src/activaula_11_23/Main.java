/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_11_23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Integer[] lista1 = {1, 3, 7, 4, 8};
        Integer[] lista2 = {-2, 5, 6, 23, 6};

        escribirArray("ficheroLista1", lista1);
        escribirArray("ficheroLista2", lista2);

        Integer[] fusionado = fusionar("ficheroLista1", "ficheroLista2");
        
        System.out.println("Lista ordenada fusionada: " + Arrays.toString(fusionado));

    }

    public static Integer[] leerArray(String fichero) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src\\activaula_11_23\\" + fichero))) {
            return (Integer[]) in.readObject();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        return new Integer[0];
    }

    public static void escribirArray(String fichero, Integer[] lista) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src\\activaula_11_23\\" + fichero))) {
            out.writeObject(lista);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static Integer[] fusionar(String fichero1, String fichero2) {
        Integer[] l1 = leerArray(fichero1);
        Integer[] l2 = leerArray(fichero2);

        Integer[] lista = new Integer[l1.length + l2.length];
        
        for (int i = 0; i < l1.length; i++) {
            lista[i] = l1[i];
        }
        
        for (int i = 0; i < l2.length; i++) {
            lista[i + l1.length] = l2[i];
        }
        
        Arrays.sort(lista);
        
        return lista;
    }
}
