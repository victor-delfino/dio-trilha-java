package victor.primeirasemana;

import java.util.Scanner;
/* Leia um numero entre 2 a 16, com uma mensagem caso seja invalido

 */

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 2 || nota > 16) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt(); // Enquanto a nota for menor que 2 ou maior que 16, retorna para o while

        }
    }
}
