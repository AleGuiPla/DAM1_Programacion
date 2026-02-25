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

    private int numeroPuertas;

    public Auto(Propietario propietario, String marca, String modelo, int year, int numeroPuertas) {
        super(propietario, marca, modelo, year);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularImpuesto() {
        return getYear() * 0.05 * 100;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAuto{" + "numeroPuertas=" + numeroPuertas + ", impuestos=" + calcularImpuesto() + '}';
    }

    
}
