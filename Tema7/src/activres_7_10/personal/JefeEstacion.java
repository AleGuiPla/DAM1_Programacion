/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_7_10.personal;

import java.time.LocalDateTime;

/**
 *
 * @author algupl336
 */
public class JefeEstacion {

    private String nombre;
    private String dni;
    private LocalDateTime nombramiento;

    public JefeEstacion(String nombre, String dni, LocalDateTime nombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.nombramiento = nombramiento;
    }
}
