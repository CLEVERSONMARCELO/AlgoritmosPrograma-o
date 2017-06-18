package A_P_LISTA_5_Array;

import static A_P_LISTA_5_Array.Ex_22Matriz.leitor;

public class Ex_27Matriz {

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
                
                matriz [linha] [coluna] = linha +coluna; 
            }
        }
        return matriz;
    }

    
}
