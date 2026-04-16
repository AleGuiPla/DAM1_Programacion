/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso2.principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import repaso2.clases.Videojuego;
import java.util.Arrays;

/**
 *
 * @author algupl336
 */
public class GestionVideojuegos {

    public static void main(String[] args) {
        List<Videojuego> listaOriginal = new ArrayList<>();

        listaOriginal.add(new Videojuego(205, "The Legend of Zelda", 7.8, "Aventura"));
        listaOriginal.add(new Videojuego(102, "FIFA 24", 5.8, "Deportes"));
        listaOriginal.add(new Videojuego(200, "Elden Ring", 9.5));
        listaOriginal.add(new Videojuego(104, "Mario Kart 8", 5.4, "Conduccion"));
        listaOriginal.add(new Videojuego(105, "The Sims 4", 5.5, "Simulacion"));
        listaOriginal.add(new Videojuego(205, "Zelda Remastered", 5.0, "Aventura"));
        listaOriginal.add(new Videojuego(109, "Animal Crossing", 6.9, "Simulacion"));
        listaOriginal.add(new Videojuego(102, "FIFA", "Deportes"));
        listaOriginal.add(new Videojuego(115, "Minecraft"));

        mostrarColeccion(listaOriginal);

        System.out.println("\n** PASAR A TREE SET");
        Set<Videojuego> nuevaCol1 = new TreeSet<>(listaOriginal);
        mostrarColeccion(nuevaCol1);

        System.out.println("\n** MEJORAR PUNTUACIONES MAYORES DE 5 Y QUE NO SUMEN MAS DE 6");
        mejorarPuntuacion(nuevaCol1, 5);
        mostrarColeccion(nuevaCol1);
        
        System.out.println("\n** VIDEOJUEGOS SIN PUNTUACION");
        System.out.println(contarSinPuntuacion(nuevaCol1));
        
        System.out.println("\n** ELIMINAR VIDEOJUEGOS CON VALOR MENOR A 6");
        {
            Iterator<Videojuego> it = nuevaCol1.iterator();
            while (it.hasNext()) {
                Videojuego next = it.next();
                if (next.getPuntuacion() < 6) {
                    it.remove();
                }
            }
        }
        mostrarColeccion(nuevaCol1);
        
        System.out.println("\n** DE SET A ARRAY");
        Videojuego[] nuevoArray1 = nuevaCol1.toArray(new Videojuego[0]);
        System.out.println(Arrays.toString(nuevoArray1));
    }

    public static void mostrarColeccion(Collection c) {
        System.out.println("Tamaño de la coleccion: " + c.size());
        for (Object object : c) {
            System.out.println(object);
        }
    }
    
    public static int contarSinPuntuacion(Collection<Videojuego> coleccion) {
        int cantidad = 0;
        
        for (Videojuego v : coleccion) {
            if (v.getPuntuacion() == -1) {
                cantidad++;
            }
        }
        
        return cantidad;
    }
    
    public static void mejorarPuntuacion(Collection<Videojuego> coleccion, double umbral) {
        Iterator<Videojuego> it = coleccion.iterator();

        while (it.hasNext()) {
            Videojuego next = it.next();

            if (next.getPuntuacion() > umbral && next.getPuntuacion() + 0.5 <= 6) {
                next.incrementarPuntuacion(0.5);
            }
        }
    }
}
