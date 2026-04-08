package activaula_playlistavanzada;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Cancion> playlist = new ArrayList<>();

        playlist.add(new Cancion("Thanatos", 2018));
        playlist.add(new Cancion("Hellfire", "Roland Faunte", 2024));
        playlist.add(new Cancion("Thank you, my twilight", "the pillows"));
        playlist.add(new Cancion("Mr. Blue Sky"));
        playlist.add(new Cancion("Cicada", "Good Kid", 2026));
        playlist.add(new Cancion("Thank you, my twilight", "the pillows"));
        playlist.add(new Cancion("Kass Theme", "The Deku Trio", 2025));
        playlist.add(new Cancion("Kass Theme", "SudoName", 2020));
        playlist.add(new Cancion("trees", "HOAX", 2022));
        playlist.add(new Cancion("more than you know", "HOAX", 2022));

        mostrarColeccion(playlist);

        System.out.println("\nModificacion via get elemento en el indice 4");
        System.out.println("Original: " + playlist.get(4));
        playlist.set(4, new Cancion("First Rate Town", "Good Kid", 2023));
        System.out.println("Get nuevo elemento en el indice 4");
        System.out.println(playlist.get(4));

        System.out.println("\nEliminacion por posicion y objeto");
        playlist.remove(1);
        System.out.println("Eliminado el indice 1");
        System.out.println("Eliminado el indice por objeto");
        playlist.remove(new Cancion("First Rate Town", "Good Kid"));
        mostrarColeccion(playlist);

        System.out.println("\nBusqueda de indice por objeto. Primera y ultima aparicion");
        System.out.println(playlist.indexOf(new Cancion("thank you, my twilight", "the pillows")));
        System.out.println(playlist.lastIndexOf(new Cancion("thank you, my twilight", "the pillows")));

        {
            List<Cancion> playlistCopia = new ArrayList<>(playlist);
            System.out.println("\nSon iguales playlist y su copia? " + playlist.equals(playlistCopia));
            playlistCopia.remove(0);
            System.out.println("Son iguales playlist y su copia despues de modificar? " + playlist.equals(playlistCopia));
        }

        System.out.println("\nOrdenar lista por titulo (natural)");
        Collections.sort(playlist);
        mostrarColeccion(playlist);

        Set<Cancion> playlistHashSet = new HashSet<>(playlist);
        Set<Cancion> playlistLinkedHashSet = new LinkedHashSet<>(playlist);
        Set<Cancion> playlistTreeSet = new TreeSet<>(playlist);

        System.out.println("\n** HashSet **");
        mostrarColeccion(playlistHashSet);
        System.out.println("\n** LinkedHashSet **");
        mostrarColeccion(playlistLinkedHashSet);
        System.out.println("\n** TreeSet **");
        mostrarColeccion(playlistTreeSet);
    }

    static void mostrarColeccion(Collection lista) {
        System.out.println(lista.size() + " elementos en la lista");
        int index = 0;
        for (Object object : lista) {
            System.out.println(++index + ". " + object);
        }
    }
}
