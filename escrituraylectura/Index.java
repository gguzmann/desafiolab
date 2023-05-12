package cl.desafios.escrituraylectura;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Index {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del archivo");
        String nameFile = sc.nextLine();
        String path = "src\\directorio";

        crearArchivo(path, nameFile);

        System.out.println("Que palabra desea buscar?");
        String texto = sc.nextLine();
        buscarTexto(path + "\\" + nameFile, texto);
    }

    public static void buscarTexto(String nameFile, String filtro) {

        List<String> lista = new ArrayList<>();

        try {
            File file = new File(nameFile + ".txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null)
                lista.add(linea);

            List<String> listaFiltrada = lista.stream().filter(p -> p.equals(filtro)).collect(Collectors.toList());
            System.out.println("cantidad de repeticiones del texto -> " + listaFiltrada.size());

        } catch (Exception e) {
            System.out.println("Error al leer archivo");
        }


    }

    public static void crearArchivo(String directorio, String fichero) {

        List<String> lista = new ArrayList<>();

        lista.add("Perro");
        lista.add("Gato");
        lista.add("Juan");
        lista.add("Daniel");
        lista.add("Juan");
        lista.add("Gato");
        lista.add("Perro");
        lista.add("Camila");
        lista.add("Daniel");
        lista.add("Camila");

        String formatearLista = "";
        for (int i = 0; i < lista.size(); i++) {
            formatearLista += lista.get(i) + "\n";
        }


        try {
            File carpeta = new File(directorio);
            if (!carpeta.exists()) {
                carpeta.mkdir();
            } else {
                System.out.println("Carpeta ya existe");
            }

            File file = new File(directorio + "\\" + fichero + ".txt");
            if (!file.exists()) {
                file.createNewFile();
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(formatearLista);
                bw.close();
            } else {
                System.out.println("Archivo ya existe");
            }
        } catch (Exception e) {
            System.out.println("Error al crear archivo");
        }

    }
}
