/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_8_3;

/**
 *
 * @author alex
 */
public class Main {
    public static void main(String[] args) {
        // Actividad resuelta 8.1
        Hora h1 = new Hora(-25, 59);
        System.out.println(h1);
        h1.inc();
        System.out.println(h1);
        
        // 8.2
        HoraExacta h2 = new HoraExacta(23, 59, 58);
        h2.inc();
        h2.inc();
        System.out.println(h2);
        h2.setSegundo(90);
        h2.setMinuto(26);
        System.out.println(h2);
        
        // 8.3
        HoraExacta h3 = new HoraExacta(0, 26, 0);
        System.out.println(h2.equals(h3));
    }
}
