/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_7_10.maquinaria;

import activres_7_10.personal.Mecanico;

/**
 *
 * @author algupl336
 */
public class Locomotora {

    private String matricula;
    private int potenciaMotor;
    private int yearFabricacion;
    private Mecanico encargadoMantenimiento;

    public Locomotora(String matricula, int potenciaMotor, int yearFabricacion, Mecanico encargadoMantenimiento) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.yearFabricacion = yearFabricacion;
        this.encargadoMantenimiento = encargadoMantenimiento;
    }
}
