package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    Connection con;
    
    public Connection getConnection(){
        try
        {
            String access="jdbc:ucanaccess://D:/ventas.accdb";
            
//            String myDB= "jdbc:mysql://localhost:3306/sistemaventa?serverTimezone=UTC";
            con = DriverManager.getConnection(access);
            return con;
        }
        catch(SQLException e)
        {
            System.out.println("Error de Conexion" +e.toString());
        }
        
        return null;
    }
}
