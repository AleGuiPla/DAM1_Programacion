/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Main to edit this template
 */
package activaula_gestproductos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        List<String> productos = new ArrayList<>();

        productos.add("Teclado");
        productos.add("Raton");
        productos.add("Monitor");
        productos.add("Impresora");
        productos.add("Raton");
        productos.add("Altavoces");

        System.out.println("Primer y ultimo indice de \"Raton\"");
        System.out.println(productos.indexOf("Raton"));
        System.out.println(productos.lastIndexOf("Raton"));

        productos.remove(3);
        
        productos.set(productos.indexOf("Monitor"), "Monitor 4K");
        
        System.out.println(productos);
    }
}
