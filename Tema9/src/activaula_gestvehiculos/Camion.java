/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_gestvehiculos;

/**
 *
 * @author algupl336
 */
public class Camion extends Vehiculo {
    int capacidadCarga;

    public Camion(String marca, String modelo, int year, int numeroPuertas) {
        super(marca, modelo, year);
        this.capacidadCarga = numeroPuertas;
    }
    
    @Override
    public double calcularImpuesto() {
        return year * 0.1 * 200;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Capacidad de carga: " + capacidadCarga;
    }
}
