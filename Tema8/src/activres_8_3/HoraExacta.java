/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_8_3;

/**
 *
 * @author alex
 */
public class HoraExacta extends Hora {

    protected int segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        if (!setSegundo(segundo)) {
            this.segundo = 0;
        }
    }

    boolean setSegundo(int s) {
        boolean valido = s >= 0 && s < 60;
        if (valido) {
            this.segundo = s;
        }
        return valido;
    }

    @Override
    void inc() {
        segundo += 1;
        if (segundo > 59) {
            segundo = 0;
            minuto += 1;
            if (minuto > 59) {
                minuto = 0;
                hora += 1;
                if (hora > 23) {
                    hora = 0;
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    @Override
    public boolean equals(Object obj) {
        HoraExacta otroReloj = (HoraExacta) obj;

        if (otroReloj.hora == this.hora
                && otroReloj.minuto == this.minuto
                && otroReloj.segundo == this.segundo) {
            return true;
        }

        return false;
    }
}
