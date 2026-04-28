/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_11_9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {
    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Registro> registros = new ArrayList<>();
    }

    public static void mostrarMenu() {
        System.out.println("---- REGISTROS DE TEMPERATURA ----");
        System.out.println("1. Agregar registro");
        System.out.println("2. Listar registros");
        System.out.println("3. Guardar");
        System.out.println("4. Salir");
    }
    
    public static void cargarRegistros(Collection<Registro> r) {
       
    }
}
