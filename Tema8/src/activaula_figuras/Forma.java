/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_figuras;

/**
 *
 * @author algupl336
 */
public abstract class Forma {

    protected String color;

    public Forma(String color) {
        this.color = color;
    }

    protected double comprobarDouble(double d) {
        boolean valido = d > 0;
        if (!valido) {
            System.out.printf("Valor introducido en %s invalido. Establecido a 1%n", getClass());
        }
        return d > 0 ? d : 1;
    }

    abstract double calcularArea();

    abstract double calcularPerimetro();

    abstract void mostrarTipo();
}
