/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaul_1;

/**
 *
 * @author alex
 */
public class JugadorCanicas {

    private static int bolsaCanicas;

    private String nombreJugador;

    public JugadorCanicas(String nombreJugador) {
        this.nombreJugador = nombreJugador.toUpperCase();
    }

    public void agregarCanicas(int cant) {
        bolsaCanicas += cant;
        System.out.println(nombreJugador + " HA COMPRADO " + cant + " CANICAS");
        System.out.println("__________");
    }

    public void quitarCanicas(int cant) {
        bolsaCanicas -= cant;
        System.out.println(nombreJugador + " HA PERDIDO " + cant + " CANICAS");
        System.out.println("__________");
    }

    public void mirarCanicas() {
        System.out.println(nombreJugador + " MIRA LA BOLSA Y VE " + bolsaCanicas + " CANICAS");
        System.out.println("__________");
    }
}
