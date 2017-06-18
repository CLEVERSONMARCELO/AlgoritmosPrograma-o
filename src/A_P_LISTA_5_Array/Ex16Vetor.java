package A_P_LISTA_5_Array;

public class Ex16Vetor {

    public static void main(String[] args) {

        int t = Ex1Vetor.leitorInteiro("Tamanho do vetor: ");
        int[] criaVetor = Ex1Vetor.criaVetor(t);
        int[] pVetor = Ex1Vetor.populaVetor(criaVetor);
        vetificaImprime(pVetor);
    }

    static void vetificaImprime(int[] pVetor) {

        //Arrays.sort(pVetor); //ordena o vetor em ordem crescentes
        
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
