/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_db1;

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
        String sql = "select * from alumnos2526";
        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";

        try (Connection con = DriverManager.getConnection(url, "alumno", "alum2526")) {
            sentencia = con.createStatement();
            rs = sentencia.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("NOMBRE"));                
            }
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido algún error. ");
            System.out.println(ex);
        }

    }

}
