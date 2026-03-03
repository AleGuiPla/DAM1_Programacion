/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_interfherencia;

/**
 *
 * @author algupl336
 */
public class VehiculoAnfibio implements Anfibio {

    private Modo modo;

    public VehiculoAnfibio(Modo modo) {
        this.modo = modo;
    }

    @Override
    public void arrancar() {
        if (modo != Modo.TIERRA) {
            System.out.println("El vehículo no está en el modo correcto");
        } else {
            System.out.println("Vehiculo anfibio arrancado");
        }
    }
    
    @Override
    public void flotar() {
        if (modo != Modo.AGUA) {
            System.out.println("El vehículo no está en el modo correcto");
        } else {
            System.out.println("Vehiculo anfibio flotando");
        }
    }

    @Override
    public void cambiarModo(Modo m) {
        modo = m;
        System.out.println("Vehiculo cambiado a modo " + m.name());
    }

}
