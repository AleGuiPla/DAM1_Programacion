/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activresu_9_10;

import java.util.Comparator;

/**
 *
 * @author algupl336
 */
public class ComparadorEnteros implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        return -((Integer)obj1 - (Integer)obj2);
    }
}
