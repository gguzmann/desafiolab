package cl.ReciclaJeans;


import cl.prueba.utilidades.Utilidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Exportador exportadorTxt = new ExportadorTXT();
    private ProductoServicio productoServicio = new ProductoServicio(new ArrayList<>());
    private Scanner sc = new Scanner(System.in);

    public Menu() {
    }

    public void iniciarMenu(){
        int option = 0;

        do {

            mostrarMenu();
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("***** Listar Productos *****");
                    listarProductos();
                    break;
                case 2:
                    System.out.println("***** Agregar Producto *****");
                    agregarProducto();
                    break;
                case 3:
                    System.out.println("***** Exportar Datos *****");
                    exportadorTxt.exportar("src\\productos.txt", productoServicio.getListaProductos());
                    break;
                case 4:
                    System.out.println("***** Salir *****");
                    break;

                default:
                    System.out.println("Ingrese una opción correcta.");
                    break;

            }
        }while (option != 4);
    }

    public void agregarProducto(){
        Producto producto = new Producto();
        System.out.println("Ingresar articulo");
        String articulo = sc.next();
        System.out.println("Ingresar precio");
        String precio = sc.next();
        System.out.println("Ingresar descripcion");
        String descripcion = sc.next();
        System.out.println("Ingresar codigo");
        String codigo = sc.next();
        System.out.println("Ingresar talla");
        String talla = sc.next();
        System.out.println("Ingresar marca");
        String marca = sc.next();
        System.out.println("Ingresar color");
        String color = sc.next();
        producto.setArticulo(articulo);
        producto.setCodigo(codigo);
        producto.setColor(color);
        producto.setDescripcion(descripcion);
        producto.setMarca(marca);
        producto.setPrecio(precio);
        producto.setTalla(talla);
        productoServicio.getListaProductos().add(producto);

    }

    public void listarProductos(){
        productoServicio.listarProductos();
    }
    public void mostrarMenu(){
        System.out.println("1. Listar Productos");
        System.out.println("2. Agregar Producto");
        System.out.println("3. Exportar Datos");
        System.out.println("4. Salir");
        System.out.println("Ingrese una opción:");
    }
}
