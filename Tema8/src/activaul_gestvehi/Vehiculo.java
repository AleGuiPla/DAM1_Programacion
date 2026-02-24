/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaul_gestvehi;

/**
 *
 * @author alex
 */
public abstract class Vehiculo {
    protected String marca, modelo;
    protected int year;

    public Vehiculo(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }
    
    public abstract double calcularImpuesto();

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", year=" + year + '}';
    }
}
