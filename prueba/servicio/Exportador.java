package cl.prueba.servicio;

import cl.prueba.modelo.Cliente;

import java.util.List;

public abstract class Exportador {
    public abstract void exportar(String fileName, List<Cliente> listaCliente);
    public abstract void importar(String fileName, List<Cliente> listaCliente);

}
