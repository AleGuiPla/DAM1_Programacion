/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activprop_10_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        List<String> jugadores = new ArrayList<>();
        double mediaEdades = 0;
        double mediaEstaturas = 0;

        try (BufferedReader in = new BufferedReader(new FileReader("src\\activprop_10_3\\Jugadores.txt"))) {
            /* Scanner sc;
            String linea;

            linea = in.readLine();
            while (linea != null) {
                sc = new Scanner(linea).useLocale(Locale.US);
                jugadores.add(sc.next());
                mediaEdades += sc.nextInt();
                mediaEstaturas += sc.nextDouble();
                
                linea = in.readLine();
            }
             */

            String linea;

            linea = in.readLine();
            while (linea != null) {

                String[] datos = linea.split("\\s+");
                jugadores.add(datos[0]);
                mediaEdades += Integer.parseInt(datos[1]);
                mediaEstaturas += Double.parseDouble(datos[2]);

                linea = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        mediaEdades /= jugadores.size();
        mediaEstaturas /= jugadores.size();

        System.out.println("Jugadores: " + jugadores);
        System.out.println("Media edades: " + mediaEdades);
        System.out.println("Media estaturas: " + mediaEstaturas);

    }
}
