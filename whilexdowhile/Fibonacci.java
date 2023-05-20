package cl.desafios.whilexdowhile;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = sc.nextInt();
        int sumaFibonacci = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < numero; i++) {
            int resultado = 0;
            resultado = num1 + num2;
            if (i > 0) {
                num1 = i - 1;
            }

            if (i > 1) {
                num2 = i - 2;
            }
            System.out.println(resultado);
            sumaFibonacci += resultado;

        }

        System.out.println(sumaFibonacci);

    }
}
