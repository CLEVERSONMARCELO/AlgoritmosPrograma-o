package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex6Vetor {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int t = leitor();
        int[] v = cria(t);
        int [] p = popula(v);
        imprime(p);
        
    }

    static int leitor() {
        System.out.print("Tamnho do vetor: ");
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

            System.out.printf("Posição %d do vetor recebe: ",i);
            vetor[i] = leitor.nextInt();
        }
        System.out.println(" ");
        return vetor;
    }

    static void imprime(int[] populado) {

        for (int i = 0; i < populado.length; i++) {
            System.out.printf("Posição %d do vetor possui o produto: %d", (i + 1), populado[i]);
            System.out.println("");
        }
    }
}
