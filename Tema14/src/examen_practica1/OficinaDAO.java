/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_practica1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex
 */
public class OficinaDAO {

    private static String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
    private static String user = "alumno";
    private static String passwd = "alumno";

    private Connection connection;

    public OficinaDAO() {
        try {
            this.connection = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException e) {
            System.out.println("Ha habido un error al conectarse a la base de datos");
            System.err.println(e);
        }
    }

    public List<Oficina> todasOficinas() {
        List<Oficina> oficinas = new ArrayList<>();
        String sql = "SELECT * FROM oficinas2526";

        try (Statement sentencia = connection.createStatement()) {
            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                int num = rs.getInt("oficina");
                String ciudad = rs.getString("ciudad");
                int superficie = rs.getInt("superficie");
                double ventas = rs.getDouble("ventas");

                Oficina o = new Oficina(num, ciudad, superficie, ventas);
                oficinas.add(o);
            }

        } catch (SQLException e) {
            System.out.println("Ha habido un error al obtener las oficinas");
            System.err.println(e);
        }

        return oficinas;
    }

    public List<Oficina> todasOficinas(int superficieMin) {
        List<Oficina> oficinas = new ArrayList<>();
        String sql = "SELECT * FROM oficinas2526 WHERE superficie > ?";

        try (PreparedStatement sentencia = connection.prepareStatement(sql)) {
            sentencia.setInt(1, superficieMin);
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {
                int num = rs.getInt("oficina");
                String ciudad = rs.getString("ciudad");
                int superficie = rs.getInt("superficie");
                double ventas = rs.getDouble("ventas");

                Oficina o = new Oficina(num, ciudad, superficie, ventas);
                oficinas.add(o);
            }
            
            if (oficinas.size() == 0) {
                System.out.println("No hay oficinas con una superficie mayor a " + superficieMin);
            }

        } catch (SQLException e) {
            System.out.println("Ha habido un error al obtener las oficinas con la superficie minima " + superficieMin);
            System.err.println(e);
        }

        return oficinas;
    }
    
    public Oficina buscar(int numOficina) {
        Oficina oficina = null;
        String sql = "SELECT * FROM oficinas2526 WHERE oficina = ?";

        try (PreparedStatement sentencia = connection.prepareStatement(sql)) {
            sentencia.setInt(1, numOficina);
            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {
                int num = rs.getInt("oficina");
                String ciudad = rs.getString("ciudad");
                int superficie = rs.getInt("superficie");
                double ventas = rs.getDouble("ventas");

                oficina = new Oficina(num, ciudad, superficie, ventas);
            } else {
                System.out.println("La oficina con el numero " + numOficina + " no existe");
            }
            
        } catch (SQLException e) {
            System.out.println("Ha habido un error al obtener la oficina con numero  " + numOficina);
            System.err.println(e);
        }

        return oficina;
    }

    public void desconectar() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Ha habido un error al desconectarse de la base de datos");
            System.err.println(e);
        }

    }
}
