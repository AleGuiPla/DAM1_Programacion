/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

/**
 *
 * @author alex
 */
public class Biblioteca {

    private List<Material> materiales;
    private Set<Usuario> usuarios;
    private Map<String, Material> mapaMateriales;

    public Biblioteca() {
        materiales = new ArrayList<>();
        usuarios = new HashSet<>();
        mapaMateriales = new HashMap<>();
    }
    
    

    public void agregarMaterial(Material material) {
        materiales.add(material);
        mapaMateriales.put(material.getId(), material);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Material buscarMaterialPorId(String id) {
        return mapaMateriales.get(id);
    }

    public boolean prestarMaterial(String idMaterial, Usuario usuario) {
        Material material = buscarMaterialPorId(idMaterial);

        if (!(material instanceof Prestable)) {
            return false;
        }

        Prestable prestable = (Prestable) material;

        if (prestable.estaPrestado()) {
            return false;
        }

        prestable.prestar();
        usuario.tomarMaterial(material);

        return true;
    }

    public boolean devolverMaterial(String idMaterial, Usuario usuario) {
        Material material = buscarMaterialPorId(idMaterial);

        if (!(material instanceof Prestable)) {
            return false;
        }

        Prestable prestable = (Prestable) material;

        if (!prestable.estaPrestado()) {
            return false;
        }

        prestable.devolver();
        usuario.devolverMaterial(material);

        return true;
    }
}
