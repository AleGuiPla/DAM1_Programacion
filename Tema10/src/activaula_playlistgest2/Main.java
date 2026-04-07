/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_playlistgest2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Set<String> playlist = new HashSet<>();

        playlist.add("Suburbia Overture");
        playlist.add("b?");
        playlist.add("more than you know");
        playlist.add("Bulls In The Bronx");
        playlist.add("The Mind Electric");
        playlist.add("b?");
        playlist.add("Dream Boat");
        playlist.add("Bulls In The Bronx");
        
        // Conversión de set a list
        List<String> listaCanciones = new ArrayList<>(playlist);
        System.out.println("Conversion de Set a List");
        System.out.println("Nueva lista partiendo de un set de canciones:\n" + listaCanciones);
        
        // Acceso posicional
        System.out.println("\nAcceso posicional");
        System.out.println("Elemento en indice 2: " + listaCanciones.get(2));
        listaCanciones.set(2, "Pretty Girl");
        System.out.println("Elemento en indice 2 cambiado: " + listaCanciones.get(2));
        listaCanciones.add(1, "The Adults Are Talking");
        System.out.println("Playlist con una cancion insertada en indice 1:\n" + listaCanciones);

        // Eliminacion por posicion
        
    }
}
