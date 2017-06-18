package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex1Vetor {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int tamanho = leitor("Tamanho do Vetor: ");
        int[] cria = criaVetor(tamanho);
        int[] vetorPopulado = populaVetor(cria);
        imprimeVetor(vetorPopulado);
    }

    static int leitor(String msg) {

        System.out.print(msg);
        int numero = leitor.nextInt();
        return numero;
    }

    static int[] criaVetor(int leitor) {
        System.out.println("");
        int[] vetor = new int[leitor];

        return vetor;
    }

    static int[] populaVetor(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d recebe: ", (i + 1));
            vetor[i] = leitor.nextInt();
        }
        return vetor;
    }

    static void imprimeVetor(int[] vetor) {
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor contém: %d \n", (i + 1), vetor[i]);
        }
    }

}
