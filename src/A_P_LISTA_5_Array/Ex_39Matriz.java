package A_P_LISTA_5_Array;

import static A_P_LISTA_5_Array.Ex_22Matriz.leitor;
import static A_P_LISTA_5_Array.Ex_37Matriz.popula;
import java.util.Scanner;

public class Ex_39Matriz {
    public static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Matriz 1");
        int linham1 = leitor("Número de linhas da matriz: ");
        int colunam1 = leitor("Número de colunas: ");
        int[][] criaMatriz1 = Ex_22Matriz.criaMatriz(linham1,colunam1);
        int[][] populaMatriz1 = popula(criaMatriz1);
        System.out.println("Matriz 2");
        int linham2 = leitor("Número de linhas da matriz: ");
        int colunam2 = leitor("Número de colunas: ");
        int [] [] criaPopulaMatriz2 = matriz2(linham2, colunam2);
        System.out.println("Matriz 1\n");
        Ex_37Matriz.matriz(populaMatriz1);
        System.out.println("Matriz 2\n");
        Ex_37Matriz.matriz(criaPopulaMatriz2);
        
    }
    
    static int[][] matriz2(int linh, int colu) {

        int[][] matriz = new int[linh][colu];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                System.out.printf("Linha %d coluna %d recebe: ", i,j);
                matriz[i][j] = Integer.parseInt(leitor.nextLine());
            }
            System.out.println("");
        }
        return matriz;
    }
    
}//class