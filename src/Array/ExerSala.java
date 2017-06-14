package Array;

import java.util.Scanner;

public class ExerSala {
    
     public static void main(String[] args){
        int t = tamanhoVetor();
        int[] vetor = criaVetor(t);
        vetor = populaVetor(vetor);
        imprimeVetor(vetor);
    }
    
    static int tamanhoVetor(){
        System.out.println("tamanhoVetor()");
        Scanner input = new Scanner(System.in);
        int t;
        System.out.println("Tamanho: ");
        t = input.nextInt();
        return t;
    }
    
    static int[] criaVetor(int t){
        System.out.println("criaVetor()");
        int[] vetor = new int[t];
        return vetor;
    }
    
    static int[] populaVetor(int[] vetor){
        System.out.println("populaVetor()");
        Scanner input = new Scanner(System.in);
        for(int i=0; i<vetor.length; i++){
            System.out.print("Elemento: ");
            vetor[i] = input.nextInt();
        }
        return vetor;
    }
    
    static void imprimeVetor(int[] vetor){
        System.out.println("imprimeVetor()");
        for(int i=0; i<vetor.length; i++){
            System.out.println("vetor["+i+"]:"+vetor[i]);
        }
    }
} 
        
        
    
    
    
    
    
    
    
    
    
    

