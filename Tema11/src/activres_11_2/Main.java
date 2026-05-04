/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activres_11_2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        String cancion = "Con diez cañones por banda,\n"
                + "viento en popa a toda vela,\n"
                + "no corta el mar, si no vuela\n"
                + "un velero bergantín.";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src\\activres_11_2\\datos.dat"))) {
            out.writeObject(cancion);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
