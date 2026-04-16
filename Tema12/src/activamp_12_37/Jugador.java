/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activamp_12_37;

/**
 *
 * @author algupl336
 */
public class Jugador {

    private String dni;
    private String nombre;
    private int estatura;
    private PosicionCampo posicion;

    public Jugador(String dni, String nombre, int estatura, PosicionCampo posicion) {
        this.dni = dni;
        this.nombre = nombre;
        this.estatura = estatura;
        this.posicion = posicion;
    }

    public String getDni() {
        return dni;
    }

    public PosicionCampo getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "DNI=" + dni + " Nombre=" + nombre + " Estatura=" + estatura + " Posicion=" + posicion.toString();
    }
    
    
}
