/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaul_gestvehi;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Vehiculo[] listadoVehiculos = new Vehiculo[5];
        
        int option;
        
        do {
            option = sc.nextInt();
            
            switch (option) {
                case 1 -> {
                    
                }
                default -> {
                    System.out.println("Opción no valida");
                }
            }
            
        } while (option != 3);
        
        sc.close();
    }
    
    public static void mostrarMenu() {
        System.out.println("Menú hiper-chulo");
        System.out.println("----------");
        System.out.println("1.\tAgregar un vehículo nuevo");        
        System.out.println("2.\tListar vehículos");
        System.out.println("3.\tSalir");
        System.out.println("----------");
        System.out.print("Introduce una opción: ");

                
    }
}
