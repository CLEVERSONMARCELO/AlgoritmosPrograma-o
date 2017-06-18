package A_P_LISTA_5_Array;

import static A_P_LISTA_5_Array.Ex_22Matriz.leitor;
import static A_P_LISTA_5_Array.Ex_37Matriz.popula;

public class Ex_40Matriz {

    public static void main(String[] args) {
        int linh = leitor("Número de linhas da matriz: ");
        int colu = leitor("Número de colunas: ");
        int numero = Ex1Vetor.leitorInteiro("Número inteiro: ");
        int[][] c = Ex_22Matriz.criaMatriz(linh, colu);
        int[][] p = popula(c);
        Ex_37Matriz.matriz(p);
        verifica(p, linh, colu, numero);
        
    }
    static void verifica(int[][] p, int linha, int coluna, int numero) {

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {

                if (p[i][j] == numero) {
                    System.out.printf("Número inteiro %d está na posição:  linha %d coluna %d da matriz",numero ,i, j);
                }
            }
            System.out.println(" ");
        }
    }
}//class
