package co.edu.escuelaing.sparkd.database;

public class Pedido {
    private String restaurante;
    private String plato;
    private String precio;
    private int mesa;

    public Pedido(String restaurante, String plato, String precio, int mesa) {
        this.restaurante = restaurante;
        this.plato = plato;
        this.precio = precio;
        this.mesa = mesa;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Pedido [mesa=" + mesa + ", plato=" + plato + ", precio=" + precio + ", restaurante=" + restaurante
                + "]";
    }
}
