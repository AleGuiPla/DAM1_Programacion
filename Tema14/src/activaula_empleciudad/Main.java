/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activaula_empleciudad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";
        String user = "alumno";
        String passwd = "alum2526";

        boolean repetir = true;

        do {
            try (Connection con = DriverManager.getConnection(url, user, passwd)) {
                String ciudad;
                int numeroOficina;

                do {
                    System.out.println("Introduce el nombre de la ciudad:");
                    ciudad = new Scanner(System.in).nextLine();

                    numeroOficina = buscarOficina(con, ciudad);
                } while (numeroOficina == -1);

                mostrarEmpleados(con, numeroOficina, ciudad);

                String preguntaRepetir;
                do {
                    System.out.println("\nQuieres repetir la busqueda? (S/N)");
                    preguntaRepetir = new Scanner(System.in).nextLine();
                } while (!preguntaRepetir.equalsIgnoreCase("S") && !preguntaRepetir.equalsIgnoreCase("N"));

                if (preguntaRepetir.equalsIgnoreCase("N")) {
                    repetir = false;
                }

            } catch (SQLException e) {
                System.out.println("Ha habido un problema");
                System.err.println(e);
            }

        } while (repetir);

        System.out.println("Gracias por utilizar! :3");
    }

    public static int buscarOficina(Connection con, String ciudad) throws SQLException {
        PreparedStatement sentencia;
        ResultSet rs;
        int oficina;

        sentencia = con.prepareStatement("SELECT oficina FROM Oficinas2526 WHERE ciudad = ?");
        sentencia.setString(1, ciudad);
        rs = sentencia.executeQuery();

        if (rs.next()) {
            oficina = rs.getInt("oficina");
        } else {
            oficina = -1;
            System.out.println("Nombre de oficina no valido.");
        }

        return oficina;
    }

    public static void mostrarEmpleados(Connection con, int oficina, String ciudad) throws SQLException {
        PreparedStatement sentencia;
        ResultSet rs;

        sentencia = con.prepareStatement("SELECT * FROM empleados2526 WHERE oficina = ?");
        sentencia.setInt(1, oficina);
        rs = sentencia.executeQuery();

        String nombreMasJoven = "";
        String nombreMasVeterano = "";
        int totalEmpleados = 0;
        int edadMasJoven = 999;
        int edadMasVeterano = 0;
        int mediaEdad = 0;

        System.out.println(String.format("--- Empleados en %s (oficina %d)", ciudad, oficina));
        while (rs.next()) {
            String nombre = rs.getString("nombre");
            int edad = rs.getInt("edad");
            String puesto = rs.getString("puesto");

            if (edad < edadMasJoven) {
                nombreMasJoven = nombre;
                edadMasJoven = edad;
            }

            if (edad > edadMasVeterano) {
                nombreMasVeterano = nombre;
                edadMasVeterano = edad;
            }

            totalEmpleados += 1;
            mediaEdad += edad;

            System.out.println(String.format("Nombre: %s\t| Edad: %d\t| Puesto: %s", nombre, edad, puesto));
        }

        if (totalEmpleados == 0) {
            mediaEdad = 0;
        } else {
            mediaEdad /= totalEmpleados;
        }

        System.out.println("\n--- Resumen ---");
        System.out.println("Total de empleados :" + totalEmpleados);
        System.out.println(String.format("Más joven\t: %s (%d años)", nombreMasJoven, edadMasJoven));
        System.out.println(String.format("Más veterano\t: %s (%d años)", nombreMasVeterano, edadMasVeterano));
        System.out.println(String.format("Media de edad\t: %d años", mediaEdad));

    }
}
