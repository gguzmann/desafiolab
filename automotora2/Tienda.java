package cl.desafios.automotora2;

public class Tienda {
    private Vendedor vendedor;
    private Cliente cliente;
    private int stock;

    public Tienda() {
    }

    public Tienda(Vendedor vendedor, Cliente cliente, int stock) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.stock = stock;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void existeStock(Vendedor vendedor, Vehiculo vehiculo, String stock) {
        System.out.println("Cantidad de stock es: " + stock);
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "vendedor=" + vendedor +
                ", cliente=" + cliente +
                ", stock=" + stock +
                '}';
    }
}
