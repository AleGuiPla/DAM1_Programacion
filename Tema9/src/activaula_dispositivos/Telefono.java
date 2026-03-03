/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_dispositivos;

/**
 *
 * @author algupl336
 */
public class Telefono implements Dispositivo {

    @Override
    public void encender() {
        System.out.println("Telefono encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Telefono apagada");
    }

    @Override
    public void reiniciar() {
        System.out.println("Telefono reiniciado");
    }
}
