/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_8_3;

/**
 *
 * @author alex
 */
public class Hora {

    protected int hora, minuto;

    public Hora(int hora, int minuto) {
        if (!setHora(hora)) {
            this.hora = 0;
        }
        if (!setMinuto(minuto)) {
            this.minuto = 0;
        }
    }

    void inc() {
        minuto += 1;
        if (minuto > 59) {
            minuto = 0;
            hora += 1;
            if (hora > 23) {
                hora = 0;
            }
        }
    }

    boolean setMinuto(int m) {
        boolean valido = m >= 0 && m < 60;
        if (valido) {
            this.minuto = m;
        }
        return valido;
    }
    
    boolean setHora(int h) {
        boolean valido = h >= 0 && h < 24;
        if (valido) {
            this.hora = h;
        }
        return valido;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
    }
}
