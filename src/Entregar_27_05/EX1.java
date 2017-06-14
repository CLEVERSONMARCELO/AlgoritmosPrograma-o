package Entregar_27_05;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
    
        int tamanho = tamanhoVetor("Tamanho do vetor: ");
        int [] vetor = vetor1(tamanho);
        int [] popula = populaVetor(vetor);
        int [] copia = vetor2(tamanho, vetor);
        imprimevetor(vetor, copia);
    }
    static int tamanhoVetor(String msg) {
        System.out.println(msg);
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        System.out.println("");
        return t;
    }
    
    static int[] vetor1( int tamanho) {

        int[] vetor1 = new int[tamanho];
        
        return vetor1;
    }
    
    static int [] populaVetor(int [] vetor){
      Scanner leitor = new Scanner(System.in);
      
      for (int i = 0; i < vetor.length; i++){
        
        System.out.print("Posição "+i+" do vetor 1 recebe: ");
        vetor [i] = leitor.nextInt();
          
      }
        System.out.println("");
      return vetor;
    }
    
    static int[] vetor2(int tamanho, int[] vetor1) {

        int[] vetor2 = new int[tamanho];

        for (int i = 0; i < vetor1.length; i++) {

            vetor2[i] = vetor1[i];
        }
        return vetor2;
    }
    
    static void imprimevetor(int[] vetor1, int [] vetor2) {

        System.out.println("Vetor 1");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Posição "+i+" :"+vetor1[i]);
        }
        System.out.println("");
        System.out.println("Vetor 2");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Posição "+i+" :"+vetor2[i]);
        }
    }
}
