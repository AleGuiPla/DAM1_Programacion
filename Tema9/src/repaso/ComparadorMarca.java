/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import java.util.Comparator;

/**
 *
 * @author alex
 */
public class ComparadorMarca implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Dispositivo d1 = (Dispositivo) o1;
        Dispositivo d2 = (Dispositivo) o2;

        return d1.getMarca().compareTo(d2.getMarca());
    }

}
