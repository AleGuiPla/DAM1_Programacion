/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activfin_7_15;

/**
 *
 * @author algupl336
 */
public class ActivFin_7_15 {

    public static void main(String[] args) {
        Calendario c1 = new Calendario(2026, 1, 2);
        Calendario c2 = new Calendario(2025, 12, 32); // El calendario se crea como 1/12/2025

        c1.addDay();    // Pasa a 3/1/2026
        c2.addMonth();  // Pasa a 1/1/2026

        c1.show();
        c2.show();

        System.out.println(c1.iguales(c2));

        c2.addDay();
        c2.addDay();    // Al sumarse dos dias pasa a 3/1/2026

        c1.show();
        c2.show();

        System.out.println(c1.iguales(c2));
    }
}
