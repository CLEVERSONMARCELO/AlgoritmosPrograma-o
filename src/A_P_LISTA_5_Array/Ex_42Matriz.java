package A_P_LISTA_5_Array;

import static A_P_LISTA_5_Array.Ex_22Matriz.leitor;
import static A_P_LISTA_5_Array.Ex_37Matriz.popula;

public class Ex_42Matriz {
    
    public static void main(String[] args) {
        System.out.println("Matriz A");
        int nlinhas = leitor("Número de linhas da matriz: ");
        int ncolunas = leitor("Número de colunas: ");
        int[][] cm1 = Ex_22Matriz.criaMatriz(nlinhas, ncolunas);
        int[][] p1 = popula(cm1);
        int maior1 = verifica(p1);
        
        System.out.println("Matriz B");
        int nlinhas2 = leitor("Número de linhas da matriz: ");
        int ncoluna2 = leitor("Número de colunas: ");
        int[][] cm2 = Ex_22Matriz.criaMatriz(nlinhas2, ncoluna2);
        int[][] p2 = popula(cm2);
        int maior2 = verifica(p2);
        System.out.println("");
        Ex_37Matriz.matriz(p1);
        System.out.println("");
        Ex_37Matriz.matriz(p2);
        System.out.println("");
        produto(maior1, maior2);
        
    }
    
    static int verifica(int[][] p) {
        int maior = 0;
        
        for (int i = 0; i < p.length; i++) {
            
            for (int j = 0; j < p[i].length; j++) {
                
                if (p[i][j] > maior) {
                    maior = p[i][j];                    
                }
            }
            System.out.println(" ");
        }
        return maior;
    }
    
    static void produto(int maior1, int maior2) {
        
        int produto = maior1 * maior2;
        System.out.printf("Maior número de A: %d pelo maior número de B: %d é o produto:"
                + " %d", maior1, maior2, produto);
    }
}
