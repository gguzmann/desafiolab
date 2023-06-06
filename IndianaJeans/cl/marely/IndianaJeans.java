package cl.marely;
import java.util.List;
import java.util.Scanner;

import cl.marely.model.Producto;
public class IndianaJeans {
	
	static DaoProductoServicio daoProducto = new ProductoServicio();

	public static void main(String[] args) {
		
		agregarProducto();
		
		daoProducto.mostrarProductos();
		
		List<Producto> nuevaLista = daoProducto.mostrarTodo();
		
		daoProducto.exportarLista(nuevaLista);
		
//		Menu menu = new Menu();
//		menu.menu();
//		
		
	}

	public static void agregarProducto() {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("ARTICULO: ");
		String articulo = sc.nextLine();
		
		System.out.println("PRECIO: ");
		String precio = sc.nextLine();
		
		System.out.println("DESCRIPCION: ");
		String descripcion = sc.nextLine();
		
		System.out.println("CODIGO: ");
		String codigo = sc.nextLine();
		
		System.out.println("TALLA: ");
		String talla = sc.nextLine();
		
		System.out.println("MARCA: ");
		String marca = sc.nextLine();
		
		System.out.println("COLOR: ");
		String color = sc.nextLine();
		
		daoProducto.agregarProducto(articulo, precio, descripcion, codigo, talla, marca, color);

		
		sc.close();
	
	}
	

	
}
