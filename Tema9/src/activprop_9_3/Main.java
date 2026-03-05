/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activprop_9_3;

/**
 *
 * @author algupl336
 */
public class Main {
    public static void main(String[] args) {
        Socio soc1 = new Socio(0, "Alejandro", "17-10-2007");
        Socio soc2 = new Socio(1, "John", "10-02-1999");
        Socio soc3 = new Socio(2, "Pepe", "16-04-1987");
        
        System.out.println(soc1.compareTo(soc2));
        System.out.println(soc3.compareTo(soc1));
        System.out.println(soc2.compareTo(soc2) + "\n");
        
        System.out.println(soc1);
        System.out.println(soc2);
        System.out.println(soc3);
    }
}
