package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    public Login loggear(String correo, String pass) {
        Login login = new Login();
        String sql = "SELECT * FROM usuario WHERE correo=? AND Password=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                login.setID(rs.getInt("id"));
                login.setNombre(rs.getString("nombres"));
                login.setCorreo(rs.getString("correo"));
                login.setPass(rs.getString("password"));
                login.setRol(rs.getString("rol"));
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexion: " + e.toString());
        }
        return login;
    }

    public boolean Registrar(Login lg) {
        String sql = "INSERT INTO usuario(nombre, correo, pass, rol) VAlUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lg.getNombre());
            ps.setString(2, lg.getCorreo());
            ps.setString(3, lg.getPass());
            ps.setString(4, lg.getRol());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

}
