/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaul_gestvehi;

/**
 *
 * @author alex
 */
public class Camion extends Vehiculo {

    protected int capacidadCarga; // En toneladas

    public Camion(int capacidadCarga, String marca, String modelo, int year) {
        super(marca, modelo, year);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularImpuesto() {
        return year * 0.1 * 200;
    }
}
