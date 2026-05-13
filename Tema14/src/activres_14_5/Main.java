/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activres_14_5;

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

    public static void main(String[] args) {
        ResultSet rs;
        Statement sentencia;
        String sql;

        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";
        try (Connection con = DriverManager.getConnection(url, "alumno", "alum2526")) {
            sentencia = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            System.out.println("Introduce el curso: ");
            String curso = new Scanner(System.in).nextLine();

            sql = "SELECT * FROM alumnos2526 WHERE curso = '" + curso + "'";
            rs = sentencia.executeQuery(sql);
            rs.afterLast();

            System.out.println("ALUMNOS DEL CURSO " + curso);
            int numAlumno = 0;
            while (rs.previous()) {
                System.out.println("----------");
                System.out.println("Alumno #" + ++numAlumno);
                System.out.println("ID:" + rs.getInt(1));
                System.out.println("NOMBRE: " + rs.getString(2));
                System.out.println("FECHA NACIMIENTO: " + rs.getDate(3));
                System.out.println("MEDIA: " + rs.getDouble(4));

            }

        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un problema!");
            System.out.println(ex);
        }
    }
}
