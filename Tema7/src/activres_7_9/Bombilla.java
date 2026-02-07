/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_7_9;

/**
 *
 * @author alex
 */
public class Bombilla {

    public static boolean interruptorGeneral = true;

    private boolean interruptor;

    public Bombilla() {
        interruptor = false;
    }

    public void encender() {
        interruptor = true;
    }

    public void apagar() {
        interruptor = false;
    }

    public String mostrarEstado() {
        return estado() ? "Encendido" : "Apagado";
    }

    private boolean estado() {
        return interruptorGeneral && interruptor;
    }
}
