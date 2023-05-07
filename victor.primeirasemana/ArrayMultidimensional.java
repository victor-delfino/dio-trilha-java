package victor.primeirasemana;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){ // navegando na matriz; primeira linha da matriz
            for(int j = 0; j < M.length; j++){ // elementos da linha, por isso precisa ser menor que M[i]
            M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M ) { // vai pegar a primeira linha e vai navegar por ela
            for (int coluna : linha ) { // insere os elementos na primeira linha
                System.out.print(coluna + " ");

                System.out.println();
            }
        }
    }
}
