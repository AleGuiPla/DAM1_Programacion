/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Usuario {

    private String id;
    private String nombre;
    private List<Material> materialesPrestados;

    public Usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        materialesPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Material> getMaterialesPrestados() {
        return materialesPrestados;
    }

    public void tomarMaterial(Material material) {
        materialesPrestados.add(material);
    }

    public void devolverMaterial(Material material) {
        materialesPrestados.remove(material);
    }
    
    
}
