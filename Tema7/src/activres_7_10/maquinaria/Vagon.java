/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_7_10.maquinaria;

/**
 *
 * @author algupl336
 */
class Vagon {

    private int identificador;
    private int cargaMaxima;
    private int cargaActual;
    private String mercancia;

    public Vagon(int identificador, int cargaMaxima, int cargaActual, String mercancia) {
        this.identificador = identificador;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
    }
}
