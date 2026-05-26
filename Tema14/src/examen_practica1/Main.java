/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_practica1;

/**
 *
 * @author alex
 */
public class Main {

    public static void main(String[] args) {
        OficinaDAO oficinaDAO = new OficinaDAO();

        System.out.println(oficinaDAO.todasOficinas());
        System.out.println(oficinaDAO.todasOficinas(1000));
        System.out.println(oficinaDAO.buscar(22));
        oficinaDAO.desconectar();
    }
}
