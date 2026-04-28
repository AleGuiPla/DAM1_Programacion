/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_11_9;

import java.time.LocalDateTime;

/**
 *
 * @author algupl336
 */
public class Registro {

    private double temperatura;
    private LocalDateTime fecha;

    public Registro(double temperatura, LocalDateTime fecha) {
        this.temperatura = temperatura;
        this.fecha = fecha;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
}
