/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activampl_9_13;

/**
 *
 * @author algupl336
 */
public class Futbolista implements Comparable {

    String nombre;
    int dni, edad, numeroGoles;

    public Futbolista(int dni, String nombre, int edad, int numeroGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", numeroGoles=" + numeroGoles + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() == obj.getClass()) {
            if (this.dni == ((Futbolista) obj).dni) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int compareTo(Object obj) {
        return dni - ((Futbolista)obj).dni;
    }
}
