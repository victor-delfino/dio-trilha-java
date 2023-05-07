package victor.primeirasemana;

/* Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa
 */
public class VetorOrdemInversa {
    public static void main(String[] args) {

        int [] vetor = {-3, -30, 15, 50, 6, 4};

        System.out.println("Vetor: ");
        for (int b = 0; b < vetor.length; b++) {
            System.out.println(vetor[b] + " ");

        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length - 1);i >= 0; i --){
            System.out.println(vetor[i] + " ");
        }
    }
}
