/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso2;

/**
 *
 * @author alex
 */
public class Jugador implements Comparable<Jugador> {

    private int id;
    private String nombre;
    private String nickname;
    private int puntucacionTotal;

    public Jugador(int id, String nombre, String nickname, int puntucacionTotal) {
        this.id = id;
        this.nombre = nombre;
        this.nickname = nickname;
        this.puntucacionTotal = puntucacionTotal;
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntucacionTotal() {
        return puntucacionTotal;
    }

    @Override
    public int compareTo(Jugador o) {
        return o.puntucacionTotal - puntucacionTotal;
    }
}
