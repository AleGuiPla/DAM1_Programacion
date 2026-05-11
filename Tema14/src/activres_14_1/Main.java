/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activres_14_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        String sqlGetAlumnos = "SELECT nombre, media FROM alumnos2526";
        String sqlIncrementarMedia = "UPDATE alumnos2526 SET media = media + 1 WHERE curso = '1B'";
        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";

        try (Connection con = DriverManager.getConnection(url, "alumno", "alum2526")) {
            sentencia = con.createStatement();
            rs = sentencia.executeQuery(sqlGetAlumnos);
            System.out.println("Antes de cambiar media");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + "\t\t" + rs.getString("media"));
            }

            sentencia.executeUpdate(sqlIncrementarMedia);
            
            rs = sentencia.executeQuery(sqlGetAlumnos);
            System.out.println("\nDespues de cambiar media");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + "\t\t" + rs.getString("media"));
            }

        } catch (SQLException ex) {
            System.out.println("Ha ocurrido algún error. ");
            System.out.println(ex);
        }

    }

}
