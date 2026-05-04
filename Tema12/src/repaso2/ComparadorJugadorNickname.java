/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso2;

import java.util.Comparator;

/**
 *
 * @author alex
 */
public class ComparadorJugadorNickname implements Comparator<Jugador> {

    @Override
    public int compare(Jugador o1, Jugador o2) {
        return o1.getNickname().compareToIgnoreCase(o2.getNickname());
    }
    
}
