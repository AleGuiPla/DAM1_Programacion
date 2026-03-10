/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_gestvehiculos;

import java.util.Comparator;

/**
 *
 * @author algupl336
 */
public class ComparadorMarca implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Vehiculo) o1).marca.compareTo(((Vehiculo) o2).marca);
    }
}
