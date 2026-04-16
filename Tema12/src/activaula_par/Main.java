/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_par;

/**
 *
 * @author algupl336
 */
public class Main {
    public static void main(String[] args) {
        Par<String, Double> par1 = new Par<String, Double>("Six", 7.0);
        
        System.out.println(par1.getT() + " " + par1.getU());
        
        par1.setT("Eight");
        par1.setU(9.0);
        
        System.out.println(par1);
    }
}
