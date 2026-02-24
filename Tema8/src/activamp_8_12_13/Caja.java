/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activamp_8_12_13;

import java.util.Locale;

/**
 *
 * @author algupl336
 */
public class Caja {

    public enum Unidad {
        CM, M
    };

    private final double ancho, alto, fondo;

    private String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        if (unidad == Unidad.CM) {
            this.ancho = ancho / 100.0;
            this.alto = alto / 100.0;
            this.fondo = fondo / 100.0;
        } else {
            this.ancho = ancho;
            this.alto = alto;
            this.fondo = fondo;
        }

    }

    public double getVolumen() {
        return ancho * alto * fondo;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() > 30) {
            etiqueta = etiqueta.substring(0, 30);
            System.out.printf("La etiqueta no puede tener más de 30 caracteres. Truncado a %s%n", etiqueta);
        }

        this.etiqueta = etiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    protected double getAncho() {
        return ancho;
    }

    protected double getAlto() {
        return alto;
    }

    protected double getFondo() {
        return fondo;
    }

    @Override
    public String toString() {
        // Locale puesto en US para que el separador de los decimales sea un . en lugar de una ,
        return String.format(Locale.ENGLISH, "Caja[ancho=%.1fm, alto=%.1fm, fondo=%.1fm, etiqueta=\"%s\"]", ancho, alto, fondo, etiqueta);
    }
}
