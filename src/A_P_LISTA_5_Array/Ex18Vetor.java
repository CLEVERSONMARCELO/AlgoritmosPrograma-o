package A_P_LISTA_5_Array;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

public class Ex18Vetor {
    public static void main(String[] args) {
        
     int tamanhoVetor = Ex1Vetor.leitorInteiro("Tamanho do vetor: ");
     int numero = Ex1Vetor.leitorInteiro("número inteiro: ");
     int [] criaVetor = Ex9Vetor.cria(tamanhoVetor);
     int [] populaVetor = populaVetor(criaVetor);
        imprime(populaVetor, numero);
    }
    
    static int [] populaVetor(int[] vetor) {
        System.out.println("");
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 0; i < vetor.length; i++) {
                System.out.printf("Posição %d do vetor recebe: ", (i+1));
                vetor[i] = leitor.nextInt();
        }
        return vetor;
    }

    static void imprime(int[] vetorPopulado, int numero) {
        System.out.println("");

        for (int i = 0; i < vetorPopulado.length; i++) {

            if (vetorPopulado[i] == numero) {
                System.out.println("Posição " + (i + 1) + " do vetor contém: " + vetorPopulado[i]
                        + "    <------- número inteiro está nesta posição ");
            }
        }
    }
}
    
    
    

