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
public class CajaCarton extends Caja {

    private static double superficieTotal;
    private double superficie;

    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.CM);

        superficie = 2 * (ancho * alto + ancho * fondo + fondo * alto);
        superficieTotal += superficie;
    }

    public static double getSuperficieTotal() {
        return superficieTotal;
    }

    public double getSuperficie() {
        return superficie;
    }

    @Override
    public double getVolumen() {
        return super.getVolumen() * 0.8;
    }

    @Override
    public String toString() {
        // Locale puesto en US para que el separador de los decimales sea un . en lugar de una ,
        return String.format(Locale.ENGLISH, "Caja[ancho=%.1fcm, alto=%.1fcm, fondo=%.1fcm, etiqueta=\"%s\"]", getAncho() * 100.0, getAlto() * 100.0, getFondo() * 100.0, getEtiqueta());
    }
}
