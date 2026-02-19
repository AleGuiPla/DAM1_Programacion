/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_figuras;

/**
 *
 * @author algupl336
 */
public class Circulo extends Forma {

    private double radio;

    public Circulo(double radio, String color) {
        super(color.toLowerCase());
        this.radio = comprobarDouble(radio);
    }

    @Override
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    double calcularPerimetro() {
        return Math.PI * 2 * radio;
    }

    @Override
    void mostrarTipo() {
        System.out.println("Soy un circulito de color " + color + " y muy redondito mmmmmm que gordito estoy");
    }

    @Override
    public String toString() {
        return "Circulo de color " + color + " area " + calcularArea() + " y perimetro " + calcularPerimetro();
    }
}
