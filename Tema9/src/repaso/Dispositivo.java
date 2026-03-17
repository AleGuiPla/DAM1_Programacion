/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author alex
 */
public abstract class Dispositivo implements Impuestos, Comparable {

    private final String marca;
    private final String modelo;
    private int precio;
    private boolean encendido;

    public Dispositivo(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
        encendido = true;
        System.out.println("Dispositivo encendido");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Dispositivo apagado");
    }

    public abstract void usar();

    @Override
    public abstract float calcularImpuestos();

    @Override
    public int compareTo(Object obj) {
        int comparacion;

        if (precio > ((Dispositivo) obj).precio) {
            comparacion = 1;
        } else if (precio < ((Dispositivo) obj).precio) {
            comparacion = -1;
        } else {
            comparacion = 0;
        }

        return comparacion != 0 ? comparacion : new ComparadorMarca().compare(this, obj);
    }
    
    
    @Override
    public String toString() {
        return "Marca=" + getMarca() + ", Modelo=" + getModelo() + ", Precio=" + getPrecio() + "€";
    }
}
