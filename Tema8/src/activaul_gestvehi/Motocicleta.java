/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaul_gestvehi;

/**
 *
 * @author algupl336
 */
public class Motocicleta extends Vehiculo {

    private int cilindrada; // Almacenada en caballos (cc)

    public Motocicleta(Propietario propietario, String marca, String modelo, int year, int cilindrada) {
        super(propietario, marca, modelo, year);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularImpuesto() {
        return getYear() * 0.03 * 50;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMotocicleta{" + "cilindrada=" + cilindrada + ", impuestos=" + calcularImpuesto() + '}';
    }

}
