package activres_7_5;

public class CuentaCorriente {

    static private String nombreBanco = "Banco Internacional de Diana";

    public String dni;
    String titular;
    private double saldo;
    Gestor gestorCuenta;

    public CuentaCorriente(String dni, String nombre, double saldo, Gestor gestor) {
        this.dni = dni;
        this.titular = nombre;
        this.saldo = saldo;
        this.gestorCuenta = gestor;
    }

    public CuentaCorriente(String dni, String nombre) {
        this(dni, nombre, 0.0, null);
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, "Sin asignar", saldo, null);
    }

    public CuentaCorriente(String dni, String nombre, Gestor gestor) {
        this(dni, nombre, 0.0, gestor);
    }

    static void setNombreBanco(String nombre) {
        nombreBanco = nombre;
    }

    static String getNombreBanco() {
        return nombreBanco;
    }

    public void setGestorCuenta(Gestor gestorCuenta) {
        this.gestorCuenta = gestorCuenta;
    }

    boolean egreso(double cant) {
        boolean operacionPosible = cant <= this.saldo;

        if (operacionPosible) {
            this.saldo -= cant;
        } else {
            System.out.println("Saldo insuficiente");
        }

        return operacionPosible;
    }

    void ingreso(double cant) {
        this.saldo += cant;
    }

    void mostrarInformacion() {
        System.out.println("\n" + nombreBanco);
        System.out.println("------------------------------");
        System.out.println("DNI Titular:\t" + this.dni);
        System.out.println("Nombre Titular:\t" + this.titular);
        System.out.println("Saldo:\t\t" + this.saldo);
        System.out.println("------------------------------");
        
        if(gestorCuenta != null) {
            System.out.println("Información gestor:");
            gestorCuenta.mostrarInformacion();
        } else {
            System.out.println("Cuenta sin gestor");
        }
    }
}
