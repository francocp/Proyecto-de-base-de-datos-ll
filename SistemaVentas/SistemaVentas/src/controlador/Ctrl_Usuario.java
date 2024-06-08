package controlador;

import modelo.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import conexion.Conexion;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author mikey
 */
public class Ctrl_Usuario {

    //Metodo para Iniciar Sesion
    public boolean loginUsers(Usuario usuario) {
        boolean respuesta = false;

        Connection cn = Conexion.conectar();
        String sql = "SELECT usuario, contraseña FROM tbl_Usuarios WHERE usuario = '" + usuario.getUsuario() + "' AND contraseña = '" + usuario.getPassword() + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }
        return respuesta;
    }
}
