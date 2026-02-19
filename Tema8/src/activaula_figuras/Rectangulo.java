/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_figuras;

/**
 *
 * @author algupl336
 */
public class Rectangulo extends Forma {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color) {
        super(color.toLowerCase());
        this.base = comprobarDouble(base);
        this.altura = comprobarDouble(altura);
    }

    @Override
    double calcularArea() {
        return base * altura;
    }

    @Override
    double calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }

    @Override
    void mostrarTipo() {
        System.out.println("Soy un rectangulo de color " + color + " muy cuadriculado bip bop bop bip");
    }

    @Override
    public String toString() {
        return "Rectangulo de color " + color + " area " + calcularArea() + " y perimetro " + calcularPerimetro();
    }
}
