/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actamp_7_12;

/**
 *
 * @author algupl336
 */
public class ActAmp_7_12 {

    public static void main(String[] args) {
        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(1, 2, 1);
        mostrarSolucion(ecuacion);
    }

    static void mostrarSolucion(EcuacionSegundoGrado ecuacion) {
        double[] solucion = ecuacion.solucion();

        if (Double.isNaN(solucion[0])) {
            System.out.println("No hay solucion");
        } else if(solucion[0] == solucion[1]) {
            System.out.println("Hay una sola solucion");
            System.out.println("Solucion = " + solucion[0]);
        } else {
            System.out.println("Hay dos soluciones");
            System.out.println("Solucion 1 = " + solucion[0]);
            System.out.println("Solucion 2 = " + solucion[1]);
        }
    }
}
