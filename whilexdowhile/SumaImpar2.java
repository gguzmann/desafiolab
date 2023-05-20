package cl.desafios.whilexdowhile;

import java.util.Scanner;

public class SumaImpar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero minimo");
        int min = sc.nextInt();
        System.out.println("Ingrese un numero maximo");
        int max = sc.nextInt();
        
        int acumuladorImpares = 0;
        for (int i = min; i < max; i++) {

            if (i % 2 != 0) {
                acumuladorImpares += i;
            }
        }

        System.out.println(acumuladorImpares);
    }
}
