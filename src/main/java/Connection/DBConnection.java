package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    
   Connection connection;
    
   static String bd= "railway";
   static String port= "6745";
   static String login= "root";
   static String password= "x5qRbuLfdXicTyp6WDsQ";
   static String ip = "containers-us-west-88.railway.app";

    public DBConnection() {
        
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            String url= "jdbc:mysql://" + DBConnection.ip + ":" + DBConnection.port  + "/" + DBConnection.bd;
            connection = DriverManager.getConnection(url,this.login,this.password);
            System.out.println("Conexion establecida");
            
        } catch (Exception ex) {
            System.out.println("Error de conexion");
        }   
    }
 
 public Connection getConnection(){
    return connection;
    }   
 public void desconectar(){
     connection= null;
    }
 }