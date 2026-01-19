/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaul_1;

/**
 *
 * @author alex
 */
public class ActivAul_1 {

    public static void main(String[] args) {
        JugadorCanicas j1 = new JugadorCanicas("Diana");
        JugadorCanicas j2 = new JugadorCanicas("Alejandro");

        j1.mirarCanicas();
        j2.mirarCanicas();

        j1.agregarCanicas(10);
        j1.mirarCanicas();
        j2.mirarCanicas();

        j2.quitarCanicas(4);
        j1.mirarCanicas();
        j2.mirarCanicas();
    }
}
