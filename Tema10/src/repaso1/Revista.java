/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1;

/**
 *
 * @author alex
 */
public class Revista extends Material {

    private int numeroEdicion;

    public Revista(String id, String titulo, int numeroEdicion) {
        super(id, titulo);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public TipoMaterial getTipo() {
        return TipoMaterial.REVISTA;
    }
}
