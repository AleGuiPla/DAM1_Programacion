/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activamp_8_12_13;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        // Ejer 12
        Caja caja1 = new Caja(1, 2, 2, Caja.Unidad.M);
        caja1.setEtiqueta("EsteEsUnTextoQueMide35Letras..EstoDesaparece");
        System.out.println("Volumen Caja1: " + caja1.getVolumen());
        System.out.println(caja1);

        System.out.println("----------");

        // Ejer 13
        CajaCarton caja2 = new CajaCarton(100, 80, 50);
        CajaCarton caja3 = new CajaCarton(500, 500, 500);

        caja2.setEtiqueta("Caja de carton");
        System.out.println("Volumen Caja2: " + caja2.getVolumen());
        System.out.println("Superficie Caja2: " + caja2.getSuperficie());
        System.out.println(caja2);
        System.out.println(caja3);
        
        System.out.println(caja2.getSuperficieTotal());

    }
}
