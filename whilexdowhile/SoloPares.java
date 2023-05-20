package cl.desafios.whilexdowhile;

import java.util.Scanner;

public class SoloPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(i * 2);
        }
    }
}
