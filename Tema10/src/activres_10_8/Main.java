/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_10_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Nombre del fichero");
        String ficheroOriginal = new Scanner(System.in).nextLine();
        String ficheroCopia = "copia_de_" + ficheroOriginal;
        
        try (BufferedReader in = new BufferedReader(new FileReader("src\\activres_10_8\\" + ficheroOriginal));
            BufferedWriter out = new BufferedWriter(new FileWriter("src\\activres_10_8\\" + ficheroCopia))) {
            
            String linea = in.readLine();
            while (linea != null) {                
                out.write(linea);
                linea = in.readLine();
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
