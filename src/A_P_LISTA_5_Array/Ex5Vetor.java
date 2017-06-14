package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex5Vetor {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        
        int t = leitor();
        int [] cria = cria(t);
        int m = media(cria);
        imprimeMedia(m);
        
        
    }

    static int leitor() {

        System.out.print("Tamanho do vetor: ");
        int tamanho = leitor.nextInt();
        System.out.println("");
        return tamanho;
    }

    static int[] cria(int tamanho) {

        int[] vetor = new int[tamanho];
        return vetor;
    }

    static int media(int[] vetor) {

        int soma = 0, media;

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor recebe: ", i);
            vetor[i] = leitor.nextInt();

            soma += vetor[i];
        }
        media = soma / vetor.length;
        return media;
    }

    static void imprimeMedia(int media) {

        System.out.println("A média dos elementos do vetor é: " + media);
    }
}
