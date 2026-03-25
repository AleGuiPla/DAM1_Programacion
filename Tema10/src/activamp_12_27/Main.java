package activamp_12_27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author algupl336
 */
public class Main {
    public static void main(String[] args) {
        List<Character> cadena = leerCadena();
        System.out.println(cadena);
    }
    
    static List<Character> leerCadena() {
        String cadenaOriginal = (new Scanner(System.in)).nextLine();
        List<Character> listaCaracteres = new ArrayList<>();
        
        for (int i = 0; i<cadenaOriginal.length(); i++) {
            listaCaracteres.add(cadenaOriginal.charAt(i));
        }
        
        return listaCaracteres;
    }
}
