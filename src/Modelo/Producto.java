package Modelo;

public class Producto {

private int id;
private String codigo;
private String nombre;
private int stock;
private String descripcion;
private double precio;
private int proveedor;

Proveedor pro = new Proveedor();
    public Producto() {
    }

    public Producto(int id, String codigo, String nombre, int stock, String descripcion, double precio, int proveedor) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.descripcion = descripcion;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getProveedor() {
    return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }



}
