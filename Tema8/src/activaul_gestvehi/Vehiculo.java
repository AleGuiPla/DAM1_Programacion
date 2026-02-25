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

    private Propietario propietario;
    private String marca, modelo;
    private int year;

    public Vehiculo(Propietario propietario, String marca, String modelo, int year) {
        this.propietario = propietario;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getYear() {
        return year;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public abstract double calcularImpuesto();

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", year=" + year + ", propietario=" + propietario.toString() + '}';
    }
}
