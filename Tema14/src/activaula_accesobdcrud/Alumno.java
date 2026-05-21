package activaula_accesobdcrud;

import java.time.LocalDate;

public class Alumno {

    int id;
    String nombre;
    LocalDate fechaNac;
    double media;
    String curso;

    public Alumno(int id, String nombre, LocalDate fechaNac, double media, String curso) {
        this.id = id;
        this.nombre = nombre.length() > 30 ? nombre.substring(0, 30) : nombre;
        this.fechaNac = fechaNac;
        this.media = media;
        this.curso = curso.length() > 2 ? curso.substring(0, 2) : curso;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public double getMedia() {
        return media;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", media=" + media + ", curso=" + curso + '}';
    }
}
