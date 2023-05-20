package cl.desafios.whilexdowhile;

import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        int i = 0;
        int acumuladorImpares = 0;
        while (i < numero) {
            if (i % 2 != 0) {
                acumuladorImpares += i;
            }
            i++;

        }
        System.out.println(acumuladorImpares);
    }
}
