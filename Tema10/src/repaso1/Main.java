/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1;

/**
 *
 * @author alex
 */
public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("MAT001", "Aprendiendo Java", "John Pork", 300);
        Revista revista1 = new Revista("MAT002", "Javalenlenlen Daily", 1);
        Usuario usuario1 = new Usuario("U001", "Carlos");

        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarMaterial(revista1);
        biblioteca.agregarMaterial(libro1);

        System.out.println("Intentar prestar " + libro1.getTitulo() + " a " + usuario1.getNombre() + ": " + biblioteca.prestarMaterial(libro1.getId(), usuario1));
        System.out.println("Intentar prestar " + revista1.getTitulo() + " a " + usuario1.getNombre() + ": " + biblioteca.prestarMaterial(revista1.getId(), usuario1));
        System.out.println("Materiales prestados de " + usuario1.getNombre() + ": " + usuario1.getMaterialesPrestados());

        System.out.println("Intentar devolver " + libro1.getTitulo() + " a " + usuario1.getNombre() + ": " + biblioteca.devolverMaterial(libro1.getId(), usuario1));
        System.out.println("Materiales prestados de " + usuario1.getNombre() + ": " + usuario1.getMaterialesPrestados());
    }
}
