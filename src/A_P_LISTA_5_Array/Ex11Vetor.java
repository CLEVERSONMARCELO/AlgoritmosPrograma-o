package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex11Vetor {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int t = tamanho("Tamanho do vetor: ");
        double[] vetor = cria(t);
        double[] popula = popula(vetor);
        double verifMedia = verificaMedia(vetor);
        imprime(popula, verifMedia);
    }

    static int tamanho(String msg) {
        System.out.print(msg);
        int t = leitor.nextInt();
        System.out.println("");
        return t;
    }

    static double[] cria(int tamanho) {
        double[] vetor = new double[tamanho];
        return vetor;
    }

    static double[] popula(double[] vetor) {

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor recebe: ", (i + 1));
            vetor[i] = leitor.nextDouble();
        }
        return vetor;
    }

    static double verificaMedia(double[] vetor) {

        double media = 0, cont = 0, soma = 0;

        for (int i = 0; i < vetor.length; i++) {

            if ((vetor[i] % 2) == 0) {

                cont++;
                soma += vetor[i];
            }
        }
        media = soma / cont;
        return media;
    }

    static void imprime(double[] vetor, double media) {
        System.out.println("");

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > media) {

                System.out.printf("Posição %d com %.1f é maior que a média dos pares %.1f", (i + 1), vetor[i], media);
                System.out.println("");
            }
        }
    }
}
    
    
    

