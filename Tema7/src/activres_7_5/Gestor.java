package activres_7_5;

public class Gestor {
    public String nombre;
    private String telefono;
    double importeMax;

    public Gestor(String nombre, String telefono, double importeMax) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMax = importeMax;
    }

    public Gestor(String nombre, String telefono) {
        this(nombre, telefono, 10000.0);
    }

    public String getTelefono() {
        return this.telefono;
    }
    
    void mostrarInformacion() {
        System.out.println("------------------------------");
        System.out.println("Nombre:\t\t" + this.nombre);
        System.out.println("Teléfono:\t" + this.telefono);
        System.out.println("Importe máximo:\t" + this.importeMax + "€");
        System.out.println("------------------------------");
    }
    
}
