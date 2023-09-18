/*3. Faça um programa que leia um número N e que indique quantos valores inteiros e positivos devem ser lidos a seguir.
Para cada número lido, mostre uma tabela contendo o valor lido e o fatorial desse valor.*/

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = sc.nextInt();
        long resultado;
        for (int i = 2; i <= n; i++) {
            resultado *= i; // mesmo que resultado = resultado * i

        }
        System.out.println(resultado);

        sc.close();
    }

}
