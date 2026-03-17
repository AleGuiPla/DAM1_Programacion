/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_filtradoclientes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {
        Collection<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("1", "Joseph", 19));
        clientes.add(new Cliente("1", "Jhonny", 17));
        clientes.add(new Cliente("1", "Jonathan", 14));
        clientes.add(new Cliente("1", "Jolyne", 18));

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        Iterator<Cliente> it = clientes.iterator();

        while (it.hasNext()) {
            if (it.next().edad < 18) {
                it.remove();
            }
        }

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
