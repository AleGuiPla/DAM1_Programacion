package pruebalectura;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String contenido = "";
        FileReader in = null;
        
        try {
            in = new FileReader("src\\pruebalectura\\Main.java");
            int c = in.read();
            while (c != -1) {
                contenido += (char) c;
                c = in.read();
            }
        } catch (IOException e) {
            System.out.println("Tonto, que me rompes el programa");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        
        System.out.println(contenido);
    }
}
