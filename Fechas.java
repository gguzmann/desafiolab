package cl.desafios;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fechas {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> fecha1 = obtenerFecha();
        List<Integer> fecha2 = obtenerFecha();
        compararFechas(fecha1, fecha2);
    }

    public static void compararFechas(List<Integer> fecha1, List<Integer> fecha2) {
        LocalDate fecha11 = LocalDate.of(fecha1.get(2), fecha1.get(1), fecha1.get(0));
        LocalDate fecha22 = LocalDate.of(fecha2.get(2), fecha2.get(1), fecha2.get(0));

        if (fecha11.compareTo(fecha22) > 0) {
            System.out.println("Fecha 2 es más antigua.");
        } else if (fecha11.compareTo(fecha22) < 0) {
            System.out.println("Fecha 1 es más antigua.");
        } else {
            System.out.println("Ambas fechas son iguales");
        }
    }

    public static List<Integer> obtenerFecha() {
        boolean ok = false;
        String fecha;
        do {
            System.out.println("Ingrese una fecha con el siguiente formato: DD/MM/AAAA");
            fecha = sc.next();
            if (fecha.length() != 10 || !fecha.contains("/")) {
                System.out.println("Fecha con formato incorrecto.");
            } else {
                ok = true;
            }
        } while (!ok);


        System.out.println("Fecha ingresada correctamente.");
        return Arrays.stream(fecha.split("/"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
