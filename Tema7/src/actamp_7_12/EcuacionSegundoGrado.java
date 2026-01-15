/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actamp_7_12;

/**
 *
 * @author algupl336
 */
public class EcuacionSegundoGrado {

    private double a;
    private double b;
    private double c;

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double[] solucion() {
        double[] soluciones;
        double disciminante = discriminante();

        if(espositivoDiscriminante(disciminante)) {
            double solucionPos, solucionNeg;
            
            solucionPos = (-b + Math.sqrt(disciminante)) / (2 * a);
            solucionNeg = (-b - Math.sqrt(disciminante)) / (2 * a);
            
            soluciones = new double[] {solucionPos, solucionNeg};
        } else {
            soluciones = new double[] {Double.NaN, Double.NaN};
        }
        
        return soluciones;
    }

    private double discriminante() {
        return (b * b) - (4 * a * c);
    }
    
    private boolean espositivoDiscriminante(double discriminante) {
        return discriminante >= 0;
    }
}
