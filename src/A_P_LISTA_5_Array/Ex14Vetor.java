package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex14Vetor {
public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int t = Ex1Vetor.leitorInteiro("Tamanho dos vetores A e B: ");
        int[] vetorA = Ex9Vetor.cria(t);
        int[] vetorB = Ex9Vetor.cria(t);
        System.out.println("---- Vetor A ----");
        int[] pVetorA = Ex1Vetor.populaVetor(vetorA);
        System.out.println("---- Vetor B ----");
        int[] pVetorB = Ex1Vetor.populaVetor(vetorB);
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
        
        int cont = 0;
        
        for (int i = 0; i < vetorC.length; i += 2) {
            
            vetorC [i] = vetorA[cont];
            cont++;
        }
        cont = 0;
        
        for (int i = 1; i < vetorC.length; i +=2) {
            
            vetorC [i] = vetorB[cont];
            cont++;
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
