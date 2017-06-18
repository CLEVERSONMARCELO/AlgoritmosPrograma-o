package A_P_LISTA_5_Array;

import static A_P_LISTA_5_Array.Ex_22Matriz.leitor;

public class Ex_29Matriz {

    public static void main(String[] args) {
        int linha = leitor("Número de linhas da matriz: ");
        int coluna = leitor("Número de colunas: ");
        int[][] c = Ex_22Matriz.criaMatriz(linha, coluna);
        int[] vetor = vetor(linha);
        int[][] populaMrtiz = matriz(c, vetor);
        Ex_22Matriz.imprime(populaMrtiz);

    }

    static int[] vetor(int tamanho) {

        int vetor[] = new int[tamanho];
        System.out.println("");
        System.out.println("----Popular vetor---- \n");
        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor recebe: ", (i + 1));
            vetor[i] = Integer.parseInt(leitor.nextLine());
            System.out.println("");
        }
        return vetor;
    }

    static int[][] matriz(int[][] matriz, int[] vetor) {

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                matriz[linha][coluna] = vetor[linha];
            }
        }
        return matriz;
    }
}//class
