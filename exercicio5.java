
/*Faça um programa que leia o número de termos e um valor positivo para X, calcule e mostre o valor da série a
seguir: */
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um número que iremos ");
        int n1;
        n1 = sc.nextInt();

        for (int i; i <= 11; i++) {
            resultado = (n1 / i + i);
        }

        System.out.println(i);

        sc.close();
    }

}
