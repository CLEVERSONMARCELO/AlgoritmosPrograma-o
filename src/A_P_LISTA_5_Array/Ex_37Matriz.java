package A_P_LISTA_5_Array;

import static A_P_LISTA_5_Array.Ex_22Matriz.leitor;

public class Ex_37Matriz {
    
    public static void main(String[] args) {
        int linh = leitor("Número de linhas da matriz: ");
        int colu = leitor("Número de colunas: ");
        int[][] c = Ex_22Matriz.criaMatriz(linh,colu);
        int[][] p = popula(c);
        matriz(p);
        VerificaLinhaColunaNula(p, linh, colu);
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

        for (int linha = 0; linha < popula.length; linha++) {

            for (int coluna = 0; coluna < popula[linha].length; coluna++) {

                System.out.print(popula[linha][coluna] + "  ");
            }
            System.out.println("  ");
        }
    }
    static void VerificaLinhaColunaNula(int[][] popula, int linh, int colu) {

        int linhaNulas = 0, colunaNula = 0, l = 0, c = 0;

        for (int linha = 0; linha < colu; linha++) {
            int zeroslinhas = 0, zerosColunas = 0;

            for (int coluna = 0; coluna < linh; coluna++) {

                if (popula[linha][coluna] == 0) {
                    zeroslinhas++;//somar elementos zeros da linha
                }
                if (popula[coluna][linha] == 0) {
                    zerosColunas++;//somar elementos zeros da coluna
                }
            }
            if (zeroslinhas == linh) {//compara linhas nulas com quantidade de linhas
                linhaNulas++;//conta quantas linhas estão nulas (com elemento 0 )
            }
            if (zerosColunas == colu) {//compara colunas nulas com quantidade de colunas
                colunaNula++;//conta quantas colunas estão nulas...
            }
        }
        System.out.println("Linhas vazias: " + linhaNulas);
        System.out.println("Colunas vazias: " + colunaNula);
    }
}
