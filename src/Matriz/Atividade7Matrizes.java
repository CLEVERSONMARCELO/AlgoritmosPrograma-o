package Matriz;

import java.util.Scanner;

public class Atividade7Matrizes {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

       int t = tamanho();
       int [] [] matriz = criaVetor(t);
       matriz = populaMatriz(matriz);
        imprimeMatriz(matriz);
 
    }
    
    static int tamanho (){
        int tamanho;
        System.out.println("---Tamanho--- "); 
        System.out.print("Linha/coluna: ");
        tamanho = leitor.nextInt();
        return tamanho;
    } 
    
    static int[][] criaVetor(int tamanho) {

        System.out.println("Cria matriz");
        int[][] matriz = new int[tamanho][tamanho];

        return matriz;
    }
    
    public static int[][] populaMatriz(int[][] matriz) {

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (linha == coluna) {
                    matriz[linha][coluna] = 0;
                } else if ((linha + coluna) == (matriz.length - 1)) {
                    matriz[linha][coluna] = 1;
                } else {
                    matriz[linha][coluna] = 2;
                }
            }
        }
        return matriz;
    }
   
    static void imprimeMatriz ( int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
