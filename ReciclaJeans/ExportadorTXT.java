package cl.ReciclaJeans;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class ExportadorTXT extends Exportador {
    @Override
    public void exportar(String fileName, List<Producto> listaProducto) {
        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Producto producto : listaProducto){
                bw.write(producto.getArticulo() + "," +
                        producto.getPrecio() + "," +
                        producto.getDescripcion() + "," +
                        producto.getCodigo() +
                        producto.getTalla() +
                        producto.getColor() +
                        "\n");
            }
            bw.close();
            System.out.println("Se ha exportado correctamente en formato TXT");
        }catch (Exception e){
            System.out.println(e);
        }

    }

}
