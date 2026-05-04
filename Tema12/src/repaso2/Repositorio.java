/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso2;

import java.util.Collection;

/**
 *
 * @author alex
 * @param <T>
 */
public class Repositorio<T> {

    private Collection<T> datos;

    public Repositorio(Collection<T> coleccion) {
        this.datos = coleccion;
    }

    public void guardar(T elemento) {
        datos.add(elemento);
    }

    public void eliminar(T elemento) {
        datos.remove(elemento);
    }

    public Collection<T> listar() {
        return datos;
    }
}
 