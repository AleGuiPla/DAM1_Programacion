package activaula_playlistavanzada;

import java.util.Objects;

public class Cancion implements Comparable<Cancion> {

    private String titulo;
    private String artista;
    private int lanzamiento;

    public Cancion(String titulo) {
        this(titulo, 0);
    }

    public Cancion(String titulo, String artista) {
        this(titulo, artista, 0);
    }

    public Cancion(String titulo, int lanzamiento) {
        this(titulo, "Desconocido", lanzamiento);
    }

    public Cancion(String titulo, String artista, int lanzamiento) {
        this.titulo = titulo;
        this.artista = artista;
        this.lanzamiento = lanzamiento;
    }

    @Override
    public int compareTo(Cancion c) {
        return titulo.compareToIgnoreCase(c.titulo);
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
        final Cancion other = (Cancion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.artista, other.artista);
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Artista: " + artista + ", Año lanzamiento: " + lanzamiento;
    }
}
