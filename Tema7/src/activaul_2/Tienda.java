/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaul_2;

/**
 *
 * @author alex
 */
public class Tienda {

    private static int ventasGlobalChicles, ventasGlobalColas, ventasGlobalDonuts;

    private final String direccion;
    private int ventasChicles, ventasColas, ventasDonuts;

    public Tienda(String direccion) {
        this.direccion = direccion;
    }

    public void comprarChicle() {
        ventasChicles += 1;
        ventasGlobalChicles += 1;
    }

    public void comprarCocaCola() {
        ventasColas += 1;
        ventasGlobalColas += 1;
    }

    public void comprarDonut() {
        ventasDonuts += 1;
        ventasGlobalDonuts += 1;
    }

    public void consultarVentasParciales() {
        System.out.println("---- Tienda de " + direccion + " ----");
        System.out.println("Chicles:\t" + ventasChicles);
        System.out.println("Coca-Colas:\t" + ventasColas);
        System.out.println("Donuts:\t\t" + ventasDonuts);
        System.out.println("---- Ventas locales ----\n");
    }

    public static void consultarVentasTotales() {
        System.out.println("---- Ventas entre todas las tiendas ----");
        System.out.println("Chicles:\t" + ventasGlobalChicles);
        System.out.println("Coca-Colas:\t" + ventasGlobalColas);
        System.out.println("Donuts:\t\t" + ventasGlobalDonuts);
        System.out.println("----\t\t----\n");
    }

}
