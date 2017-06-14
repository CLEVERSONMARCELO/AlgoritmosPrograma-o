package A_P_Aula__12_Arrays;

import java.util.Scanner;

public class VetoresMétodo {
    public static void main(String[] args) {
        
    int lertamanho = leitor("Tamanho do vetor: ");
    int [] vetor = criaVetor(lertamanho);
    int alunos [] = numeroAlunos(vetor);
    int menor = menor(alunos);
    int maior = maior(alunos);
        indicaTamanho(vetor, menor, maior);
        
    }
    
    static int leitor(String msg) {

        Scanner leitor = new Scanner(System.in);

        System.out.println(msg);
        int tamanhoVetor = leitor.nextInt();

        return tamanhoVetor;
    }
    static int[] criaVetor(int tamanho) {

        int[] vetor = new int[tamanho];

        return vetor;
    }
    static int [] numeroAlunos(int []vetor){
      
        Scanner leitort = new Scanner(System.in);
        
        for(int i = 0; i<vetor.length; i++){
            System.out.printf("Idade Aluno %d:  ", i+1);
            vetor [i] = leitort.nextInt();
        }
        return vetor;
    } 
    static int menor ( int [] vetor){
        
        int soma = 0, menor = vetor [0];
        
       for (int i = 0; i < vetor.length; i++) {

            soma += vetor[i];

            if (vetor[i] < menor) 
                menor = vetor[i];
       }
        System.out.println(menor);
            return menor;
        
    }
    static int maior(int[] vetor) {

        int soma = 0, maior = vetor [0];
        
        for (int i = 0; i < vetor.length; i++) {

            soma += vetor[i];

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println(maior);
        return maior;
    }

    static void indicaTamanho (int[] vetor,int menor, int maior){
      
        for (int i = 0; i < vetor.length; i++) {
                System.out.print("v[" + i + "]:" + vetor[i]);

                if (vetor[i] == menor) 
                    System.out.print(" <---- MENOR");
                else if (vetor[i] == maior) 
                    System.out.print(" <---- MAIOR");
                
                System.out.println(" ");
        }  
    }
}