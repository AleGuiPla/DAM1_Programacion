/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso2;

import java.util.List;
import java.time.LocalDate;

/**
 *
 * @author alex
 */
public class Torneo {

    private int id;
    private String nombre;
    private List<Jugador> participantes;
    private LocalDate fecha;

    public Torneo(int id, String nombre, List<Jugador> participantes, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.participantes = participantes;
        this.fecha = fecha;
    }
}
