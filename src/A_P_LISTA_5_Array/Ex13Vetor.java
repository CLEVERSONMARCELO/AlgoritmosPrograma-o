package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex13Vetor {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int t = Ex11Vetor.tamanho("Tamanho dos vetores A e B: ");
        int[] vetorA = Ex9Vetor.cria(t);
        int[] vetorB = Ex9Vetor.cria(t);
        int[] pVetorA = Ex9Vetor.popula1(vetorA);
        int[] pVetorB = Ex9Vetor.popula2(vetorB);
        int[] vetorC = vetorC(pVetorA, pVetorB);
        int[] populadoC = populaC(vetorC, pVetorA, pVetorB);
        imprime(populadoC);
    }

    static int[] vetorC(int[] vetorA, int[] vetorB) {

        int[] vetorC = new int[vetorA.length + vetorB.length];
        System.out.println("");
        return vetorC;
    }

    static int[] populaC(int[] vetorC, int[] vetorA, int[] vetorB) {

        for (int i = 0; i < vetorC.length; i++) {

            if (i < vetorA.length) {

                vetorC[i] = vetorA[i];

            } else if (i >= vetorA.length) {

                vetorC[i] = vetorB[i - vetorA.length];
            }
        }
        return vetorC;
    }

    static void imprime(int[] vetorC) {

        for (int i = 0; i < vetorC.length; i++) {

            System.out.printf("Posição %d do vetor C contém: %d ", (i + 1), vetorC[i]);
            System.out.println("");
        }
    }
}
