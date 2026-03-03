/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_dispositivos;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Telefono t1 = new Telefono();
        Computadora c1 = new Computadora();

        t1.encender();
        t1.reiniciar();
        t1.apagar();

        c1.encender();
        c1.reiniciar();
        c1.apagar();
    }
}
