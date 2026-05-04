/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso2.clases;

import java.util.Objects;

/**
 *
 * @author algupl336
 */
public class Videojuego implements Comparable<Videojuego> {

    private int codigo;
    private String titulo;
    private double puntuacion;
    private String genero;

    public Videojuego(int codigo, String titulo) {
        this(codigo, titulo, -1.0f, "DESCONOCIDO");
    }
    
    public Videojuego(int codigo, String titulo, double puntuacion) {
        this(codigo, titulo, puntuacion, "DESCONOCIDO");
    }
    
    public Videojuego(int codigo, String titulo, String genero) {
        this(codigo, titulo, -1.0f, genero);
    }

    public Videojuego(int codigo, String titulo, double puntuacion, String genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.puntuacion = puntuacion;
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void incrementarPuntuacion(double valor) {
        this.puntuacion += valor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Videojuego other = (Videojuego) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public int compareTo(Videojuego v) {
        return this.codigo - v.codigo;
    }

    @Override
    public String toString() {
        return "CODIGO=" + codigo + " TITULO=" + titulo + " PUNTUACION=" + puntuacion + " GENERO=" + genero;
    }
}
