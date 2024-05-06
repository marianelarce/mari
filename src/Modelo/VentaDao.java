
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VentaDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    public int RegistrarVenta(Venta v){
        String sql="INSERT INTO venta(total, vendedoroid, clienteid, fecha) VALUES (?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setDouble(1, v.getTotal());
            ps.setInt(2, v.getVendedor());
            ps.setInt(3, v.getCliente());
            ps.setString(4,  v.getFecha());
            ps.execute();
        }catch(SQLException e){
            System.out.println(e.toString());
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
        return r;
    }
    public int RegistrarDetalle(Detalle Dv){
        String sql="INSERT INTO detalleventa(cantidad, precio, productoid, ventaid) VALUES (?,?,?,?)";
        
        try{
            con = cn.getConnection();
            ps= con.prepareStatement(sql);
            ps.setInt(1, Dv.getCantidad());
            ps.setDouble(2, Dv.getPrecio());
            ps.setInt(3, Dv.getId_producto());
            ps.setInt(4, Dv.getId_venta());
            ps.execute();
        }catch(SQLException e){
            System.out.println(e.toString());
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
         return r;
    }
     public int RegistrarDetalleV(Detalle Dv){
        String sql="INSERT INTO detalle(cod_pro ,  cantidad ,  precio ,  id_venta) VALUES (?,?,?,?)";
        
        try{
            con = cn.getConnection();
            ps= con.prepareStatement(sql);
            ps.setInt(1, Dv.getCodPro());
            ps.setInt(2, Dv.getCantidad());
            ps.setDouble(3, Dv.getPrecio());
            ps.setInt(4, Dv.getId_venta());
            ps.execute();
        }catch(SQLException e){
            System.out.println(e.toString());
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
         return r;
    }
     public int idVenta(){
         int id=0;
            String sql="SELECT MAX(id) FROM venta";
            try{
                con =cn.getConnection();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs.next()){
                    id= rs.getInt(1);
                }
            }catch(SQLException e){
                System.out.println(e.toString());
            }
            return id;
     }
     public boolean ActualizarStock(int stock, String codigo){
         String sql="UPDATE producto SET stock = ? WHERE codigo= ?";
         try{
             con = cn.getConnection();
             ps = con.prepareStatement(sql);
             ps.setInt(1, stock);
             ps.setString(2, codigo);
             ps.execute();
             return true;
         }catch(SQLException e){
             return false;
         }
     }
     public List ListarVentas() {
        List<Venta> ListarVenta = new ArrayList();
        String sql = "SELECT * FROM venta";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Venta ven = new Venta();
                ven.setId(rs.getInt("id"));
                ven.setTotal(rs.getDouble("total"));
                ven.setVendedor(rs.getInt("vendedoroid"));
                ven.setCliente(rs.getInt("clienteid"));
                ListarVenta.add(ven);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListarVenta;
    }
}
