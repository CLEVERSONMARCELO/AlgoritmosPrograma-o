package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex8Vetor {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int t = leitor("Tamanho do vetor: ");
        int numero = leitor("Número inteiro: ");
        int[] cria = cria(t);
        int[] p = popula(cria);
        Verificaimprime(numero, p);
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

    static int[] popula(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor recebe: ", (i+1));
            vetor[i] = leitor.nextInt();
            System.out.println("");
        }
        return vetor;
    }

    static void Verificaimprime(int numero, int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] == numero) {
                System.out.printf("o número %d está presente no vetor", numero);
                System.out.println("");
                break;
            } else {
                System.err.printf("Número %d não está presente no vetor", numero);
                System.out.println("");
                break;
            }
        }

    }
}
