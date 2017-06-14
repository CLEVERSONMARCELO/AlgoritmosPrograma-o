package FUNÇÕES;

import java.util.Scanner;

public class Exer3 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("---PAR ou IMPAR---\n\nNúmero: ");
        int numero = leitor.nextInt();
        
        verifica(numero);
    }
    
    public static int verifica(int a){
        
        if ((a % 2)==0){
            System.out.println("Número é PAR");
        }else if((a % 2)!=0){
           System.out.println("Número é IMPAR"); 
        }
        
        return a;
        
    }
}
