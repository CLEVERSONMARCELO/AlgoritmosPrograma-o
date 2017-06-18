package A_P_LISTA_5_Array;

public class Ex9Vetor {

    public static void main(String[] args) {

        int t = Ex1Vetor.leitorInteiro("Tamanho dos vetores A e B: ");
        int[] vetorA = cria(t);
        int [] vetorB = cria(t);
        System.out.println("----------- Vetor A -----------");
        int [] populaVetorA = popula(vetorA);
        System.out.println("----------- Vetor B -----------");
        int [] populaVetorB = popula(vetorB);
        int [] produto = produto(populaVetorA, populaVetorB);
        imprimeVetor3(produto);
    }

    static int[] cria(int t) {
        int[] vetor = new int[t];
        return vetor;
    }

    static int[] popula (int[] vetor) {
        
        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d recebe: ", (i + 1));
            vetor[i] = Ex1Vetor.leitor2SemMsg();
        }
        System.out.println("");
        return vetor;
    }

    static int[] produto(int[] vetor1, int[] vetor2) {

        int[] vetor3 = new int[vetor1.length];

        for (int i = 0; i < vetor3.length; i++) {

            vetor3[i] = vetor1[i] * vetor2[i];
        }
        return vetor3;
    }

    static void imprimeVetor3(int[] vetor3) {
        System.out.println("");
        
        for (int i = 0; i < vetor3.length; i++) {

            System.out.printf("O produto do elemento de posição %d do vetor A, "
                    + "pelo elemento de posição %d do vetor B é: %d", (i+1),(i+1),vetor3[i]);
            System.out.println(" ");
        }
    }
}