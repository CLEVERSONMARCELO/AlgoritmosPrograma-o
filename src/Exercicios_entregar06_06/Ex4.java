package Exercicios_entregar06_06;

import java.util.Scanner;
public class Ex4 {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] cria = criaMatriz();
        int[][] popula = populaMatriz(cria);
        int[][] modificaDiagonal = identificarDiagonal(popula);
        imprimeSoma(modificaDiagonal);

    }

    static int[][] criaMatriz() {

        int[][] matriz4x4 = new int[4][4];

        return matriz4x4;
    }

    static int[][] populaMatriz(int[][] criaMatriz) {

        for (int i = 0; i < criaMatriz.length; i++) {
            for (int j = 0; j < criaMatriz[i].length; j++) {

                System.out.printf("Linha %d coluna %d recebe: ", i, j);
                criaMatriz[i][j] = leitor.nextInt();

            }

        }
        return criaMatriz;
    }

    static int[][] identificarDiagonal(int[][] criaMatriz) {

        for (int i = 0; i < criaMatriz.length; i++) {
            for (int j = 0; j < criaMatriz[i].length; j++) {

                if (criaMatriz[i] == criaMatriz[j]) {
                    criaMatriz[i][j] = 0;
                }
            }
        }
        return criaMatriz;
    }

    static void imprimeSoma(int[][] identificarDiagonal) {

        int soma = 0;

        System.out.println(" ");
        for (int i = 0; i < identificarDiagonal.length; i++) {
            for (int j = 0; j < identificarDiagonal[i].length; j++) {

                System.out.print(identificarDiagonal[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        soma += identificarDiagonal[1][0];
        soma += identificarDiagonal[2][0];
        soma += identificarDiagonal[3][0];
        soma += identificarDiagonal[2][1];
        soma += identificarDiagonal[3][1];
        soma += identificarDiagonal[3][2];

        System.out.println("Soma elementos abaixo da diagonal principal: " + soma);
    }
}
