package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex_36Matriz {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Ex_22Matriz.leitor("Tamanho da matriz: ");
        int[][] c = criaMatriz(t);
        int[][] p = popula(c);
        matriz(p);
        ElementosDiagonal(p);
    }

    static int[][] criaMatriz(int tamanho) {

        int[][] matriz = new int[tamanho][tamanho];
        return matriz;
    }

    static int[][] popula(int[][] matriz) {
        System.out.println("");
        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                System.out.printf("Linha %d coluna %d recebe: ", linha, coluna);
                matriz[linha][coluna] = Integer.parseInt(leitor.nextLine());
            }
            System.out.println("");
        }
        return matriz;
    }

    static void matriz(int[][] popula) {

        for (int linha = 0; linha < popula.length; linha++) {

            for (int coluna = 0; coluna < popula[linha].length; coluna++) {

                System.out.print(popula[linha][coluna] + "  ");
            }
            System.out.println("  ");
        }
    }

    static void ElementosDiagonal(int[][] popula) {

        System.out.println("Elementos da diagonal principal:");

        for (int linha = 0; linha < popula.length; linha++) {

            for (int coluna = 0; coluna < popula[linha].length; coluna++) {

                if (linha == coluna) {

                    System.out.printf(" %d ", popula[linha][coluna]);
                }
            }
            System.out.println(" ");
        }
    }
}
