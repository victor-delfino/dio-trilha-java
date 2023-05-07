package victor.primeirasemana;

import java.util.Random;

/* faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os em um vetor.
Ao final mostre os números e seus sucessores
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20]; // criamos um vetor assim, pois ele É UM OBJETO

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100); // bound é o limite, pode ir até o numero 100
            numerosAleatorios[i] = numero;

        }
        System.out.print("\nNúmeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }
        System.out.print("\nAntecessores dos Números Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero-1) + " ");
        }
        System.out.print("\nSucessodres dos Números Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero+1) + " ");
        }
    }
}
