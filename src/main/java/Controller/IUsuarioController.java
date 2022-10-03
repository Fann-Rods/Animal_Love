package Controller;

import java.util.Map;

public interface IUsuarioController{
    
    public String form_login(String id_usuario, String contrasenia);
    
    public String form_registro(String id_usuario, String contrasenia, String tipo_documento, String nombre, String apellido, String telefono, String email, String departamento, String ciudad);
    
}
