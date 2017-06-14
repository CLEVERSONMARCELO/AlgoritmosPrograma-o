package FUNÇÕES;

import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Valor inteiro 1: ");
        int a = leitor.nextInt();
        System.out.print("Valor inteiro 2: ");
        int b = leitor.nextInt();
        
        verifica(a, b);
    }
 
    public static int verifica (int a, int b){
        
        int maior;
        if (a > b){
            maior = a;
        }else {
            maior = b;
        }
        System.out.println("Maior: "+ maior);
        
        return maior;
    }
}
