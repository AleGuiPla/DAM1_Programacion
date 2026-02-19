/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_figuras;

/**
 *
 * @author algupl336
 */
public class Main {
    public static void main(String[] args) {
        Forma formas[] = {new Circulo(10, "Blanco"), new Rectangulo(-1, 1, "Rojo"), new Triangulo(10, 8.66, "Azul")};
        
        for (Forma f : formas) {
            System.out.println(f);
        }
    }
}
