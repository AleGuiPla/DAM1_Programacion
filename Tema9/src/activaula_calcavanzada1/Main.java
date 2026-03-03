/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_calcavanzada1;

import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraAvanzada calcAvanz = new CalculadoraAvanzada();

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calcAvanz.sumar(a, b));
        System.out.println(calcAvanz.restar(a, b));
        System.out.println(calcAvanz.multiplicar(a, b));
        System.out.println(calcAvanz.dividir(a, b));

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(calcAvanz.modulo(a, b));
        System.out.println(calcAvanz.potencia(a, b));
    }
}
