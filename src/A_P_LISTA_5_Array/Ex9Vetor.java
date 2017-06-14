package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex9Vetor {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int t = leitor("Tamanho dos vetores A e B: ");
        int[] cria = cria(t);
        int[] popula1 = popula1(cria);
        int[] popula2 = popula2(cria);
        int[] vetor3 = vetor3(popula1, popula2);
        imprimeVetor3(vetor3);
    }

    static int leitor(String msg) {
        System.out.print(msg);
        int t = leitor.nextInt();
        System.out.println("");
        return t;
    }

    static int[] cria(int t) {
        int[] vetor = new int[t];
        return vetor;
    }

    static int[] popula1(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor A recebe: ", (i + 1));
            vetor[i] = leitor.nextInt();
        }
        System.out.println("");
        return vetor;
    }

    static int[] popula2(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor B recebe: ", (i + 1));
            vetor[i] = leitor.nextInt();
        }
        System.out.println("");
        return vetor;
    }

    static int[] vetor3(int[] vetor1, int[] vetor2) {

        int[] vetor3 = new int[vetor1.length];

        for (int i = 0; i < vetor3.length; i++) {

            vetor3[i] = vetor1[i] * vetor2[i];
        }
        return vetor3;
    }

    static void imprimeVetor3(int[] vetor3) {
        System.out.println("");
        for (int i = 0; i < vetor3.length; i++) {

            System.out.printf("Posição %d do vetor C contém: %d", (i + 1), vetor3[i]);
            System.out.println("");
        }
    }
}
