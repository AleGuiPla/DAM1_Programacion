/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_14_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
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
        PreparedStatement sentencia;
        String sql;

        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";
        try (Connection con = DriverManager.getConnection(url, "alumno", "alum2526")) {
            sql = "SELECT * FROM alumnos2526 WHERE curso = ? AND (media = ? OR media > ?)";
            sentencia = con.prepareStatement(sql);

            System.out.println("Introduce el curso: ");
            String curso = new Scanner(System.in).nextLine();
            System.out.println("Introduce la nota de corte: ");
            Double notaCorte = new Scanner(System.in).nextDouble();

            sentencia.setString(1, curso);
            sentencia.setDouble(2, notaCorte);
            sentencia.setDouble(3, notaCorte);

            ResultSet rs = sentencia.executeQuery();

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
