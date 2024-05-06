package Modelo;

public class ComboBox {

private int id;
private String valor;

    public ComboBox(int id, String valor) {
        this.id = id;
        this.valor = valor;

    }

    public int getId() {
        return id;
    }
    
    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.getValor(); 
    }

    
    

}
