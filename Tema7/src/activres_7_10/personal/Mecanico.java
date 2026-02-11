/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_7_10.personal;

/**
 *
 * @author algupl336
 */
public class Mecanico {

    public enum Especialidad {
        FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR
    };

    private String nombre;
    private String telefono;
    private Especialidad especialidad;

    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
}
