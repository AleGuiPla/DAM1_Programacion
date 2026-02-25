/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaul_gestvehi;

/**
 *
 * @author algupl336
 */
public class Concesionario {

    private final int MAX_VEHICULOS = 10;
    
    private String nombre, direccion;
    private Vehiculo[] vehiculos;
    private int cantidadVehiculos;

    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.vehiculos = new Vehiculo[MAX_VEHICULOS];
        this.cantidadVehiculos = 0;
    }
    
    public void agregarVehiculo(Vehiculo v) {
        if (cantidadVehiculos >= MAX_VEHICULOS) {
            System.out.println("No se pueden agregar mas vehiculos. Maximo " + MAX_VEHICULOS + " vehiculos");
        } else {
            vehiculos[cantidadVehiculos++] = v;
        }
    }
    
    public void listarVehiculos() {
        
    }

}
