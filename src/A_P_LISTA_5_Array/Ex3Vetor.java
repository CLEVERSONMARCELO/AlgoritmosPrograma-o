package A_P_LISTA_5_Array;

public class Ex3Vetor {

    public static void main(String[] args) {

    int t = Ex1Vetor.leitorInteiro("Tamanho do vetor: ");
    int [] c = criaVetor(t);
    int pV = populaVerifica(c);
        imprimeMaior(pV);
        
    }

    static int[] criaVetor(int tamanho) {

        int[] vetor = new int[tamanho];
        
        return vetor;
    }

    static int populaVerifica(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor recebe: ",i);
            vetor[i] =  Ex1Vetor.leitor2SemMsg();
        }
        
        int maior = vetor [0];
        
        for (int i : vetor) {
        
            if ( i > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    static void imprimeMaior(int maior) {
        System.out.println("O maior elemento do vetor é: " + maior);
    }
}
