package cl.desafios;

import java.util.Scanner;

public class Resistencia {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Cuanta resistencia tiene");
        int CantidadResistencia = sc.nextInt();

        float calculoResistencias = ElegirResistencias(CantidadResistencia);

        float resistenciaTotal = 1 / calculoResistencias;

        System.out.println("La resistencia total es: " + resistenciaTotal);

    }

    static float ElegirResistencias(int cantidad) {
        int contador = 0;
        float suma = 0;

        do {
            System.out.println("Ingrese resistencia N°" + (contador + 1));
            float resistencia = sc.nextFloat();

            if (resistencia != 0) {
                float resultado = (1 / Math.abs(resistencia));
                System.out.println(resultado);
                suma += resultado;
                contador++;
            }

        } while (contador < cantidad);

        return suma;
    }
}
