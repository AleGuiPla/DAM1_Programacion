package activfinal_tema11;

import java.time.LocalDate;
import java.util.TreeSet;

public class Socio implements Comparable<Socio> {
    
    private static int cantidadSocios = 0;
    
    private int numeroSocio;
    private String nombre;
    private LocalDate fechaAlta;
    private String direccionCorreo;
    private TreeSet<Familiar> familiares;
    
    public Socio(String nombre, LocalDate fechaAlta, String direccionCorreo, TreeSet<Familiar> familiares) {
        this.numeroSocio = ++cantidadSocios;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.direccionCorreo = direccionCorreo;
        this.familiares = familiares;
    }

    @Override
    public int compareTo(Socio o) {
        return nombre.compareTo(o.nombre);
    }
   
    @Override
    public String toString() {
        return "Socio{" + "numeroSocio=" + numeroSocio + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + ", direccionCorreo=" + direccionCorreo + ", familiares=" + familiares + '}';
    }
}
