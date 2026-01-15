/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activamp_7_11;

/**
 *
 * @author algupl336
 */
public class MarcaPagina {
    int ultimaPagina;

    public MarcaPagina(int ultimaPagina) {
        this.ultimaPagina = ultimaPagina;
    }

    public int getUltimaPagina() {
        return ultimaPagina;
    }

    public void setUltimaPagina(int ultimaPagina) {
        this.ultimaPagina = ultimaPagina;
    }
    
    void empezarLibro() {
        ultimaPagina = 0;
    }
    
    void incrementarPagina() {
        ultimaPagina += 1;
    }
}
