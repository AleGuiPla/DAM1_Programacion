/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_14_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        ResultSet rs;
        String sql;

        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";
        try (Connection con = DriverManager.getConnection(url, "alumno", "alum2526")) {
            sentencia = con.createStatement();

            System.out.println("Introduce el curso: ");
            String curso = new Scanner(System.in).nextLine();

            sql = "SELECT * FROM alumnos2526 WHERE curso = '" + curso + "'";

            rs = sentencia.executeQuery(sql);

            System.out.println("ALUMNOS DEL CURSO " + curso);
            while (rs.next()) {
                System.out.println("----------");
                System.out.println("Alumno #" + rs.getInt(1));
                System.out.println("NOMBRE: " + rs.getString(2));
                System.out.println("FECHA NACIMIENTO: " + rs.getDate(3));
                System.out.println("MEDIA: " + rs.getDouble(4));

            }

        } catch (SQLException ex) {
            System.out.println("Error !!!!!!!!!!!!!!!!!!!!!");
            System.out.println(ex);
        }
    }
}
