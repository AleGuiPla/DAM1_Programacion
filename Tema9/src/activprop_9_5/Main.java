/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activprop_9_5;

import java.util.Arrays;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Socio soc1 = new Socio(0, "Godofredo", "17-07-2002");
        Socio soc2 = new Socio(1, "Alejandro", "10-02-1999");
        Socio soc3 = new Socio(2, "Domingo", "16-04-1987");

        Socio[] socios = {soc1, soc2, soc3};

        System.out.println(soc1.compareTo(soc2));
        System.out.println(soc3.compareTo(soc1));
        System.out.println(soc2.compareTo(soc2) + "\n");

        Arrays.sort(socios, new ComparadorNombre());
        
        System.out.println(Arrays.toString(socios));
    }
}
