package cl.prueba.servicio;

import cl.prueba.modelo.Cliente;

import java.util.List;

public class ClienteServicio {
    private List<Cliente> listaClientes;

    public ClienteServicio(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void agregarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public void editarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }



}
