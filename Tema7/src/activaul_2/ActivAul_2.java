/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaul_2;

/**
 *
 * @author alex
 */
public class ActivAul_2 {

    public static void main(String[] args) {
        Tienda tiendaArganda = new Tienda("ARGANDA");
        Tienda tiendaCoslada = new Tienda("COSLADA");

        generarVentas(new Tienda[]{tiendaArganda, tiendaCoslada});

        tiendaArganda.consultarVentasParciales();
        tiendaCoslada.consultarVentasParciales();

        Tienda.consultarVentasTotales();
    }

    private static void generarVentas(Tienda[] tiendas) {
        for (Tienda tienda : tiendas) {
            int cantVentas = (int) (Math.random() * (6 - 1)) + 1;
            for (int i = 0; i < cantVentas; i++) {
                int producto = (int) (Math.random() * 3);
                switch (producto) {
                    case 0 ->
                        tienda.comprarChicle();
                    case 1 ->
                        tienda.comprarCocaCola();
                    case 2 ->
                        tienda.comprarDonut();
                }
            }
        }
    }
}
