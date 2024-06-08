package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author mikey
 */
public class Conexion {

    //Conexion Local
    public static Connection conectar() {
        String password = "";
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Sistema_Ventas", "root", password);
            return cn;
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error en la conexion local" + e);
        }
        return null;
    }
}
