package Array_Multidimensional;

import java.util.Random;

public class Array_Tabuleiro {

    public static void main(String[] args) {

        Random sorteio = new Random();

        String[][] tabuleiro = new String[3][3];
        //INICIA O TABULEIRO VAZIO (tabuleiro [i] [j] = ".";)
        for (int i = 0; i < tabuleiro.length; i++) {

            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = " . ";
            }
        }
        //SORTEIA UMA POSIÇÃO DO TABULEIRO
        int linha = sorteio.nextInt(tabuleiro.length);
        int coluna = sorteio.nextInt(tabuleiro[linha].length);
        tabuleiro[linha][coluna] = " # ";

        //IMPRIME O TABULEIRO
        for (int i = 0; i < tabuleiro.length; i++) {
            //IMPRIME A LINHA i
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");//PRINT
            }
            System.out.println();//PARA CADA LINHA IMPRESSA, PULA UMA LINHA
        }
    }
}
