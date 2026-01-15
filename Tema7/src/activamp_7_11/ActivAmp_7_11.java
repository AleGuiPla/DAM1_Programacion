/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activamp_7_11;

/**
 *
 * @author algupl336
 */
public class ActivAmp_7_11 {
    public static void main(String[] args) {
        MarcaPagina marcaPagina = new MarcaPagina(100);
        
        System.out.println(marcaPagina.getUltimaPagina());
        
        marcaPagina.empezarLibro();
        marcaPagina.setUltimaPagina(300);
        marcaPagina.incrementarPagina();
        
        System.out.println(marcaPagina.getUltimaPagina());
        
        marcaPagina.empezarLibro();
        
        System.out.println(marcaPagina.getUltimaPagina());
    }
}
