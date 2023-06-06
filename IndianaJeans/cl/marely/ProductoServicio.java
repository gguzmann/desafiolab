package cl.marely;

import cl.marely.model.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProductoServicio implements DaoProductoServicio{
private List<Producto> listaProducto = new ArrayList<Producto>();
	
	
	@Override
	public void agregarProducto(String articulo, String precio, String descripcion, String codigo, String talla,
			String marca, String color) {
		// TODO Auto-generated method stub
		Producto p = new Producto(articulo,precio,descripcion,codigo,talla,marca,color);
		listaProducto.add(p);
		
		
	}

	@Override
	public void mostrarProductos() {
		// TODO Auto-generated method stub
		for (Producto p : listaProducto) {
			System.out.println(p.toString());
		}
		
	}

	@Override
	public void exportarLista(List<Producto> lista) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public List<Producto> mostrarTodo() {
		// TODO Auto-generated method stub
		
		return listaProducto;
	}
	

}
