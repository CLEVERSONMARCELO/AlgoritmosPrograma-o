package A_P_LISTA_5_Array;

import Exercicios_entregar06_06.Ex1;

public class Ex2Vetor {
    public static void main(String[] args) {
    
    int tamanho = Ex1Vetor.leitor("Tamanho do vetor: ");
    int [] cria = cria(tamanho);
    int [] popula = popula(cria);
        ImprimeSoma(popula);
    
    
    }    
    
    static int [] cria (int tamanho){
        
     int [] vetor = new int [tamanho];   
        
     return vetor;
    }     
    
    static int [] popula (int [] vetor){
        System.out.println("");
        for (int i =0; i < vetor.length; i++){
            
            System.out.printf("Posição %d recebe: ", i);
            vetor[i] = Ex1.leitor.nextInt();
            
        }
        System.out.println("");
        return vetor;
    }
    
    static void ImprimeSoma(int[] popula) {

        int soma = 0;

        for (int i = 0; i < popula.length; i++) {

            soma += popula[i];
        }
        System.out.println("A soma dos elementos é: " + soma);
    }

}
     
