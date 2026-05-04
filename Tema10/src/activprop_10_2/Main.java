/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activprop_10_2;

import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre | Edad | Estatura");
        String cadena = sc.nextLine();
        String[] datos = cadena.split("\\s+");
        
        String nombre = datos[0];
        int edad = Integer.parseInt(datos[1]);
        double estatura = Double.parseDouble(datos[2]);
        
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Estatura: " + estatura);
        
    }
}
 