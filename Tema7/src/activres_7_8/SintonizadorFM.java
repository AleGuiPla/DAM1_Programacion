/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_7_8;

/**
 *
 * @author alex
 */
public class SintonizadorFM {

    private float frecuencia;

    public SintonizadorFM(float frecuencia) {
        if (frecuencia < 80) {
            this.frecuencia = 80;
        } else if (frecuencia > 108) {
            this.frecuencia = 108;
        } else {
            this.frecuencia = frecuencia;
        }
    }

    public SintonizadorFM() {
        this(80);
    }

    public void up() {
        frecuencia += 0.5f;
        comprobarFrecuencia();
    }

    public void down() {
        frecuencia -= 0.5f;
        comprobarFrecuencia();
    }

    public void display() {
        System.out.println("Frecuencia actual: " + frecuencia);
    }

    private void comprobarFrecuencia() {
        if (frecuencia < 80) {
            frecuencia = 108;
        } else if (frecuencia > 108) {
            frecuencia = 80;
        }
    }
}
