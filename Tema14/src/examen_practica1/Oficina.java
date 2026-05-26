/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_practica1;

/**
 *
 * @author alex
 */
public class Oficina {

    private int num;
    private String ciudad;
    private int superficie;
    private double ventas;

    public Oficina(int num, String ciudad, int superficie, double ventas) {
        this.num = num;
        this.ciudad = ciudad.substring(0, Math.min(30, ciudad.length()));
        this.superficie = superficie;
        this.ventas = ventas;
    }

    public int getNum() {
        return num;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getSuperficie() {
        return superficie;
    }

    public double getVentas() {
        return ventas;
    }

    @Override
    public String toString() {
        return "Oficina{" + "num=" + num + ", ciudad=" + ciudad + ", superficie=" + superficie + ", ventas=" + ventas + '}';
    }
}
