/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_7_9;

/**
 *
 * @author alex
 */
public class ActivRes_7_9 {

    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();

        b1.encender();
        b2.encender();

        System.out.println("Estado de B1: " + b1.mostrarEstado());
        System.out.println("Estado de B2: " + b2.mostrarEstado());

        System.out.println("Cortamos la luz general y la bombilla 2");
        Bombilla.interruptorGeneral = false;
        b2.apagar();

        System.out.println("Estado de B1: " + b1.mostrarEstado());
        System.out.println("Estado de B2: " + b2.mostrarEstado());

        System.out.println("Devolvemos la luz general");
        Bombilla.interruptorGeneral = true;

        System.out.println("Estado de B1: " + b1.mostrarEstado());
        System.out.println("Estado de B2: " + b2.mostrarEstado());

    }
}
