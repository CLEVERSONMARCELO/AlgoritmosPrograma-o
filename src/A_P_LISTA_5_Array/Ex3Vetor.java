package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex3Vetor {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

    int t = leitor();
    int [] c = criaVetor(t);
    int pV = populaVerifica(c);
        imprimeMaior(pV);
        
    }

    static int leitor() {
        System.out.print("Tamanho do vetor: ");
        int tamanho = leitor.nextInt();
        System.out.println("");
        return tamanho;
    }

    static int[] criaVetor(int tamanho) {

        int[] vetor = new int[tamanho];
        return vetor;
    }

    static int populaVerifica(int[] vetor) {

        int maior = 0;

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor recebe: ",i);
            vetor[i] =  leitor.nextInt();
            
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    static void imprimeMaior(int maior) {
        System.out.println("O maior elemento do vetor é: " + maior);
    }
}
