package A_P_LISTA_5_Array;

import static A_P_LISTA_5_Array.Ex_22Matriz.leitor;

public class Ex_24Matriz {

    public static void main(String[] args) {
        int linha = leitor("Número de linhas da matriz: ");
        int coluna = leitor("Número de colunas: ");
        int[][] c = Ex_22Matriz.criaMatriz(linha, coluna);
        int[][] p = popula(c);
        Ex_22Matriz.imprime(p);
    }

    static int[][] popula(int[][] matriz) {

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                if ((coluna % 2) == 0) {
                    matriz[linha][coluna] = 4;
                } else {
                    matriz[linha][coluna] = 7;
                }
            }
        }
        return matriz;
    }
}//class