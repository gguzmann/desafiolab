package cl.prueba.vista;

import cl.prueba.modelo.CategoriaEnum;
import cl.prueba.modelo.Cliente;
import cl.prueba.servicio.ClienteServicio;
import cl.prueba.servicio.Exportador;
import cl.prueba.servicio.ExportadorCSV;
import cl.prueba.servicio.ExportadorTXT;
import cl.prueba.utilidades.Utilidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Menu {
    private ClienteServicio clienteServicio = new ClienteServicio(new ArrayList<Cliente>());
    private Exportador exportadorCsv = new ExportadorCSV();
    private Exportador exportadorTxt = new ExportadorTXT();
    private String fileName = "Clientes";
    private String fileName1 = "DBClientes.csv";
    private Scanner sc = new Scanner(System.in);

    public Menu() {
    }



    public void iniciarMenu(){
        int option = 0;

        do {

            Utilidad.mostrarMenu();
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("***** Listar Clientes *****");
                    listarCliente();
                    break;
                case 2:
                    System.out.println("***** Agregar Cliente *****");
                    agregarCliente();
                    break;
                case 3:
                    System.out.println("***** Editar Cliente *****");
                    menuEditar();
                    break;
                case 4:
                    System.out.println("***** Cargar Cliente *****");
                    exportadorCsv.importar("src\\test.csv", clienteServicio.getListaClientes());
                    break;
                case 5:
                    System.out.println("***** Exportar Cliente *****");
                    exportadorCsv.exportar("src\\test.csv", clienteServicio.getListaClientes());
                    break;
                case 6:
                    System.out.println("***** Salir *****");
                    break;
                default:
                    System.out.println("Ingrese una opción correcta.");
                    break;

            }
        }while (option != 6);
    }

    public void menuExportar(){

        System.out.println("Seleccione el formato a exportar:");
        System.out.println("1. Formato CSV");
        System.out.println("2. Formato TXT");
        System.out.println("Ingrese una opcion");

        int opt = sc.nextInt();
        if(opt == 1) exportadorCsv.exportar("src\\test.csv", clienteServicio.getListaClientes());
        if(opt == 2) exportadorTxt.exportar("src\\test.text", clienteServicio.getListaClientes());


    }
    public void menuEditar(){

        System.out.println("Ingrese RUN del cliente a editar");
        String run = sc.next();
        Cliente client = clienteServicio.getListaClientes().stream().filter(cliente -> run.equals(cliente.getRun())).findAny().orElse(null);
        if(client != null){
            int opt = 0;
            do {
                System.out.println("--------------- EDITAR CLIENTE ---------------");
                System.out.println("Seleccione la opcion que desea hacer:");
                System.out.println("1. Cambiar estado del cliente");
                System.out.println("2. Editar los datos del cliente");
                System.out.println("3. Volver");
                System.out.println("Ingrese opcion:");
                opt = sc.nextInt();

                switch (opt){
                    case 1:
                        if (client.getCategoria() == CategoriaEnum.activo) {
                            System.out.println("Se cambio estado a inactivo");
                        } else {
                            System.out.println("Se cambio estado a activado");
                        }
                        camibarEstadoCliente(client);

                        opt = 3;
                        break;
                    case 2:
                        System.out.println("Editar datos");
                        editarCliente(client);
                        opt = 3;
                        break;
                    default:
                        break;

                }
            }while (opt != 3);
        }else{
            System.out.println("No existe cliente con ese rut");
        }
    }

    public void camibarEstadoCliente(Cliente cliente){
        if (cliente.getCategoria() == CategoriaEnum.activo) {
            cliente.setCategoria(CategoriaEnum.inactivo);
        } else {
            cliente.setCategoria(CategoriaEnum.activo);
        }
    }

    public void editarCliente(Cliente cliente){
        System.out.println("Ingresar nuevo RUN (mantener actual apretando enter):");
        String run = sc.next();
        System.out.println("Ingresar nuevo Nombre (mantener actual apretando enter):");
        String nombre = sc.next();
        System.out.println("Ingresar nuevo Apellido (mantener actual apretando enter):");
        String apellido = sc.next();
        System.out.println("Ingresar nuevo Años (mantener actual apretando enter):");
        String anios = sc.next();
        cliente.setRun(run == "" ? cliente.getRun() : run);
        cliente.setNombre(nombre == "" ? cliente.getNombre() : nombre);
        cliente.setApellido(apellido == "" ? cliente.getApellido() : apellido);
        cliente.setAnios(anios == "" ? cliente.getAnios() : anios);
    }

    public void listarCliente(){
        List<Cliente> listClientes = clienteServicio.getListaClientes();
        listClientes.forEach(cliente -> {
            System.out.println("--------------- DATOS DEL CLIENTE ---------------");
            System.out.println("RUN: " + cliente.getRun());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Apellido: " + cliente.getApellido());
            System.out.println("Años: " + cliente.getAnios());
            System.out.println("Categoria: " + cliente.getCategoria());
        });
    }

    public void agregarCliente(){
        Cliente cliente = new Cliente();
        System.out.println("Ingresar RUN del Cliente:");
        String run = sc.next();
        System.out.println("Ingresar NOMBRE del Cliente:");
        String nombre = sc.next();
        System.out.println("Ingresar APELLIDO del Cliente:");
        String apellido = sc.next();
        System.out.println("Ingresar AÑOS del Cliente:");
        String anios = sc.next();
        cliente.setRun(run);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setAnios(anios);
        cliente.setCategoria(CategoriaEnum.activo);
        clienteServicio.agregarCliente(cliente);
    }


}
