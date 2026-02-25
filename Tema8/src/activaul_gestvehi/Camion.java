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

    protected int capacidadCarga; // En toneladas (T)

    public Camion(Propietario propietario, String marca, String modelo, int year, int capacidadCarga) {
        super(propietario, marca, modelo, year);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularImpuesto() {
        return getYear() * 0.1 * 200;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCamion{" + "capacidadCarga=" + capacidadCarga +  ", impuestos=" + calcularImpuesto() + '}';
    }

    
}
