package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex10Vetor {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int t = leitor("Tamanho do vetor: ");
        double nMultiplica = nmult("Multiplicar impares por: ");
        double[] vetor = cria(t);
        double soma = populaVerifica(nMultiplica, vetor);
        imprime(soma);
    }

    static int leitor(String msg) {

        System.out.print(msg);
        int n = leitor.nextInt();
        return n;
    }

    static double nmult(String msg) {

        System.out.print(msg);
        double nmult = leitor.nextDouble();
        return nmult;
    }

    static double[] cria(int n) {

        double[] vetor = new double[n];
        return vetor;
    }

    static double populaVerifica(double nMultiplica, double[] vetor) {

        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("");
            System.out.printf("Posição %d do vetor recebe: ", (i + 1));
            vetor[i] = leitor.nextDouble();

            if ((vetor[i] % 2)!= 0) {

                soma += vetor[i] * nMultiplica;
            }
        }
        return soma;
    }

    static void imprime(double soma) {
        System.out.println("");
        
        if (soma != 0.0 ){
            
         System.out.printf("O resultado é: %.2f", soma);   
        }else{
            
            System.err.println("Não possuem impares no vetor!!");
        }
    }
}
