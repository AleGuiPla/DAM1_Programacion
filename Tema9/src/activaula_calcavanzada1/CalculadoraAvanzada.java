/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_calcavanzada1;

/**
 *
 * @author algupl336
 */
public class CalculadoraAvanzada extends CalculadoraSimple {

    public int modulo(int a, int b) {
        return b == 0 ? 0 : a % b;
    }

    public double potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
