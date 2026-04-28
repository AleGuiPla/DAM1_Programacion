/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_11_7;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src\\activres_11_7\\numeros.dat"))) {
            
        } catch (Exception e) {
        }
    }
}
