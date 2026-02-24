/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaul_gestvehi;

/**
 *
 * @author alex
 */
public class Auto extends Vehiculo {

    protected int numeroPuertas;

    public Auto(int numeroPuertas, String marca, String modelo, int year) {
        super(marca, modelo, year);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularImpuesto() {
        return year * 0.05 * 100;
    }
}
