/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_gestvehiculos;

/**
 *
 * @author algupl336
 */
public class Auto extends Vehiculo {
    int numeroPuertas;

    public Auto(String marca, String modelo, int year, int numeroPuertas) {
        super(marca, modelo, year);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public double calcularImpuesto() {
        return year * 0.05 * 100;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Numero de puertas: " + numeroPuertas;
    }
}
