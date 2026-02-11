/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_7_10;

import activres_7_10.maquinaria.*;
import activres_7_10.personal.*;
import java.time.LocalDateTime;

/**
 *
 * @author algupl336
 */
public class ActivRes_7_10 {
    public static void main(String[] args) {
        Mecanico mecanico1 = new Mecanico("Juan", "696444222", Mecanico.Especialidad.FRENOS);
        Maquinista maquinista1 = new Maquinista("Alejandro", "02789452X", 3000.5, "Lider");
        JefeEstacion jefeEstacion = new JefeEstacion("Ivan", "026589891P", LocalDateTime.now());

        Locomotora locomotora1 = new Locomotora("AG-001", 50, 2004, mecanico1);
        Tren tren1 = new Tren(locomotora1, maquinista1);
    }
}
