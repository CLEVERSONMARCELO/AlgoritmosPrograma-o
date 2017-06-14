package A_P_LISTA_5_Array;

import java.util.Arrays;
public class Ex16Vetor {

    public static void main(String[] args) {

        int t = Ex9Vetor.leitor("Tamanho do vetor: ");
        int[] criaVetor = Ex9Vetor.cria(t);
        int[] pVetor = Ex8Vetor.popula(criaVetor);
        vetificaImprime(pVetor);
    }

    static void vetificaImprime(int[] pVetor) {

        Arrays.sort(pVetor);
        
        for (int i = 0; i < pVetor.length; i++) {
            
            if (pVetor[i] % 2 == 0) {
                
                System.out.println(pVetor[i]);
            }
        }
        for (int j = 0; j < pVetor.length; j++) {
            
            if ((pVetor[j] % 2) != 0) {
                
                System.out.println(pVetor[j]);
            }
        }
    }
}
