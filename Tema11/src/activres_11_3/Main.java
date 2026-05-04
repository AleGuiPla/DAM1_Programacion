/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_11_3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src\\activres_11_3\\datos.dat")); Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {
            int cantidadNum = sc.nextInt();

            double[] numeros = new double[cantidadNum];
            for (int i = 0; i < cantidadNum; i++) {
                System.out.println("Introduce un double: ");
                numeros[i] = sc.nextDouble();
            }

            out.writeObject(numeros);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
