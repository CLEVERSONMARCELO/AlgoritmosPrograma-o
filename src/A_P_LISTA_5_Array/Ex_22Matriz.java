package A_P_LISTA_5_Array;
import java.util.Scanner;
public class Ex_22Matriz {

    public static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
     
        int linha = leitor("Número de linhas da matriz: ");
        int coluna = leitor("Número de colunas: ");
        int [][] c = criaMatriz(linha, coluna);
        int [] [] p = inserir(c);
        imprime(p);
        
    }
    
    static int leitor(String msg) {
        boolean caracter = false, menorZero = false;
        int tamanho = 0;

        do {
            try {
                do{
                System.out.print(msg);
                tamanho = Integer.parseInt(leitor.nextLine());
                if (tamanho > 0){
                    menorZero = true;
                }else {
                    System.err.println("Digite um número maior que zero!");
                }
                }while (!menorZero);
                
                caracter = true;

            } catch (NumberFormatException ex) {
                System.err.println("-----------------Entrada inválida-----------------"
                        + " \n                 tente novamente!");
            }
        } while (!caracter);

        return tamanho;
    }
    
    
    static int[][] criaMatriz(int linha, int coluna) {

        int matriz[][] = new int[linha][coluna];
        return matriz;
    }
    static int [] [] inserir (int [] [] matriz){
        
        for (int linha = 0; linha < matriz.length; linha++) {
            
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                
                matriz [linha] [coluna] = 20; 
            }
        }
        return matriz;
    }
    static void imprime (int [] [] matrizPopulada){
        
       for (int linha = 0; linha < matrizPopulada.length; linha++) {
            
            for (int coluna = 0; coluna < matrizPopulada[linha].length; coluna++) {
                
                System.out.print(matrizPopulada [linha] [coluna]+ " ");
                 
            }
            System.out.println(" ");
        } 
        
        
    }
    
}//class
