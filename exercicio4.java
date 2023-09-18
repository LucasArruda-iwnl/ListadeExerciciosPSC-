
/*4. Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos
os seguintes dados:
a) Código da cidade;
b) Número de veículos de passeio (em 2007)
c) Número de acidentes de trânsito com vítimas (em 2007)
Deseja-se saber:
a) Qual o maior e menor índice de acidentes de transito e a que cidades pertencem
b) Qual a média de veículos nas cinco cidades juntas
c) Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio */
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, faremos a média das cidades mencionadas ");
        int c1, c2, veiculos1, veiculos2, a1, a2, resultadoA, ra, resultadob, rc;

        System.out.println("Digte o código da sua cidade");
        c1 = sc.nextInt();
        System.out.println("cidade dois por favor");
        c2 = sc.nextInt();
        System.out.println("obrigado agora por favor me de os veiculos da cidade um");
        veiculos1 = sc.nextInt();
        System.out.println("Agora os veiculos da cidade dois");
        veiculos2 = sc.nextInt();
        System.out.println("agora os acidentes");
        a1 = sc.nextInt();
        System.out.println("acidentes cidade dois");
        a2 = sc.nextInt();

        resultadoA = (veiculos1 / a1);

        ra = (veiculos2 / a2);

        resultadob = (veiculos1 + veiculos2);

        rc = (resultadoA / ra) / 2000;

        System.out.println("a cidade " + c1 + "possui" + resultadoA + "a segunda cidade " + c2 + "teve" + ra
                + "de media de acidentes");

        if (ra > resultadoA) {
            System.out.println("a segunda cidade possui um indice maior");

        } else {
            System.out.println("a primeira cidade possui um resultado maior");
        }

        sc.close();
    }

}
