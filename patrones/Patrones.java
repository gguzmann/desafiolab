package cl.desafios.patrones;

import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            if (i % 2 == 0) {
                System.out.printf("*");
            } else {
                System.out.printf(".");
            }
        }

        System.out.println("");

        for (int i = 1; i < numero; i++) {
            if (i % 4 == 1) System.out.printf("1");
            if (i % 4 == 2) System.out.printf("2");
            if (i % 4 == 3) System.out.printf("3");
            if (i % 4 == 0) System.out.printf("4");

        }

        System.out.println("");

        for (int i = 1; i < numero; i++) {
            if (i % 3 == 0) {
                System.out.printf("*");
            } else {
                System.out.printf("|");
            }
        }

    }
}
