package cl.prueba.servicio;

import cl.prueba.modelo.CategoriaEnum;
import cl.prueba.modelo.Cliente;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExportadorCSV extends Exportador{

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
            System.out.println("Se ha exportado correctamente en formato CSV");
        }catch (Exception e){
            System.out.println(e);
        }

    }

    @Override
    public void importar(String fileName, List<Cliente> listaCliente) {
        List<String> list = new ArrayList<>();
        try{
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null){
                String[] elements = linea.split(",");
                Cliente cliente = new Cliente(elements[0], elements[1], elements[2], elements[3], CategoriaEnum.valueOf(elements[4]));
                listaCliente.add(cliente);
            }

            System.out.println("Se ha importado correctamente.");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
