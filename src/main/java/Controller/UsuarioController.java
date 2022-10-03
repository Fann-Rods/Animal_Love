package Controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;
import beans.Usuario;
import connection.DBConnection;

public class UsuarioController implements IUsuarioController {

    @Override
    public String form_login(String id_usuario, String contrasenia) {

        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM usuario WHERE id_usuario = '" + id_usuario
                + "' and contrasenia = '" + contrasenia + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String tipo_documento = rs.getString("tipo_documento");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                String departamento = rs.getString("departamento");
                String ciudad = rs.getString("ciudad");

                Usuario usuario = new Usuario(id_usuario, contrasenia, tipo_documento, nombre, apellido, telefono, email, departamento, ciudad);
                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }

    @Override 
    public String form_registro(String id_usuario, String contrasenia, String tipo_documento, String nombre, String apellido, String telefono, String email,
            String departamento, String ciudad) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Insert into usuario values('" + id_usuario + "', '" + contrasenia + "', '" + tipo_documento
                + "', '" + nombre + "', '" + apellido + "', '" + telefono + "', '" + email + "', '" + departamento + "', '" + ciudad + "')";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            Usuario usuario = new Usuario(id_usuario, contrasenia, tipo_documento, nombre, apellido, telefono, email, departamento, ciudad);

            st.close();

            return gson.toJson(usuario);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";

    }
}
