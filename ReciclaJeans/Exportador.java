package cl.ReciclaJeans;


import java.util.List;

public abstract class Exportador {
    public abstract void exportar(String fileName, List<Producto> listaProducto);

}
