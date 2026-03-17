/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author alex
 */
public class Movil extends Dispositivo {

    public Movil(String marca, String modelo, int precio) {
        super(marca, modelo, precio);
    }

    @Override
    public void usar() {
        if (isEncendido()) {
            System.out.println("Usando teléfono...");
        }
    }

    @Override
    public float calcularImpuestos() {
        return (float) getPrecio() * PORCENTAJE_INPUESTOS * 0.05f;
    }

    @Override
    public String toString() {
        return "Telefono: " + super.toString() + ", Impuestos=" + calcularImpuestos();
    }
}
