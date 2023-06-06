package cl.prueba.servicio;

import cl.prueba.modelo.Cliente;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class ExportadorTXT extends Exportador{
    @Override
    public void exportar(String fileName, List<Cliente> listaCliente) {
        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Cliente client : listaCliente){
                bw.write(client.getRun() + "," + client.getNombre() + "," + client.getApellido() + "," + client.getAnios() + "\n");
            }
            bw.close();
            System.out.println("Se ha exportado correctamente en formato TXT");
        }catch (Exception e){
            System.out.println(e);
        }

    }

    @Override
    public void importar(String fileName, List<Cliente> listaCliente) {

    }
}
