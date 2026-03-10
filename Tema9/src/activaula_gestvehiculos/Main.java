/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_gestvehiculos;

import java.util.Arrays;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Auto("Toyota", "Corolla", 2015, 4),
            new Auto("Honda", "Civic", 2018, 4),
            new Camion("Volvo", "FH16", 2012, 20),
            new Auto("Ford", "Focus", 2015, 4),
            new Camion("Scania", "R500", 2019, 25)
        };
        
        System.out.println("Lista de vehículos:");
        printArray(vehiculos);
        
        Arrays.sort(vehiculos);
        
        System.out.println("\nLista de vehículos ordenados:");
        printArray(vehiculos);
    }
    
    public static void printArray(Object[] t) {
        for (Object o : t) {
            System.out.println(o);
        }
    }
}
