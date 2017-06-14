package Exercicios_entregar06_06;

import java.util.Scanner;

public class Ex1 {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int t = tamanho();
        int[][] matriz1 = criamatriz(t);
        int[][] matriz2 = criamatriz(t);
        matriz1 = populamatriz1(matriz1);
        impriSoma(matriz1);
        matriz2 = populamatriz2(matriz2);
        impriSoma(matriz2);
        int[][] matriz3 = criamatriz(t);
        int[][] somaMatriz = somaMatrizes(matriz1, matriz2, matriz3);
        impriSoma(somaMatriz);

    }

    static int tamanho() {
        System.out.print("tamanho da matriz: ");
        int tamanho = leitor.nextInt();
        return tamanho;
    }

    static int[][] criamatriz(int tamanho) {

        int[][] matriz = new int[tamanho][tamanho];

        return matriz;
    }

    static int[][] populamatriz1(int[][] matriz) {

        System.out.println("---- Matriz 1 ---- ");

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                System.out.printf("linha %d coluna %d da matriz 1 recebe: ", linha, coluna);
                matriz[linha][coluna] = leitor.nextInt();
            }
        }
        return matriz;
    }

    static int[][] populamatriz2(int[][] matriz) {

        System.out.println("---- Matriz 2 ---- ");

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                System.out.printf("linha %d coluna %d da matriz 2 recebe: ", linha, coluna, matriz);
                matriz[linha][coluna] = leitor.nextInt();
            }
        }
        return matriz;
    }

    static int[][] somaMatrizes(int[][] matriz1, int[][] matriz2, int matriz3[][]) {

        System.out.println("---SOMA DAS MATRIZES---\n");

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {

                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matriz3;
    }

    static void impriSoma(int[][] matriz3) {

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {

                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
