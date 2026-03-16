/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_calculadora;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Calculadora<Integer> calcInt = new Calculadora<Integer>();
        Calculadora<Double> calcDouble = new Calculadora<Double>();

        System.out.println(calcInt.sumar(1, 2));
        System.out.println(calcInt.restar(5, 3));
        System.out.println(calcInt.multiplicar(4, 2));
        System.out.println(calcInt.dividir(10, 2));
        
        System.out.println(calcDouble.sumar(10.2, 9.8));
        System.out.println(calcDouble.restar(3.5, 2.2));
        System.out.println(calcDouble.multiplicar(1.5, 4.0));
        System.out.println(calcDouble.dividir(5.5, 2.0));

    }
}
