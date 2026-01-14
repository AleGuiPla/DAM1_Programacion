package activres_7_5;

public class ActivRes_7_5 {

    public static void main(String[] args) {
        Gestor g1 = new Gestor("Diana", "682672661");

        CuentaCorriente c1 = new CuentaCorriente("67676767P", "Diana", 1000000.0, g1);
        CuentaCorriente c2 = new CuentaCorriente("00000000D", 9999999.99);
        CuentaCorriente c3 = new CuentaCorriente("69696969G", "Alex");

        c1.mostrarInformacion();
        
        CuentaCorriente.setNombreBanco("Mikum");
        
        c2.mostrarInformacion();
        
        CuentaCorriente.setNombreBanco("Banco Internacional Nacional de Java");
        
        c3.mostrarInformacion();
        c3.setGestorCuenta(g1);
        c3.mostrarInformacion();
    }

}
