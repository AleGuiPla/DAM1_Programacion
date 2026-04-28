/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Main to edit this template
 */
package activres_10_7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author algupl336
 */
public class Main {
    public static void main(String[] args) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("src\\activres_10_7\\quijote.txt"))){
            String cad = "En un lugar de la mancha";
            for (int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));
            }
            out.newLine();
            cad = "De cuyo lugar no quiero acordarme";
            out.write(cad);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
