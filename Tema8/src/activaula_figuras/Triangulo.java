/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_figuras;

/**
 *
 * @author algupl336
 */
public class Triangulo extends Forma {

    private double base;
    private double altura;

    public Triangulo(double base, double altura, String color) {
        super(color.toLowerCase());
        this.base = comprobarDouble(base);
        this.altura = comprobarDouble(altura);
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    double calcularPerimetro() {
        double l = Math.sqrt(Math.pow(altura, 2) + Math.pow((base / 2), 2));
        return 2 * l + base;
    }

    @Override
    void mostrarTipo() {
        System.out.println("Soy un triangulo de color " + color + " y soy el más cool");
    }

    @Override
    public String toString() {
        return "Triangulo de color " + color + " area " + calcularArea() + " y perimetro " + calcularPerimetro();
    }
}
