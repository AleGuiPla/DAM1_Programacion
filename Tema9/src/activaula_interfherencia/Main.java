/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_interfherencia;

/**
 *
 * @author algupl336
 */
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Lancha lancha1 = new Lancha();
        VehiculoAnfibio anfibio1 = new VehiculoAnfibio(Modo.TIERRA);
        
        coche1.arrancar();
        lancha1.flotar();
        
        anfibio1.flotar(); // error porque está en modo tierra
        anfibio1.arrancar();
        
        anfibio1.cambiarModo(Modo.AGUA);
        
        anfibio1.flotar();
        anfibio1.arrancar(); // error porque está en modo agua
                
    }
}
