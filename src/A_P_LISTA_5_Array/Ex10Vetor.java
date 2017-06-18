package A_P_LISTA_5_Array;

public class Ex10Vetor {

    public static void main(String[] args) {

        int t = Ex1Vetor.leitorInteiro("Tamanho do vetor: ");
        System.out.print("Multiplicar elementos de posição impar por: ");
        double multiplica = Ex2Vetor.leitor2double();
        double[] vetor = cria(t);
        double soma = populaVerifica(multiplica, vetor);
        imprime(soma);
    }
    
    static double[] cria(int n) {

        double[] vetor = new double[n];
        return vetor;
    }

    static double populaVerifica(double nMultiplica, double[] vetor) {

        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("");
            System.out.printf("Posição %d do vetor recebe: ", i);
            vetor[i] = Ex2Vetor.leitor2double();

            if ((i % 2) != 0) {

                soma += vetor[i] * nMultiplica;
            }
        }
        return soma;
    }

    static void imprime(double soma) {
        
        System.out.println("");

        System.out.printf("O resultado é: %.2f", soma);
    }
    
}//class
