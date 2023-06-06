package cl.marely;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {

	public void menu() {
		int opcion = 0;
	
	
			System.out.println("\t------M E N U------");
			System.out.println();
			System.out.println("\t[1] Listar Producto");
			System.out.println("\t[2] Agregar Producto");
			System.out.println("\t[3] Exportar Datos");
			System.out.println("\t[4] Salir");
			System.out.println();
			System.out.print("\tIngrese una opción:");
			try (Scanner sc = new Scanner(System.in)) {
				try {	
					opcion = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Error");
					sc.nextLine();
				}
			}
			ProductoServicio ps = new ProductoServicio();
			switch (opcion) {
			case 1:
//				ps.listarProductos();
				break;
			case 2:
//				ps.agregarProductos();
				break;
			case 3:
				ExportadorTxt txt = new ExportadorTxt();
				txt.limpiaPantalla();
				break;
			case 4:
				System.out.println("Fin del programa");
				System.exit(0);
			
				break;
//			default:
//				System.out.println("otra respuesta");
//				break;
			}

		

	}

	public void menuAgregarProducto() {
		System.out.println("Menu Agregar Producto");
	}

}
