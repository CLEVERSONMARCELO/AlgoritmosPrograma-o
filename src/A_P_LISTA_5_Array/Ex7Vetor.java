package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex7Vetor {
    public static Scanner leitor  =new Scanner(System.in);
    
    public static void main(String[] args) {
    
        System.out.print("Tamanho do vetor: ");
        int t = leitor();
        System.out.print("Multiplicar elementos do vetor por: ");
        int multiplicação = leitor();
        int [] vetor = cria(t);
        int v = populaMultiplica(multiplicação, vetor);
        imprime(multiplicação, v);
    }

    static int leitor (){
        int t = leitor.nextInt();
        System.out.println("");
        return t;
    }
    
    static int [] cria (int t){
        
        int [] vetor = new int [t];
        return vetor;
    }
    
    static int populaMultiplica (int mult,int [] vetor){
        
        int soma = 0;
        
        for(int i = 0; i < vetor.length; i++){
            
            System.out.printf("Posição %d do vetor recebe: ",i);
            vetor [i] = leitor.nextInt();
            
            soma+=vetor[i];
        }
        
        int multiP = soma *mult;
     
        return multiP;
    }
 
    static void imprime (int multiplica,int multiP){
        System.out.println("");
        System.out.printf("A multipliacação dos elementos do vetor por %d é: %d ",multiplica, multiP);
        
    }
}
