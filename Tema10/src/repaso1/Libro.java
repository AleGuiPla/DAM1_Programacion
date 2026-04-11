/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1;

/**
 *
 * @author alex
 */
public class Libro extends Material implements Prestable {

    private String autor;
    private int numeroPaginas;
    private boolean prestado;

    public Libro(String id, String titulo, String autor, int numeroPaginas) {
        super(id, titulo);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        prestado = false;
    }

    @Override
    public TipoMaterial getTipo() {
        return TipoMaterial.LIBRO;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
        }
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

}
