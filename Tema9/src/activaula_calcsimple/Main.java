/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_calcsimple;

import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraSimple calcSimple = new CalculadoraSimple();
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calcSimple.sumar(a, b));
        System.out.println(calcSimple.restar(a, b));
        System.out.println(calcSimple.multiplicar(a, b));
        System.out.println(calcSimple.dividir(a, b));
    }
}
