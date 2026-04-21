/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_10_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("src\\activres_10_6\\Enteros.txt")); Scanner sc = new Scanner(in)) {
            int suma = 0;
            int contador = 0;

            while (sc.hasNextInt()) {
                suma += sc.nextInt();
                contador++;
            }

            System.out.println("Suma: " + suma + " Media: " + ((double) suma / contador));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
