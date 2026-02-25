/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaul_gestvehi;

/**
 *
 * @author algupl336
 */
public class Propietario {

    private String nombre, apellido, dni, direccion;

    public Propietario(String nombre, String apellido, String dni, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion + '}';
    }
}
