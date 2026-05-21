package activaula_accesobdcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class AlumnoDAO {

    private static final String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_M";
    private static final String user = "alumno";
    private static final String passwd = "alum2526";

    public static void create(Alumno alumno) {
        try (Connection con = DriverManager.getConnection(url, user, passwd)) {
            PreparedStatement sentencia = con.prepareStatement("INSERT INTO alumnos2526"
                    + "VALUES (?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?)");

            sentencia.setInt(1, alumno.getId());
            sentencia.setString(2, alumno.getNombre());
            sentencia.setString(3, alumno.getFechaNac().toString());
            sentencia.setDouble(4, alumno.getMedia());
            sentencia.setString(5, alumno.getCurso());

            sentencia.executeUpdate();

        } catch (SQLException e) {
            System.out.println("El alumno no ha podido ser insertado!");
            System.err.println(e);
        }
    }

    public static Alumno read(int id) {
        try (Connection con = DriverManager.getConnection(url, user, passwd)) {
            PreparedStatement sentencia = con.prepareStatement("SELECT * FROM alumnos2526"
                    + "WHERE num = ?");

            sentencia.setInt(1, id);

            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {
                Alumno alumno = new Alumno(rs.getInt("num"), rs.getString("nombre"),
                        rs.getDate("fnac").toLocalDate(), rs.getDouble("media"), rs.getString("curso"));
                return alumno;
            }

        } catch (SQLException e) {
            System.out.println("El alumno no ha podido ser insertado!");
            System.err.println(e);
        }

        return null;
    }
}
