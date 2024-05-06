package Modelo;

public class Detalle {

    private int id;
    private int codPro;
    private int cantidad;
    private double precio;
    private int id_producto;
    private int id_venta;

    public Detalle() {
    }

    public Detalle(int id, int codPro, int cantidad, double precio, int id_producto, int id_venta) {
        this.id = id;
        this.codPro = codPro;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_producto = id_producto;
        this.id_venta = id_venta;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodPro() {
        return codPro;
    }

    public void setCodPro(int codPro) {
        this.codPro = codPro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    

    
}
