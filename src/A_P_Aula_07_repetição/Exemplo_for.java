package A_P_Aula_07_repetição;

import java.util.Scanner;

public class Exemplo_for {
    public static void main(String[] args) {
        
        int x,soma=0;
        
        Scanner leitor = new Scanner (System.in);
        
        for (int i = 0; i < 2 ; i++ ){
            
            System.out.println("Digite o item: " + i);
           
            x = leitor.nextInt();
            
            soma = soma + x;
        }
        System.out.println("Total: " + soma);
        
    }
}
