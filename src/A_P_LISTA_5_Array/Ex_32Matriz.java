package A_P_LISTA_5_Array;

import static A_P_LISTA_5_Array.Ex_22Matriz.leitor;

public class Ex_32Matriz {
    
    public static void main(String[] args) {
        int linha = leitor("Número de linhas da matriz: ");
        int coluna = leitor("Número de colunas: ");
        int[][] c = Ex_22Matriz.criaMatriz(linha, coluna);
        int[][] p = popula(c);
        matriz(p);
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
        int soma = 0;
        
        for (int linha = 0; linha < popula.length; linha++) {

            for (int coluna = 0; coluna < popula[linha].length; coluna++) {
               
                System.out.print(popula [linha] [coluna]+ " ");

                if ((coluna % 2) != 0) {

                    soma += popula[linha][coluna];
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("A soma da das colunas impares é: "+ soma);
    }
}