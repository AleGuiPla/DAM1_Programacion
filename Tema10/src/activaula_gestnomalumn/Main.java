/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_gestnomalumn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Collection<String> alumnos = new ArrayList<>();

        alumnos.add("Ana");
        alumnos.add("Luis");
        alumnos.add("Marta");
        alumnos.add("Carlos");
        alumnos.add("Ana");

        System.out.println("Mostrat tamaño/comprobar está vacía");
        System.out.println(alumnos.size());
        System.out.println(alumnos.isEmpty());

        System.out.println("Contiene a Marta/Pedro");
        System.out.println(alumnos.contains("Marta"));
        System.out.println(alumnos.contains("Pedro"));

        System.out.println(alumnos.remove("Luis") ? "Se ha eliminado a Luis" : "No se ha encontrado");

        System.out.println(alumnos.toString());
        for (String nombre : alumnos) {
            System.out.println(nombre);
        }

        /* 
            - Muestra el contenido de la colección utilizando un iterador y un bucle while
            - Crea el método eliminaAlumno que recibe un nombre de Alumno y elimina todos los elementos de la
              colección con ese nombre.
            - Vuelve a mostrar el contenido de la colección.
            - Finalmente elimina todos los elementos de la colección y muestra si la colección está vacía.
         */
        Iterator<String> it = alumnos.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        eliminaAlumno("Ana", alumnos);

        System.out.println(alumnos.toString());

        alumnos.clear();
        System.out.println(alumnos.isEmpty());
    }

    public static void eliminaAlumno(String s, Collection c) {
        Iterator<String> it = c.iterator();

        while (it.hasNext()) {
            if (it.next().equals(s)) {
                it.remove();
            }
        }
    }
}
