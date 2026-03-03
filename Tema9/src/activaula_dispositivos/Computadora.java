/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_dispositivos;

/**
 *
 * @author algupl336
 */
public class Computadora implements Dispositivo {

    @Override
    public void encender() {
        System.out.println("Computadora encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Computadora apagada");
    }

    @Override
    public void reiniciar() {
        System.out.println("Computadora reiniciada");
    }
}
