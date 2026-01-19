/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_7_8;

/**
 *
 * @author alex
 */
public class ActivRes_7_8 {

    public static void main(String[] args) {
        SintonizadorFM s1 = new SintonizadorFM(109);
        SintonizadorFM s2 = new SintonizadorFM();

        System.out.println("s1 y s2");
        s1.display();
        s2.display();

        System.out.println("s1 prueba");
        s1.display();
        s1.up();
        s1.display();

        System.out.println("s2 prueba");
        s2.display();
        s2.down();
        s2.down();
        s2.display();
    }
}
