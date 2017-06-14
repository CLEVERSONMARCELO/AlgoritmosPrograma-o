package Exercicios_entregar06_06;

import java.util.Scanner;

public class Ex3 {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] criaMtriz = criaMatriz();
        int[][] popula = populaMatriz(criaMtriz);
        imprime(popula);
        imprimeMtriz(popula);
    }

    static int[][] criaMatriz() {

        System.err.println("--Cria matriz--");
        int[][] matriz = new int[2][3];

        return matriz;
    }

    static int[][] populaMatriz(int[][] criaMatriz) {
        System.err.println("---Popula matriz---");

        for (int i = 0; i < criaMatriz.length; i++) {
            for (int j = 0; j < criaMatriz[i].length; j++) {

                System.out.printf("Linha %d  coluna %d recebe: ", i, j);
                criaMatriz[i][j] = leitor.nextInt();
            }
        }
        return criaMatriz;
    }

    static void imprime(int[][] populaMatriz) {

        for (int i = 0; i < populaMatriz.length; i++) {
            for (int j = 0; j < populaMatriz[i].length; j++) {

                System.out.print(populaMatriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    static void imprimeMtriz(int[][] matrizPopulada) {

        int soma = 0;

        for (int i = 0; i < matrizPopulada.length; i++) {
            for (int j = 0; j < matrizPopulada[i].length; j++) {

                soma += matrizPopulada[i][j];
            }
        }
        System.out.println("Soma dos elementos " + soma);

    }

}
