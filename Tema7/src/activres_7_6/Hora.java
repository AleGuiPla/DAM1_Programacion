package activres_7_6;

/**
 *
 * @author algupl336
 */
public class Hora {

    private byte hora;
    private byte minuto;
    private byte segundo;

    public byte getHora() {
        return hora;
    }

    public void setHora(byte hora) {
        this.hora = valorSeguro(hora, (byte) 24);
    }

    public byte getMinuto() {
        return minuto;
    }

    public void setMinuto(byte minuto) {
        this.minuto = valorSeguro(minuto, (byte) 60);
    }

    public byte getSegundo() {
        return segundo;
    }

    public void setSegundo(byte segundo) {
        this.segundo = valorSeguro(segundo, (byte) 60);
    }

    void incrementaSegundo() {
        segundo += 1;

        if (segundo == 60) {
            segundo = 0;
            minuto += 1;
            if (minuto == 60) {
                minuto = 0;
                hora += 1;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }

    String obtenerHora() {
        return (hora > 10 ? hora : "0" + hora) + ":" +
                (minuto > 10 ? minuto : "0" + minuto) + ":" +
                (segundo > 10 ? segundo : "0" + segundo);
    }

    private byte valorSeguro(byte valor, byte max) {
        if (valor < 0 || valor > max) {
            valor = 0;
        }
        return valor;
    }
}
