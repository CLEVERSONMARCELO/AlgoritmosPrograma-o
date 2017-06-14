package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex17Vetor {
    public static Scanner leitor = new Scanner(System.in);
        
    public static void main(String[] args) {
   
    int t = Ex10Vetor.leitor("Tamanho do vetor: ");
    double numero = Ex10Vetor.nmult("Multiplicar elementos do vetor por: ");
    double [] vetor = Ex10Vetor.cria(t);
    double [] popula =  popula(vetor);
        imprime(popula, numero);
        
    }

    static double[] popula(double[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("");
            System.out.printf("Posição %d do vetor recebe: ", i);
            vetor[i] = leitor.nextDouble();
        }
        return vetor;
    }
    
    static void imprime (double [] popula, double numero ){
        System.out.println("");
        double soma = 0;
        
        for (int i = 0; i < popula.length; i++){
           
            soma += popula[i]*numero;
        }
        System.out.println("O resultado da soma é: "+ soma);
    }
}
