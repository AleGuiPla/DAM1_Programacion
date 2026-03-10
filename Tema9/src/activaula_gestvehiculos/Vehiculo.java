/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_gestvehiculos;

/**
 *
 * @author algupl336
 */
public abstract class Vehiculo implements Impuestos, Comparable {

    String marca;
    String modelo;
    int year;

    public Vehiculo(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    @Override
    public int compareTo(Object obj) {
        int resultado = -(this.year - ((Vehiculo) obj).year);
        return resultado == 0 ? (new ComparadorMarca()).compare(this, obj) : resultado;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " Modelo: " + modelo + " Año: " + year;
    }
}
