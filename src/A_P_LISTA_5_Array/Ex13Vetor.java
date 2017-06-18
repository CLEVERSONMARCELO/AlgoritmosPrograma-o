package A_P_LISTA_5_Array;

public class Ex13Vetor {

    public static void main(String[] args) {
        
        int tamanho  = Ex1Vetor.leitorInteiro("Tamanho do vetor A e B: ");
        int [] criaVetorA = Ex1Vetor.criaVetor(tamanho);
        int [] criaVetorB = Ex1Vetor.criaVetor(tamanho);
        System.out.println("--- Vetor A ---");
        int [] populaA = Ex1Vetor.populaVetor(criaVetorA);
        System.out.println("--- Vetor B ---");
        int [] populaB = Ex1Vetor.populaVetor(criaVetorB);
        int [] vetorC = vetorC(criaVetorA, criaVetorB);
        int [] populaVetorC = populaC(vetorC, populaA, populaB);
        imprimeVetorC(populaVetorC);
    }

    static int[] vetorC(int[] vetorA, int[] vetorB) {

        int[] vetorC = new int[vetorA.length + vetorB.length];
        System.out.println("");
        return vetorC;
    }

    static int[] populaC(int[] vetorC, int[] vetorA, int[] vetorB) {

        for (int i = 0; i < vetorC.length; i++) {

            if (i < vetorA.length) {

                vetorC[i] = vetorA[i];
                
            } else if (i >= vetorB.length) {

                vetorC[i] = vetorB[i - vetorA.length];
            }
        }
        return vetorC;
    }

    static void imprimeVetorC(int[] vetorC) {
        System.out.println("---- Vetor C ----");

        for (int i = 0; i < vetorC.length; i++) {

            System.out.printf("Posição %d contém: %d ", (i + 1), vetorC[i]);
            System.out.println("");
        }
    }
}
