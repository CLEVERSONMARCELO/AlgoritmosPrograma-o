package Matriz;

import java.util.Scanner;

public class Matriz1 {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
     
        int linhas = tamanho();
        int colunas = tamanho();
        int matriz[][] = criaMatriz(linhas, colunas);
        matriz = populamatriz(matriz);
        imprimeMatriz(matriz);
        

    }
    
    static int tamanho (){
        int tamanho;
        System.out.println("---Tamanho--- "); 
        System.out.print("Linha/coluna: ");
        tamanho = leitor.nextInt();
        return tamanho;
    }
    
    static int [] [] criaMatriz (int linhas, int colunas){
       
        System.err.println("Cria matriz");
       
        int [] [] matriz = new int [linhas] [colunas] ;
        
        return matriz;
    }
    
    static int[][] populamatriz(int[][] matriz) {
        System.err.println("Popula matriz");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.printf("Matriz [%d] [%d]: ", i, j);

                matriz[i][j] = leitor.nextInt();
                System.out.printf("\n");//pula linha

            }
        }
        return matriz;
    }
    
     static void imprimeMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.printf("Matriz [%d] [%d]:  %d", i, j, matriz[i][j]);
                System.out.println(" ");

            }
        }
    }
}

    