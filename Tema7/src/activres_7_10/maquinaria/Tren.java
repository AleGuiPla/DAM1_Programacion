/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_7_10.maquinaria;

import activres_7_10.personal.Maquinista;
import activres_7_10.personal.Mecanico;

/**
 *
 * @author algupl336
 */
public class Tren {

    private Locomotora locomotora;
    private Vagon[] vagones;
    private Maquinista maquinista;
    private int numVagones;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        
        vagones = new Vagon[5];
        numVagones = 0;
    }
    
    public void engancharVagon(int cargaMax, int cargaAct, String mercancia) {
        if (numVagones >= 5) {
            System.out.println("No se pueden encganchar más vagones");
        } else {
            Vagon v = new Vagon(numVagones, cargaMax, cargaAct, mercancia);
            vagones[numVagones] = v;
            numVagones++;
        }
    }
}
