package cl.desafios.whilexdowhile;

import java.util.Scanner;

public class SoloPares2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();

        for (int i = 1; i < numero + 1; i++) {
            System.out.println(i * 2);
        }
    }
}
