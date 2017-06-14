package Entregar_27_05;



public class EX3 {
    public static void main(String[] args) {
       
        int tamanho1 = EX2.tamanhoVetor("Tamanho do vetor 1:  ");
        int [] Vetor1 = vetor(tamanho1);
        int tamanho2 = EX2.tamanhoVetor("Tamanho do vetor  2:  ");
        int [] vetor2 = vetor(tamanho2);
        
        int [] vetor3 = vetor3(Vetor1, vetor2);
        imprimevetor3(vetor3);
        
    }
    /*Crie uma função para unir dois vetores de mesmo tamanho e 
    mesmo tipo em um terceiro vetor com dobro do tamanho.
    */
    
    static int [] vetor (int tamanho){
        
      int [] vetor = new int [tamanho]; 
      
      for (int i = 0 ; i < vetor.length; i++){
        
          vetor [i] = EX2.tamanhoVetor("Posição "+ i +" do vetor recebe: ");
      }
      System.out.println("--------------------------------------");
       return vetor;
    }

    static int [] vetor3 (int [] vetor1, int [] vetor2){
        
        int[] vetor3 = new int[vetor1.length + vetor2.length];
        
        int cont = 0;
        
        System.out.println("-------------------vetor 3-------------------");
        for (int i = 0; i < vetor3.length; i++){
           
          vetor3 [i] = EX2.tamanhoVetor("Posição "+ i +" do vetor 3 recebe: ");  
           cont++; 
        }
        System.out.println("Tamanho do vetor 3: "+cont);
    
        return vetor3;
        
    } 
    
    static void imprimevetor3 (int vetor[]){
        
        for (int i = 0; i < vetor.length; i++ ){
            
            System.out.println("Posições "+i+" do vetor 3 contém: "+ vetor [i] );
        }
    }
}
