package Test;

import beans.Mascota;
import connection.DBConnection;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
        listarMascota();
    }

    public static void actualizarMascota(int id_mascota, String raza) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE mascota SET raza= '" + raza + "'WHERE id= " + id_mascota;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

    }

    public static void listarMascota() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM mascota";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id_mascota = rs.getInt("id_mascota");
                String nombre = rs.getString("nombre");
                String raza = rs.getString("raza");
                String tipo = rs.getString("tipo");
                String edad = rs.getString("edad");
                Blob foto = rs.getBlob("foto");
                String genero = rs.getString("genero");
                String descripcion = rs.getString("descripcion");
                String montas_mascota = rs.getString("montas_mascota");
                int id_usuario = rs.getInt("id_usuario");

                Mascota mascotas = new Mascota(id_mascota, nombre, raza, tipo, edad, foto, genero, descripcion, montas_mascota, id_usuario);
                System.out.println(mascotas.toString());

            }
            st.executeQuery(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

    }
    
}
