/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_playlistgest1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Set<String> playlist = new HashSet<>();

        // Carga inicial de elementos
        playlist.add("Suburbia Overture");
        playlist.add("b?");
        playlist.add("more than you know");
        playlist.add("Bulls In The Bronx");
        playlist.add("The Mind Electric");
        playlist.add("b?");
        playlist.add("Dream Boat");
        playlist.add("Bulls In The Bronx");

        System.out.println(playlist);
        System.out.println("Longitud de la playlist: " + playlist.size());

        // Control de duplicados
        System.out.println("\nIntento de inserción de cancion repetida");
        playlist.add("more than you know");
        System.out.println("Longitud de la playlist: " + playlist.size());

        // Eliminacion y busqueda
        System.out.println("\nEliminado Bulls In The Bronx");
        playlist.remove("Bulls In The Bronx");
        System.out.println("Existe 'Bulls In The Bronx'? " + playlist.contains("Bulls In The Bronx"));
        System.out.println("Existe 'Dream Boat'? " + playlist.contains("Dream Boat"));

        // Conversión a LinkedHashSet
        Set<String> playlistLinkedHashSet = new LinkedHashSet<>();
        playlistLinkedHashSet.addAll(playlist);
        playlistLinkedHashSet.add("King For A Day");
        System.out.println("\nPlaylist como LinkedHashSet");
        System.out.println(playlistLinkedHashSet);

        // Conversión a TreeSet
        Set<String> playlistTreeSet = new TreeSet<>();
        playlistTreeSet.addAll(playlistLinkedHashSet);
        System.out.println("\nPlaylist como TreeSet");
        System.out.println(playlistTreeSet);

        // Métodos globales
        Set<String> favoritas = new HashSet<>();
        favoritas.add("more than you know");
        favoritas.add("Dream Boat");
        favoritas.add("drew");
        System.out.println("\nMetodos globales");
        System.out.println("Favortos: " + favoritas);
        System.out.println("Retener playlist de favoritas: " + favoritas.retainAll(playlist));
        System.out.println(favoritas);
        System.out.println("favoritas contiene playlist: " + favoritas.containsAll(playlist));
        System.out.println(favoritas);
        System.out.println("Agregar playlist a favoritas: " + favoritas.addAll(playlist));
        System.out.println(favoritas);
        System.out.println("Eliminar playlist a favoritas: " + favoritas.removeAll(playlist));
        System.out.println(favoritas);

        // Vaciado de coleccion
        System.out.println("\nVaciado de playlistLinkedHashSet");
        playlistLinkedHashSet.clear();
        System.out.println(playlistLinkedHashSet);

        // Conversión a Array y de vuelta
        String[] playlistArray = playlist.toArray(new String[0]);
        System.out.println("\nPlaylist como array: " + Arrays.toString(playlistArray));
        List<String> playlistLista = new ArrayList<>();
        playlistLista.addAll(Arrays.asList(playlistArray));
        System.out.println("Playlist como lista desde el array anterior: " + playlistLista);

    }
}
