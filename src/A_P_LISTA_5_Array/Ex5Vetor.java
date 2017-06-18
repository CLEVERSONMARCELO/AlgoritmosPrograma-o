package A_P_LISTA_5_Array;

public class Ex5Vetor {

    public static void main(String[] args) {
        
        int t = Ex1Vetor.leitorInteiro("Tamanho do vetor: ");
        int [] cria = cria(t);
        double m = media(cria);
        imprimeMedia(m);
    }

    static int[] cria(int tamanho) {

        int[] vetor = new int[tamanho];
        return vetor;
    }

    static double media(int[] vetor) {
        System.out.println("");

        double soma = 0, media;

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor recebe: ", (i+1));
            vetor[i] = Ex1Vetor.leitor2SemMsg();

            soma += vetor[i];
        }
        media = soma / vetor.length;
        
        return media;
    }

    static void imprimeMedia(double media) {
        System.out.println(" ");
        System.out.printf("A média dos elementos do vetor é: %.2f ", media);
    }
}
