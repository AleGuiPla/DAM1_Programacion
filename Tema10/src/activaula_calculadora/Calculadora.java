/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_calculadora;

/**
 *
 * @author algupl336
 */
public class Calculadora<T extends Number> {

    public double sumar(T n1, T n2) {
       return n1.doubleValue() + n2.doubleValue();
    }
    
    public double restar(T n1, T n2) {
       return n1.doubleValue() - n2.doubleValue();
    }
    
    public double multiplicar(T n1, T n2) {
       return n1.doubleValue() * n2.doubleValue();
    }
    
    public double dividir(T n1, T n2) {
       return n1.doubleValue() / n2.doubleValue();
    }
}
