package A_P_LISTA_5_Array;

public class Ex4Vetor {

    public static void main(String[] args) {

    int t = leitor();
    double [] c = criaVetor(t);
    double pV = populaVerifica(c);
        imprimeMaior(pV);
        
    }

    static int leitor() {
        int tamanho = Ex1Vetor.leitorInteiro("Tamanho do vetor: ");
        System.out.println("");
        return tamanho;
    }

    static double [] criaVetor (int tamanho) {

        double [] vetor = new double [tamanho];
        
        return vetor;
    }

    static double populaVerifica(double[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d do vetor recebe: ", i);
            vetor[i] = Ex2Vetor.leitor2double();
        }

        double menor = vetor[0];

        for (double i : vetor) {

            if (i < menor) {
                menor = i;
            }
        }
        return menor;
    }

    static void imprimeMaior(double menor) {
        System.out.println("O menor elemento do vetor é: " + menor);
    }
}    
