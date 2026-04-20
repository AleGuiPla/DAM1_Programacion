/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_10_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("src\\activres_10_5\\Numeros.txt"))) {
            Scanner sc;
            double suma = 0;

            String linea = in.readLine();
            while (linea != null) {
                sc = new Scanner(linea).useLocale(Locale.US);
                if (sc.hasNextDouble()) {
                    suma += sc.nextDouble();
                }
                linea = in.readLine();
            }
            
            System.out.println(suma);
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
