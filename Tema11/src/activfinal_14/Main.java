package activfinal_14;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayNumeros = generarArrayNumeros(8, 15);

        // Mostrar array
        System.out.println(Arrays.toString(arrayNumeros));

        // Guardado de numeros de numeros en ficheros
        guardarNumerosArray(arrayNumeros, "numeros1.dat");
        guardarNumerosSecuencial(arrayNumeros, "numeros2.dat");

        // Clasificacion de numeros en diferentes ficheros para par o impar
        clasificarNumerosArray("numeros1.dat", "pares1.dat", "impares1.dat");
        clasificarNumerosSecuencial("numeros2.dat", "pares2.dat", "impares2.dat");

        // Guardar en documento de texto apres e impares
        escribirFicherosTextoArray("numerosA.txt", "pares1.dat", "impares1.dat");
    }

    public static int[] generarArrayNumeros(int minLength, int maxLength) {
        int[] array = new int[(int) (Math.random() * (maxLength - minLength) + minLength)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void guardarNumerosArray(int[] array, String fichero) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src\\activfinal_14\\" + fichero))) {
            out.writeObject(array);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void guardarNumerosSecuencial(int[] array, String fichero) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src\\activfinal_14\\" + fichero))) {
            for (int i : array) {
                out.writeInt(i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void clasificarNumerosArray(String ficheroLeer, String ficheroPares, String ficheroImpares) {
        int[] array = new int[0];

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src\\activfinal_14\\" + ficheroLeer))) {
            array = (int[]) in.readObject();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        int cantidadPares = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                cantidadPares++;
            }
        }

        int[] arrayPares = new int[cantidadPares];
        int[] arrayImpares = new int[array.length - cantidadPares];

        int contadorPares = 0;
        int contadorImpares = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                arrayPares[contadorPares++] = i;
            } else {
                arrayImpares[contadorImpares++] = i;
            }
        }

        System.out.println(Arrays.toString(arrayPares));
        System.out.println(Arrays.toString(arrayImpares));

        try (ObjectOutputStream outPar = new ObjectOutputStream(new FileOutputStream("src\\activfinal_14\\" + ficheroPares)); ObjectOutputStream outImpar = new ObjectOutputStream(new FileOutputStream("src\\activfinal_14\\" + ficheroImpares))) {
            outPar.writeObject(arrayPares);
            outImpar.writeObject(arrayImpares);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void clasificarNumerosSecuencial(String ficheroLeer, String ficheroPares, String ficheroImpares) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src\\activfinal_14\\" + ficheroLeer)); ObjectOutputStream outPar = new ObjectOutputStream(new FileOutputStream("src\\activfinal_14\\" + ficheroPares)); ObjectOutputStream outImpar = new ObjectOutputStream(new FileOutputStream("src\\activfinal_14\\" + ficheroImpares))) {
            while (true) {
                int numero = in.readInt();
                if (numero % 2 == 2) {
                    outPar.writeInt(numero);
                } else {
                    outImpar.writeInt(numero);
                }
            }
        } catch (EOFException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void escribirFicherosTextoArray(String ficheroSalida, String ficheroPares, String ficheroImpares) {
        try (ObjectInputStream inPar = new ObjectInputStream(new FileInputStream("src\\activfinal_14\\" + ficheroPares)); ObjectInputStream inImpar = new ObjectInputStream(new FileInputStream("src\\activfinal_14\\" + ficheroImpares)); BufferedWriter out = new BufferedWriter(new FileWriter("src\\activfinal_14\\" + ficheroSalida))) {
            int[] arrayPares = (int[]) inPar.readObject();
            int[] arrayImpares = (int[]) inImpar.readObject();

            int contadorPares = 0;
            int contadorImpares = 0;
            for (int i = 0; i < (arrayPares.length + arrayImpares.length); i++) {
                if (contadorImpares < arrayImpares.length) {
                    out.write(arrayImpares[contadorImpares++] + " -\tIMPAR");
                    out.newLine();
                }

                if (contadorPares < arrayPares.length) {
                    out.write(arrayPares[contadorPares++] + " -\tPAR");
                    out.newLine();
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void escribirFicherosTextoSecuencial(String ficheroSalida, String ficheroPares, String ficheroImpares) {
        try (ObjectInputStream inPar = new ObjectInputStream(new FileInputStream("src\\activfinal_14\\" + ficheroPares)); ObjectInputStream inImpar = new ObjectInputStream(new FileInputStream("src\\activfinal_14\\" + ficheroImpares)); BufferedWriter out = new BufferedWriter(new FileWriter("src\\activfinal_14\\" + ficheroSalida))) {
            while (true) {                
                
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
