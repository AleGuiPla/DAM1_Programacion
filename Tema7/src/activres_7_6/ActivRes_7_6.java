package activres_7_6;

import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class ActivRes_7_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora hora = new Hora();
        int segundosMostrar;

        System.out.println("Introduce la hora:");
        hora.setHora(sc.nextByte());

        System.out.println("Introduce los minutos:");
        hora.setMinuto(sc.nextByte());

        System.out.println("Introduce los segundos:");
        hora.setSegundo(sc.nextByte());
        
        System.out.println("Cuantos segundos avanzar?");
        segundosMostrar = sc.nextInt();

        for (int i = 0; i < segundosMostrar; i++) {
            System.out.println(hora.obtenerHora());
            hora.incrementaSegundo();
        }
    }
}
