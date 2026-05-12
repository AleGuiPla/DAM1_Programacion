/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_14_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author algupl336
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Statement sentencia;
        String sql;
        
        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";
        try (Connection con = DriverManager.getConnection(url, "alumno", "alum2526")) {
            sentencia = con.createStatement();
            
            // Solicitar datos del alumno
            System.out.println("Introduce el numero del alumno:");
            int num = new Scanner(System.in).nextInt();
            
            System.out.println("Introduce el nombre del alumno:");
            String nombre = new Scanner(System.in).nextLine();
            
            System.out.println("Introduce la fecha de nacimiento (YYYY/MM/DD) del alumno:");
            String fechaNac = new Scanner(System.in).nextLine();
            
            System.out.println("Introduce la media del alumno:");
            double media = new Scanner(System.in).useLocale(Locale.US).nextDouble();
            
            System.out.println("Introduce el curso (1B, 4D, etc.) del alumno:");
            String curso = new Scanner(System.in).nextLine();
            
            sql = "INSERT INTO alumnos2526 VALUES "
                    + "(" + num + ", '" + nombre + "', TO_DATE('" + fechaNac + "', 'YYYY/MM/DD'), " + media + ", '" + curso + "'"+ ")";
            System.out.println(sql);

            sentencia.executeUpdate(sql);
            System.out.println("Se ha insertado el alumno");
            
        } catch (SQLException e) {
            System.out.println("NO funciono T-T");
        }
    }
}
