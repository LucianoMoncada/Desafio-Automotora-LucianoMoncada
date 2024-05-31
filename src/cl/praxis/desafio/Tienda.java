package cl.praxis.desafio;

public class Tienda {

    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private int stock;

    public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock) {
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.stock = stock;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String existeStock() {
        return "Cantidad de stock es" + getStock();

    }

}
