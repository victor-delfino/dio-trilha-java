package victor.primeirasemana;

import java.util.Scanner;

/* faça um programa que leia 5 números
informe o maior número e a média desses números.
 */
public class MenorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maiorn = 0;
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maiorn) {
                maiorn = numero;
                // se a gente quiser que o número maior fosse impresso a cada loop, iria aqui dentro
            }

        }
        System.out.println("A média foi: " + soma/5);
        System.out.println("O número maior foi: " + maiorn);
    }
}
