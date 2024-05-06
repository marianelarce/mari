
package Modelo;

public class Proveedor {
    private int id;
    private int nit;
    private String nombre;
    private int telefono;
    private String Direccion;

    public Proveedor() {
    }

    public Proveedor(int id, int nit, String nombre, int telefono, String Direccion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.Direccion = Direccion;
    }
    public int darNombre(){
//        int i=id;
//        i = Integer.parseInt(nombre);
        return id=Integer.parseInt(nombre);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
}
