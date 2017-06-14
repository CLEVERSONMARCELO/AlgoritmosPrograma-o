package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex12Vetor {
    
    public static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int t = Ex11Vetor.tamanho("Tamanho dos vetores A e B: ");
        int[] vetorA = Ex9Vetor.cria(t);
        int[] vetorB = Ex9Vetor.cria(t);
        int[] pVetorA = Ex9Vetor.popula1(vetorA);
        int[] pVetorB = Ex9Vetor.popula2(vetorB);
        double mediaA = Media(pVetorA);
        double mediaB = Media(pVetorB);
        int somaA = soma(vetorA);
        int somaB = soma(vetorB);
        verificaImprime(mediaA, somaA, mediaB, somaB);
    }

    static double Media(int[] vetor) {
        
        double media = 0, soma = 0;
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            
            soma += vetor[i];
            cont++;
        }
        media = soma / cont;
        return media;
    }
    
    static int soma(int[] vetor) {
        
        int soma = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            
            soma += vetor[i];
            
        }
        return soma;
    }
    
    static void verificaImprime(double mediaA, int somaA, double mediaB, int somaB) {
        
        if (mediaA > mediaB) {
            System.out.printf("Maior média é a do vetor A: %.1f ",mediaA);
            System.out.println("");
        } else {
            System.err.printf("Maior média é a do vetor B: %.1f ",mediaB);
            System.out.println("");
        }
        if (somaA > somaB) {
            System.out.println("Maior soma é a do vetor A: " + somaA);
        } else {
            System.err.println("Maior soma é a do vetor B: " + somaB);
        }
    }
}
