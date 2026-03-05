/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activprop_9_5;

import java.util.Comparator;

/**
 *
 * @author algupl336
 */
public class ComparadorNombre implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        return ((Socio)obj1).nombre.compareTo(((Socio)obj2).nombre);
    }
}
