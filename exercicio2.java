/*2. Faça um programa que leia um valor N inteiro e positivo, calcule e mostre o valor de E, conforme a fórmula a seguir:
E = 1 + 1/1! + 1⁄2! + 1/3! + ... + 1/N!*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("digite um número");
        n = sc.nextInt();
        if (n <= 3) {
            System.out.println("é primo");

        } else {
            boolean ehPrimo = true;

            for (int div = 2; div < (n - 1); div++) {
                if (n % div == 0) {
                    System.out.println("consegui dividir por" + div);
                    ehPrimo = false;
                }
            }
            if (ehPrimo) {
                System.out.println("é primo");

            } else {
                System.out.println("não é primo");
            }
        }

        sc.close();
    }

}
