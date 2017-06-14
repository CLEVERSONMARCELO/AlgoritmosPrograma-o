package Entregar_27_05;

import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {

        int tamanho1 = tamanhoVetor("Tamanho dos vetores 1 e 2 :  ");
        int[] vetor1 = vetor1(tamanho1);
        int[] vetor2 = vetor2(tamanho1);
        int[] popula1 = populaVetor1(vetor1);
        int[] popula2 = populaVetor2(vetor2);
        vetor3(vetor1, vetor2);
    }

    static int tamanhoVetor(String msg) {
        System.out.print(msg);
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        System.out.println("");
        return t;
    }

    static int[] vetor1(int tamanho1) {

        int[] vetor1 = new int[tamanho1];

        return vetor1;
    }

    static int[] vetor2(int tamanho2) {

        int[] vetor2 = new int[tamanho2];

        return vetor2;
    }

    static int[] populaVetor1(int[] vetor1) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("--- VETOR 1 ---");
        for (int i = 0; i < vetor1.length; i++) {

            System.out.print("Posição " + i + " do vetor 1 recebe: ");
            vetor1[i] = leitor.nextInt();

        }
        System.out.println("");
        return vetor1;
    }

    static int[] populaVetor2(int[] vetor2) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("--- VETOR 2 ---");
        for (int i = 0; i < vetor2.length; i++) {

            System.out.print("Posição " + i + " do vetor 2 recebe: ");
            vetor2[i] = leitor.nextInt();

        }
        System.out.println("");
        return vetor2;
    }

    static void vetor3(int[] vetor1, int[] vetor2) {

        int[] vetor3 = new int[vetor1.length];

        int soma = vetor3[0];

        for (int i = 0; i < vetor3.length; i++) {

            vetor3[i] = vetor1[i] + vetor2[i];

            soma += vetor3[i];
        }
        System.out.println("A soma das posiçoes dos 2 vetores é: " + soma);
    }
}
