package A_P_LISTA_5_Array;

public class Ex12Vetor {

    public static void main(String[] args) {

        int tamanho = Ex1Vetor.leitorInteiro("Tamanho dos vetores A e B: ");
        int[] criaVetorA = Ex1Vetor.criaVetor(tamanho);
        int[] criaVetorB = Ex1Vetor.criaVetor(tamanho);
        System.out.println("---- vetor A ----");
        int[] populaA = Ex1Vetor.populaVetor(criaVetorA);
        System.out.println("---- vetor B ----");
        int[] populaB = Ex1Vetor.populaVetor(criaVetorB);
        double mediaA = Media(populaA);
        double mediaB = Media(populaB);
        int somaA = soma(populaA);
        int somaB = soma(populaB);
        ImprimeMaiorSomaMedia(mediaA, somaA, mediaB, somaB);

    }

    static double Media(int[] vetor) {

        double media = 0, soma = 0;

        for (int i = 0; i < vetor.length; i++) {

            soma += vetor[i];
        }

        media = soma / vetor.length;

        return media;
    }

    static int soma(int[] vetor) {

        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {

            soma += vetor[i];

        }
        return soma;
    }

    static void ImprimeMaiorSomaMedia(double mediaA, int somaA, double mediaB, int somaB) {
        System.out.println(" ");
        if (somaA > somaB) {
            System.out.println("Maior soma é a do vetor A: " + somaA);
        } else {
            System.out.println("Maior soma é a do vetor B: " + somaB);
        }
        if (mediaA > mediaB) {
            System.out.printf("Maior média é a do vetor A: %.1f ", mediaA);
        } else {
            System.out.printf("Maior média é a do vetor B: %.1f ", mediaB);
        }
    }

}//class
