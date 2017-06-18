package A_P_LISTA_5_Array;

import static A_P_LISTA_5_Array.Ex_22Matriz.leitor;
import static A_P_LISTA_5_Array.Ex_37Matriz.popula;

public class Ex_41Matriz {

    public static void main(String[] args) {
        int linh = leitor("Número de linhas da matriz: ");
        int colu = leitor("Número de colunas: ");
        int[][] c = Ex_22Matriz.criaMatriz(linh, colu);
        int[][] p = popula(c);
        Ex_37Matriz.matriz(p);
        verifica(p);

    }

    static void verifica(int[][] p) {
        int maior = 0;

        for (int i = 0; i < p.length; i++) {

            for (int j = 0; j < p.length; j++) {

                if (p[i][j] > maior) {
                    maior = p[i][j];
                }
            }
            System.out.println(" ");
        }
        System.out.printf("O maior número dentro da matriz é: %d", maior);
        System.out.println(" \n\n\n");
    }
}//class
