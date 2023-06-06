package cl.marely;

import java.util.List;

import cl.marely.model.Producto;

public interface DaoProductoServicio {

	
	public void agregarProducto(String articulo, String precio, String descripcion, String codigo, String talla, String marca,
			String color);
	
	public void mostrarProductos();
	
	public void exportarLista(List <Producto>lista);
	
	public List <Producto> mostrarTodo();
	
	
	

}
